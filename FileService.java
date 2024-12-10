package service;

import model.Question;
import java.io.*;
import java.util.*;

public class FileService {
    private static final String FILE_PATH = "questions.txt";  

    public List<Question> loadQuestions() {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String questionText = parts[0];
                String[] options = Arrays.copyOfRange(parts, 1, 5);  
                int correctAnswerIndex = Integer.parseInt(parts[5]);
                questions.add(new Question(questionText, options, correctAnswerIndex));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return questions;
    }


    public void saveQuestions(List<Question> questions) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Question question : questions) {
                String[] options = question.getOptions();
                bw.write(question.getQuestionText() + ";" +
                        String.join(";", options) + ";" +
                        question.getCorrectAnswerIndex());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
