package cr.ac.tec.lectuticas.Models;

import java.util.ArrayList;

import cr.ac.tec.lectuticas.R;

public class FactoryApp {

    private ArrayList<Paragraph> paragraphs;
    private ArrayList<Question> questions;

    public FactoryApp(){}

    public ArrayList<Question> getQuestions(int storyId) {
        questions = new ArrayList<>();
        if (storyId == 1) {// Preguntas y respuestas Cadejo ----------------------------------------
            Question question_1 = new Question(1, R.string.cadejo_pregunta_1);
            Answer a1_q1 = new Answer(1, R.string.cadejo_respuesta_1_1, false);
            Answer a2_q1 = new Answer(2, R.string.cadejo_respuesta_1_2, false);
            Answer a3_q1 = new Answer(3, R.string.cadejo_respuesta_1_3, true);
            question_1.addAnswer(a1_q1);
            question_1.addAnswer(a2_q1);
            question_1.addAnswer(a3_q1);

            Question question_2 = new Question(2, R.string.cadejo_pregunta_2);
            Answer a1_q2 = new Answer(1, R.string.cadejo_respuesta_2_1, false);
            Answer a2_q2 = new Answer(2, R.string.cadejo_respuesta_2_2, true);
            Answer a3_q2 = new Answer(3, R.string.cadejo_respuesta_2_3, false);
            question_2.addAnswer(a1_q2);
            question_2.addAnswer(a2_q2);
            question_2.addAnswer(a3_q2);

            Question question_3 = new Question(3, R.string.cadejo_pregunta_3);
            Answer a1_q3 = new Answer(1, R.string.cadejo_respuesta_3_1, true);
            Answer a2_q3 = new Answer(2, R.string.cadejo_respuesta_3_2, false);
            Answer a3_q3 = new Answer(3, R.string.cadejo_respuesta_3_3, false);
            question_3.addAnswer(a1_q3);
            question_3.addAnswer(a2_q3);
            question_3.addAnswer(a3_q3);

            Question question_4 = new Question(4, R.string.cadejo_pregunta_4);
            Answer a1_q4 = new Answer(1, R.string.cadejo_respuesta_4_1, true);
            Answer a2_q4 = new Answer(2, R.string.cadejo_respuesta_4_2, false);
            Answer a3_q4 = new Answer(3, R.string.cadejo_respuesta_4_3, false);
            question_4.addAnswer(a1_q4);
            question_4.addAnswer(a2_q4);
            question_4.addAnswer(a3_q4);

            Question question_5 = new Question(5, R.string.cadejo_pregunta_5);
            Answer a1_q5 = new Answer(1, R.string.cadejo_respuesta_5_1, false);
            Answer a2_q5 = new Answer(2, R.string.cadejo_respuesta_5_2, false);
            Answer a3_q5 = new Answer(3, R.string.cadejo_respuesta_5_3, true);
            question_5.addAnswer(a1_q5);
            question_5.addAnswer(a2_q5);
            question_5.addAnswer(a3_q5);

            Question question_6 = new Question(6, R.string.cadejo_pregunta_6);
            Answer a1_q6 = new Answer(1, R.string.cadejo_respuesta_6_1, true);
            Answer a2_q6 = new Answer(2, R.string.cadejo_respuesta_6_2, false);
            Answer a3_q6 = new Answer(3, R.string.cadejo_respuesta_6_3, false);
            question_6.addAnswer(a1_q6);
            question_6.addAnswer(a2_q6);
            question_6.addAnswer(a3_q6);

            Question question_7 = new Question(7, R.string.cadejo_pregunta_7);
            Answer a1_q7 = new Answer(1, R.string.cadejo_respuesta_7_1, true);
            Answer a2_q7 = new Answer(2, R.string.cadejo_respuesta_7_2, false);
            Answer a3_q7 = new Answer(3, R.string.cadejo_respuesta_7_3, false);
            question_7.addAnswer(a1_q7);
            question_7.addAnswer(a2_q7);
            question_7.addAnswer(a3_q7);

            Question question_8 = new Question(8, R.string.cadejo_pregunta_8);
            Answer a1_q8 = new Answer(1, R.string.cadejo_respuesta_8_1, false);
            Answer a2_q8 = new Answer(2, R.string.cadejo_respuesta_8_2, false);
            Answer a3_q8 = new Answer(3, R.string.cadejo_respuesta_8_3, true);
            question_8.addAnswer(a1_q8);
            question_8.addAnswer(a2_q8);
            question_8.addAnswer(a3_q8);

            questions.add(question_1);
            questions.add(question_2);
            questions.add(question_3);
            questions.add(question_4);
            questions.add(question_5);
            questions.add(question_6);
            questions.add(question_7);
            questions.add(question_8);
        }
        else if (storyId == 2) { // Preguntas y respuestas Cegua -----------------------------------
            Question question_1 = new Question(1, R.string.cegua_pregunta_1);
            Answer a1_q1 = new Answer(1, R.string.cegua_respuesta_1_1, false);
            Answer a2_q1 = new Answer(2, R.string.cegua_respuesta_1_2, true);
            Answer a3_q1 = new Answer(3, R.string.cegua_respuesta_1_3, false);
            question_1.addAnswer(a1_q1);
            question_1.addAnswer(a2_q1);
            question_1.addAnswer(a3_q1);

            Question question_2 = new Question(2, R.string.cegua_pregunta_2);
            Answer a1_q2 = new Answer(1, R.string.cegua_respuesta_2_1, false);
            Answer a2_q2 = new Answer(2, R.string.cegua_respuesta_2_2, false);
            Answer a3_q2 = new Answer(3, R.string.cegua_respuesta_2_3, true);
            question_2.addAnswer(a1_q2);
            question_2.addAnswer(a2_q2);
            question_2.addAnswer(a3_q2);

            Question question_3 = new Question(3, R.string.cegua_pregunta_3);
            Answer a1_q3 = new Answer(1, R.string.cegua_respuesta_3_1, false);
            Answer a2_q3 = new Answer(2, R.string.cegua_respuesta_3_2, false);
            Answer a3_q3 = new Answer(3, R.string.cegua_respuesta_3_3, true);
            question_3.addAnswer(a1_q3);
            question_3.addAnswer(a2_q3);
            question_3.addAnswer(a3_q3);

            Question question_4 = new Question(4, R.string.cegua_pregunta_4);
            Answer a1_q4 = new Answer(1, R.string.cegua_respuesta_4_1, true);
            Answer a2_q4 = new Answer(2, R.string.cegua_respuesta_4_2, false);
            Answer a3_q4 = new Answer(3, R.string.cegua_respuesta_4_3, false);
            question_4.addAnswer(a1_q4);
            question_4.addAnswer(a2_q4);
            question_4.addAnswer(a3_q4);

            Question question_5 = new Question(5, R.string.cegua_pregunta_5);
            Answer a1_q5 = new Answer(1, R.string.cegua_respuesta_5_1, true);
            Answer a2_q5 = new Answer(2, R.string.cegua_respuesta_5_2, false);
            Answer a3_q5 = new Answer(3, R.string.cegua_respuesta_5_3, false);
            question_5.addAnswer(a1_q5);
            question_5.addAnswer(a2_q5);
            question_5.addAnswer(a3_q5);

            Question question_6 = new Question(6, R.string.cegua_pregunta_6);
            Answer a1_q6 = new Answer(1, R.string.cegua_respuesta_6_1, false);
            Answer a2_q6 = new Answer(2, R.string.cegua_respuesta_6_2, true);
            Answer a3_q6 = new Answer(3, R.string.cegua_respuesta_6_3, false);
            question_6.addAnswer(a1_q6);
            question_6.addAnswer(a2_q6);
            question_6.addAnswer(a3_q6);

            Question question_7 = new Question(7, R.string.cegua_pregunta_7);
            Answer a1_q7 = new Answer(1, R.string.cegua_respuesta_7_1, false);
            Answer a2_q7 = new Answer(2, R.string.cegua_respuesta_7_2, false);
            Answer a3_q7 = new Answer(3, R.string.cegua_respuesta_7_3, true);
            question_7.addAnswer(a1_q7);
            question_7.addAnswer(a2_q7);
            question_7.addAnswer(a3_q7);

            Question question_8 = new Question(8, R.string.cegua_pregunta_8);
            Answer a1_q8 = new Answer(1, R.string.cegua_respuesta_8_1, false);
            Answer a2_q8 = new Answer(2, R.string.cegua_respuesta_8_2, true);
            Answer a3_q8 = new Answer(3, R.string.cegua_respuesta_8_3, false);
            question_8.addAnswer(a1_q8);
            question_8.addAnswer(a2_q8);
            question_8.addAnswer(a3_q8);

            questions.add(question_1);
            questions.add(question_2);
            questions.add(question_3);
            questions.add(question_4);
            questions.add(question_5);
            questions.add(question_6);
            questions.add(question_7);
            questions.add(question_8);
        }

        else if (storyId == 3) { // Preguntas y respuestas Carreta sin bueyes ----------------------
            Question question_1 = new Question(1, R.string.carreta_pregunta_1);
            Answer a1_q1 = new Answer(1, R.string.carreta_respuesta_1_1, false);
            Answer a2_q1 = new Answer(2, R.string.carreta_respuesta_1_2, false);
            Answer a3_q1 = new Answer(3, R.string.carreta_respuesta_1_3, true);
            question_1.addAnswer(a1_q1);
            question_1.addAnswer(a2_q1);
            question_1.addAnswer(a3_q1);

            Question question_2 = new Question(2, R.string.carreta_pregunta_2);
            Answer a1_q2 = new Answer(1, R.string.carreta_respuesta_2_1, true);
            Answer a2_q2 = new Answer(2, R.string.carreta_respuesta_2_2, false);
            Answer a3_q2 = new Answer(3, R.string.carreta_respuesta_2_3, false);
            question_2.addAnswer(a1_q2);
            question_2.addAnswer(a2_q2);
            question_2.addAnswer(a3_q2);

            Question question_3 = new Question(3, R.string.carreta_pregunta_3);
            Answer a1_q3 = new Answer(1, R.string.carreta_respuesta_3_1, false);
            Answer a2_q3 = new Answer(2, R.string.carreta_respuesta_3_2, false);
            Answer a3_q3 = new Answer(3, R.string.carreta_respuesta_3_3, true);
            question_3.addAnswer(a1_q3);
            question_3.addAnswer(a2_q3);
            question_3.addAnswer(a3_q3);

            Question question_4 = new Question(4, R.string.carreta_pregunta_4);
            Answer a1_q4 = new Answer(1, R.string.carreta_respuesta_4_1, false);
            Answer a2_q4 = new Answer(2, R.string.carreta_respuesta_4_2, true);
            Answer a3_q4 = new Answer(3, R.string.carreta_respuesta_4_3, false);
            question_4.addAnswer(a1_q4);
            question_4.addAnswer(a2_q4);
            question_4.addAnswer(a3_q4);

            Question question_5 = new Question(5, R.string.carreta_pregunta_5);
            Answer a1_q5 = new Answer(1, R.string.carreta_respuesta_5_1, false);
            Answer a2_q5 = new Answer(2, R.string.carreta_respuesta_5_2, false);
            Answer a3_q5 = new Answer(3, R.string.carreta_respuesta_5_3, true);
            question_5.addAnswer(a1_q5);
            question_5.addAnswer(a2_q5);
            question_5.addAnswer(a3_q5);

            Question question_6 = new Question(6, R.string.carreta_pregunta_6);
            Answer a1_q6 = new Answer(1, R.string.carreta_respuesta_6_1, false);
            Answer a2_q6 = new Answer(2, R.string.carreta_respuesta_6_2, true);
            Answer a3_q6 = new Answer(3, R.string.carreta_respuesta_6_3, false);
            question_6.addAnswer(a1_q6);
            question_6.addAnswer(a2_q6);
            question_6.addAnswer(a3_q6);

            Question question_7 = new Question(7, R.string.carreta_pregunta_7);
            Answer a1_q7 = new Answer(1, R.string.carreta_respuesta_7_1, true);
            Answer a2_q7 = new Answer(2, R.string.carreta_respuesta_7_2, false);
            Answer a3_q7 = new Answer(3, R.string.carreta_respuesta_7_3, false);
            question_7.addAnswer(a1_q7);
            question_7.addAnswer(a2_q7);
            question_7.addAnswer(a3_q7);

            Question question_8 = new Question(8, R.string.carreta_pregunta_8);
            Answer a1_q8 = new Answer(1, R.string.carreta_respuesta_8_1, false);
            Answer a2_q8 = new Answer(2, R.string.carreta_respuesta_8_2, true);
            Answer a3_q8 = new Answer(3, R.string.carreta_respuesta_8_3, false);
            question_8.addAnswer(a1_q8);
            question_8.addAnswer(a2_q8);
            question_8.addAnswer(a3_q8);

            questions.add(question_1);
            questions.add(question_2);
            questions.add(question_3);
            questions.add(question_4);
            questions.add(question_5);
            questions.add(question_6);
            questions.add(question_7);
            questions.add(question_8);
        }

        else if (storyId == 4) { // Preguntas y respuestas Llorona ---------------------------------
            Question question_1 = new Question(1, R.string.llorona_pregunta_1);
            Answer a1_q1 = new Answer(1, R.string.llorona_respuesta_1_1, true);
            Answer a2_q1 = new Answer(2, R.string.llorona_respuesta_1_2, false);
            Answer a3_q1 = new Answer(3, R.string.llorona_respuesta_1_3, false);
            question_1.addAnswer(a1_q1);
            question_1.addAnswer(a2_q1);
            question_1.addAnswer(a3_q1);

            Question question_2 = new Question(2, R.string.llorona_pregunta_2);
            Answer a1_q2 = new Answer(1, R.string.llorona_respuesta_2_1, false);
            Answer a2_q2 = new Answer(2, R.string.llorona_respuesta_2_2, false);
            Answer a3_q2 = new Answer(3, R.string.llorona_respuesta_2_3, true);
            question_2.addAnswer(a1_q2);
            question_2.addAnswer(a2_q2);
            question_2.addAnswer(a3_q2);

            Question question_3 = new Question(3, R.string.llorona_pregunta_3);
            Answer a1_q3 = new Answer(1, R.string.llorona_respuesta_3_1, false);
            Answer a2_q3 = new Answer(2, R.string.llorona_respuesta_3_2, false);
            Answer a3_q3 = new Answer(3, R.string.llorona_respuesta_3_3, true);
            question_3.addAnswer(a1_q3);
            question_3.addAnswer(a2_q3);
            question_3.addAnswer(a3_q3);

            Question question_4 = new Question(4, R.string.llorona_pregunta_4);
            Answer a1_q4 = new Answer(1, R.string.llorona_respuesta_4_1, false);
            Answer a2_q4 = new Answer(2, R.string.llorona_respuesta_4_2, true);
            Answer a3_q4 = new Answer(3, R.string.llorona_respuesta_4_3, false);
            question_4.addAnswer(a1_q4);
            question_4.addAnswer(a2_q4);
            question_4.addAnswer(a3_q4);

            Question question_5 = new Question(5, R.string.llorona_pregunta_5);
            Answer a1_q5 = new Answer(1, R.string.llorona_respuesta_5_1, false);
            Answer a2_q5 = new Answer(2, R.string.llorona_respuesta_5_2, true);
            Answer a3_q5 = new Answer(3, R.string.llorona_respuesta_5_3, false);
            question_5.addAnswer(a1_q5);
            question_5.addAnswer(a2_q5);
            question_5.addAnswer(a3_q5);

            Question question_6 = new Question(6, R.string.llorona_pregunta_6);
            Answer a1_q6 = new Answer(1, R.string.llorona_respuesta_6_1, false);
            Answer a2_q6 = new Answer(2, R.string.llorona_respuesta_6_2, false);
            Answer a3_q6 = new Answer(3, R.string.llorona_respuesta_6_3, true);
            question_6.addAnswer(a1_q6);
            question_6.addAnswer(a2_q6);
            question_6.addAnswer(a3_q6);

            Question question_7 = new Question(7, R.string.llorona_pregunta_7);
            Answer a1_q7 = new Answer(1, R.string.llorona_respuesta_7_1, true);
            Answer a2_q7 = new Answer(2, R.string.llorona_respuesta_7_2, false);
            Answer a3_q7 = new Answer(3, R.string.llorona_respuesta_7_3, false);
            question_7.addAnswer(a1_q7);
            question_7.addAnswer(a2_q7);
            question_7.addAnswer(a3_q7);

            Question question_8 = new Question(8, R.string.llorona_pregunta_8);
            Answer a1_q8 = new Answer(1, R.string.llorona_respuesta_8_1, false);
            Answer a2_q8 = new Answer(2, R.string.llorona_respuesta_8_2, false);
            Answer a3_q8 = new Answer(3, R.string.llorona_respuesta_8_3, true);
            question_8.addAnswer(a1_q8);
            question_8.addAnswer(a2_q8);
            question_8.addAnswer(a3_q8);

            questions.add(question_1);
            questions.add(question_2);
            questions.add(question_3);
            questions.add(question_4);
            questions.add(question_5);
            questions.add(question_6);
            questions.add(question_7);
            questions.add(question_8);
        }

        return questions;
    }

    public ArrayList<Paragraph> getParagraphs(int storyId) {
        paragraphs = new ArrayList<>();
        if (storyId == 1) { // Parrafos Cadejo -----------------------------------------------------
            Paragraph paragraph_1 = new Paragraph(R.string.cadejo_paragraph_1, 1);
            Paragraph paragraph_2 = new Paragraph(R.string.cadejo_paragraph_2, 2);
            Paragraph paragraph_3 = new Paragraph(R.string.cadejo_paragraph_3, 3);
            Paragraph paragraph_4 = new Paragraph(R.string.cadejo_paragraph_4, 4);
            Paragraph paragraph_5 = new Paragraph(R.string.cadejo_paragraph_5, 5);
            Paragraph paragraph_6 = new Paragraph(R.string.cadejo_paragraph_6, 6);
            Paragraph paragraph_7 = new Paragraph(R.string.cadejo_paragraph_7, 7);
            Paragraph paragraph_8 = new Paragraph(R.string.cadejo_paragraph_8, 8);
            Paragraph paragraph_9 = new Paragraph(R.string.cadejo_paragraph_9, 9);
            Paragraph paragraph_10 = new Paragraph(R.string.cadejo_paragraph_10, 10);
            Paragraph paragraph_11 = new Paragraph(R.string.cadejo_paragraph_11, 11);
            Paragraph paragraph_12 = new Paragraph(R.string.cadejo_paragraph_12, 12);
            Paragraph paragraph_13 = new Paragraph(R.string.cadejo_paragraph_13, 13);
            paragraphs.add(paragraph_1);
            paragraphs.add(paragraph_2);
            paragraphs.add(paragraph_3);
            paragraphs.add(paragraph_4);
            paragraphs.add(paragraph_5);
            paragraphs.add(paragraph_6);
            paragraphs.add(paragraph_7);
            paragraphs.add(paragraph_8);
            paragraphs.add(paragraph_9);
            paragraphs.add(paragraph_10);
            paragraphs.add(paragraph_11);
            paragraphs.add(paragraph_12);
            paragraphs.add(paragraph_13);
        }
        else if (storyId == 2) { // Parrafos Cegua -------------------------------------------------
            Paragraph paragraph_1 = new Paragraph(R.string.cegua_paragraph_1, 1);
            Paragraph paragraph_2 = new Paragraph(R.string.cegua_paragraph_2, 2);
            Paragraph paragraph_3 = new Paragraph(R.string.cegua_paragraph_3, 3);
            Paragraph paragraph_4 = new Paragraph(R.string.cegua_paragraph_4, 4);
            Paragraph paragraph_5 = new Paragraph(R.string.cegua_paragraph_5, 5);
            Paragraph paragraph_6 = new Paragraph(R.string.cegua_paragraph_6, 6);
            Paragraph paragraph_7 = new Paragraph(R.string.cegua_paragraph_7, 7);
            Paragraph paragraph_8 = new Paragraph(R.string.cegua_paragraph_8, 8);
            Paragraph paragraph_9 = new Paragraph(R.string.cegua_paragraph_9, 9);
            Paragraph paragraph_10 = new Paragraph(R.string.cegua_paragraph_10, 10);
            Paragraph paragraph_11 = new Paragraph(R.string.cegua_paragraph_11, 11);
            Paragraph paragraph_12 = new Paragraph(R.string.cegua_paragraph_12, 12);
            Paragraph paragraph_13 = new Paragraph(R.string.cegua_paragraph_13, 13);
            paragraphs.add(paragraph_1);
            paragraphs.add(paragraph_2);
            paragraphs.add(paragraph_3);
            paragraphs.add(paragraph_4);
            paragraphs.add(paragraph_5);
            paragraphs.add(paragraph_6);
            paragraphs.add(paragraph_7);
            paragraphs.add(paragraph_8);
            paragraphs.add(paragraph_9);
            paragraphs.add(paragraph_10);
            paragraphs.add(paragraph_11);
            paragraphs.add(paragraph_12);
            paragraphs.add(paragraph_13);
        }

        else if (storyId == 3) { // Parrafos Carreta sin bueyes ------------------------------------
            Paragraph paragraph_1 = new Paragraph(R.string.carreta_paragraph_1, 1);
            Paragraph paragraph_2 = new Paragraph(R.string.carreta_paragraph_2, 2);
            Paragraph paragraph_3 = new Paragraph(R.string.carreta_paragraph_3, 3);
            Paragraph paragraph_4 = new Paragraph(R.string.carreta_paragraph_4, 4);
            Paragraph paragraph_5 = new Paragraph(R.string.carreta_paragraph_5, 5);
            Paragraph paragraph_6 = new Paragraph(R.string.carreta_paragraph_6, 6);
            Paragraph paragraph_7 = new Paragraph(R.string.carreta_paragraph_7, 7);
            Paragraph paragraph_8 = new Paragraph(R.string.carreta_paragraph_8, 8);
            Paragraph paragraph_9 = new Paragraph(R.string.carreta_paragraph_9, 9);
            paragraphs.add(paragraph_1);
            paragraphs.add(paragraph_2);
            paragraphs.add(paragraph_3);
            paragraphs.add(paragraph_4);
            paragraphs.add(paragraph_5);
            paragraphs.add(paragraph_6);
            paragraphs.add(paragraph_7);
            paragraphs.add(paragraph_8);
            paragraphs.add(paragraph_9);
        }

        else if (storyId == 4) { // Parrafos Llorona -----------------------------------------------
            Paragraph paragraph_1 = new Paragraph(R.string.llorona_paragraph_1, 1);
            Paragraph paragraph_2 = new Paragraph(R.string.llorona_paragraph_2, 2);
            Paragraph paragraph_3 = new Paragraph(R.string.llorona_paragraph_3, 3);
            Paragraph paragraph_4 = new Paragraph(R.string.llorona_paragraph_4, 4);
            Paragraph paragraph_5 = new Paragraph(R.string.llorona_paragraph_5, 5);
            Paragraph paragraph_6 = new Paragraph(R.string.llorona_paragraph_6, 6);
            Paragraph paragraph_7 = new Paragraph(R.string.llorona_paragraph_7, 7);
            paragraphs.add(paragraph_1);
            paragraphs.add(paragraph_2);
            paragraphs.add(paragraph_3);
            paragraphs.add(paragraph_4);
            paragraphs.add(paragraph_5);
            paragraphs.add(paragraph_6);
            paragraphs.add(paragraph_7);
        }

        return paragraphs;
    }
}
