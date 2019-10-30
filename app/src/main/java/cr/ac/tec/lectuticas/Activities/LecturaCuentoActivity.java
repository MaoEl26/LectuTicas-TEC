package cr.ac.tec.lectuticas.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cr.ac.tec.lectuticas.Models.FactoryApp;
import cr.ac.tec.lectuticas.Models.Paragraph;
import cr.ac.tec.lectuticas.Models.Story;
import cr.ac.tec.lectuticas.R;
import cr.ac.tec.lectuticas.Utilities.AnalyticsTracker;
import java.util.ArrayList;


public class LecturaCuentoActivity extends AppCompatActivity {

  private int storyId;
  private Story story;

  private FactoryApp factoryApp;
  private ArrayList<Paragraph> paragraphs;

  private int storyBackgroundRes; // ResId del fondo del story.
  private int storyCharaGifRes;  // ResId de GIF del personaje de story.

  private int counter;
  private AnalyticsTracker analyticsTracker;

  private TextView textViewParagraph;

  private int paragraphsQty;

  private Button previousButton;
  private Button nextButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    try {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_lectura_cuento);

      factoryApp = new FactoryApp();

      analyticsTracker = AnalyticsTracker.getAnalyticsTracker(this.getApplicationContext());

      final Intent intent = getIntent();
      storyId = intent.getIntExtra("id", 0);
      String storyName = intent.getStringExtra("name");

      storyBackgroundRes = intent.getIntExtra("storyBackground", 0);
      storyCharaGifRes = intent.getIntExtra("characterGif", 0);

      // Asigna el fondo del layout recibiendo el identificador de la imagen como extra del Intent.

      RelativeLayout relativeLayout = findViewById(R.id.layoutLecturaCuento);
      if ((relativeLayout != null) && (storyBackgroundRes != 0)) {
        try {
          if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            relativeLayout.setBackground(getDrawable(storyBackgroundRes));
          } else {
            relativeLayout.setBackgroundDrawable(getResources().getDrawable(storyBackgroundRes));
          }
        } catch (Exception e) {
          Log.e("ResourceError", "No se puede asignar el fondo de activity LecturaCuentoActivity.");
        }
      }

      story = new Story(storyName, storyId);

      counter = 0;

      textViewParagraph = findViewById(R.id.textoParrafo);
      paragraphsQty = intent.getIntExtra("number_paragraphs", 0);

      paragraphs = factoryApp.getParagraphs(storyId);
      setParagraphText();

      previousButton = findViewById(R.id.btnAtras);
      nextButton = findViewById(R.id.btnAdelante);
      previousButton.setVisibility(View.INVISIBLE);

      nextButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Log.d("TRIAL", "BUTTON PRESSED");
          if ((counter + 1) < paragraphsQty) {
            ++counter;
            setParagraphText();
            previousButton.setVisibility(View.VISIBLE);
            nextButton.setVisibility(
                ((counter + 1) < paragraphsQty) ? View.VISIBLE : View.INVISIBLE
            );
          }
        }
      });

      previousButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          if (counter > 0) {
            --counter;
            setParagraphText();
            nextButton.setVisibility(View.VISIBLE);
            previousButton.setVisibility(
                (counter > 0) ? View.VISIBLE : View.INVISIBLE
            );
          }
        }
      });

      Button btnMenu = findViewById(R.id.botonMenu);
      if (btnMenu != null) {
        btnMenu.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            volverAMenuPrincipal();
          }
        });
      }

      Button btnPreguntas = findViewById(R.id.btnPreguntas);
      if (btnPreguntas != null) {
        btnPreguntas.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Intent intentGo = new Intent(LecturaCuentoActivity.this,
                PreguntasCuentoActivity.class);
            intentGo.putExtra("storyBackgroundId", storyBackgroundRes);
            intentGo.putExtra("storyId", storyId);
            intentGo.putExtra("storyCharaGifRes", storyCharaGifRes);
            startActivity(intentGo);
          }
        });
      }
    } catch (NumberFormatException e) {
      Log.e("Exception", "Id de historia no tiene formato válido. Dato no existe o es inválido.");
      Toast.makeText
          (getApplicationContext(), getString(R.string.error_iniciarPantallaCuento),
              Toast.LENGTH_LONG).show();
      finish();
    }
  }

  protected void onResume() {
    super.onResume();
    analyticsTracker.trackScreen("LecturaCuentoActivity");
  }

  private void volverAMenuPrincipal() {
    Intent intentMain = new Intent(this, LeyendasActivity.class);
    intentMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intentMain);
    finish();
  }

  public void setParagraphText() { // Asigna el parrafo correspondiente ----------------------------
    textViewParagraph.setText(paragraphs.get(counter).getText());
    textViewParagraph.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
  }
}
