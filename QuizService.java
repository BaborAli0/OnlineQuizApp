package service;

import model.Question;
import javax.swing.*;
import java.util.List;

public class QuizService {
    private List<Question> questions;
    private int score;

    public QuizService() {
        this.score = 0;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void takeQuiz() {
        for (Question question : questions) {
            String userAnswer = (String) JOptionPane.showInputDialog(
                    null,
                    question.getQuestionText(),
                    "Quiz",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    question.getOptions(),
                    question.getOptions()[0] // Default selection
            );

            if (userAnswer != null && userAnswer.equals(question.getOptions()[question.getCorrectAnswerIndex()])) {
                score++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quiz Finished! Your score is: " + score + "/" + questions.size());
    }
}
