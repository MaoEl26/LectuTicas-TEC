package cr.ac.tec.lectuticas.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import cr.ac.tec.lectuticas.Models.Answer;
import cr.ac.tec.lectuticas.Models.FactoryApp;
import cr.ac.tec.lectuticas.Models.Question;
import cr.ac.tec.lectuticas.R;
import java.util.ArrayList;


public class PreguntasCuentoActivity extends AppCompatActivity {

  private int storyId;
  private int storyBackgroundId;
  private int questionCounter = 0;
  private int correctAnswersCount = 0;
  private ArrayList<Question> questions = new ArrayList<Question>();
  private ArrayList<Answer> currentAnswers;
  private RadioGroup answersRadioGroup;
  private Question currentQuestion;
  private TextView textViewQuestion;
  private Button nextBtn;
  private FactoryApp factoryApp;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_preguntas_cuento);

    factoryApp = new FactoryApp();

    Intent intent = getIntent();

    storyId = intent.getIntExtra("storyId", 0);

    storyBackgroundId = intent.getIntExtra("storyBackgroundId", 0);
    RelativeLayout relativeLayout = findViewById(R.id.layoutPreguntasLectura);

    if ((relativeLayout != null) && (storyBackgroundId != 0)) {
      try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
          relativeLayout.setBackground(getDrawable(storyBackgroundId));
        } else {
          relativeLayout.setBackgroundDrawable(getResources().getDrawable(storyBackgroundId));
        }
      } catch (Exception e) {
        Log.e("ResourceError", "No se puede asignar el fondo de activity " +
            "PreguntasCuentoActivity.");
        e.printStackTrace();
      }
    }

    Button botonMenu = findViewById(R.id.botonMenu);
    if (botonMenu != null) {
      botonMenu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          closeActivity();
        }
      });
    }

    questions = factoryApp.getQuestions(storyId);

    currentQuestion = factoryApp.getQuestions(storyId).get(questionCounter);

    currentAnswers = currentQuestion.getAllAnswers();

    textViewQuestion = findViewById(R.id.tvPregunta);

    setQuestionText();

    answersRadioGroup = findViewById(R.id.conjunto);
    showAnswersInView();

    nextBtn = findViewById(R.id.btnPreguntaSiguiente);

    if (nextBtn != null) {
      nextBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          checkSelectedAnswer();
          answersRadioGroup.clearCheck();
        }
      });
    }
  }

  private void checkSelectedAnswer() {
    Log.d("ANTES", "------------------");
    if (answersRadioGroup.getCheckedRadioButtonId() >= 0) {
      Log.d("ENTRE IF-", "----------------");
      int id = answersRadioGroup.getCheckedRadioButtonId();
      RadioButton rb = findViewById(id);
      String selectedAnswer = null;
      if (rb != null) {
        selectedAnswer = rb.getText().toString();
      }
      for (Answer answer : currentAnswers) {
        //Log.d("Answer: ", answer.getText());
        Log.d("Selected: ", selectedAnswer);
        if ((id + 1) == answer.getId()) {
          if (answer.isCorrect()) {
            correctAnswersCount += 1;
          }
        }
      }
      if (questionCounter + 1 < questions.size()) {
        switchToNextQuestion();

      } else {
        finishQuiz();
      }
    } else {
      Log.d("ENTRE ELSE", "--------------");
      Toast.makeText(PreguntasCuentoActivity.this,
          getString(R.string.answer_not_selected_prompt), Toast.LENGTH_LONG).show();
    }
  }

  public void setQuestionText()
  {
    textViewQuestion.setText(currentQuestion.getText());
  }

  private void closeActivity() {
    Intent intentMain = new Intent(this, LeyendasActivity.class);
    intentMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intentMain);
    finish();
  }

  private void switchToNextQuestion() {
    ++questionCounter;

    // Change button text when reached last question.
    if (questionCounter + 1 == questions.size()) {
      nextBtn.setText(getString(R.string.check_quiz_results));
    }

    currentQuestion = questions.get(questionCounter);
    currentAnswers = currentQuestion.getAllAnswers();
    textViewQuestion.setText(currentQuestion.getText());

    showAnswersInView();
  }

  private void showAnswersInView() {
    answersRadioGroup.removeAllViews();

    for (int option = 0; option < currentAnswers.size(); option++) {
      RadioButton rb = (RadioButton) getLayoutInflater().inflate(
          R.layout.radiobutton_style, null);
      rb.setId(option);
      rb.setText(currentAnswers.get(option).getText());
      rb.setChecked(false);
      answersRadioGroup.addView(rb);
    }
  }

  private void finishQuiz() {
    Log.d("ERROR", Integer.toString(questions.size()));
    Intent intentNext = new Intent(PreguntasCuentoActivity.this,
        ResultadoPreguntasActivity.class);
    String correctAnswers = String.valueOf(correctAnswersCount);
    intentNext.putExtra("correctAnswers", correctAnswers);
    intentNext.putExtra("questionsCount", String.valueOf(questions.size()));
    intentNext.putExtra("storyBackgroundId", storyBackgroundId);

    finish();
    startActivity(intentNext);
  }


}
