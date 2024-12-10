package main;

import service.QuizService;
import service.UserService;
import service.FileService;
import model.Question;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main extends JFrame {
    private UserService userService;
    private QuizService quizService;

    public Main() {
        userService = new UserService();
        quizService = new QuizService();


        FileService fileService = new FileService();
        List<Question> questions = fileService.loadQuestions();
        quizService.setQuestions(questions);


        setTitle("Main Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label for Title
        JLabel menuLabel = new JLabel("*** Main Menu ***", JLabel.CENTER);
        menuLabel.setFont(new Font("Arial", Font.BOLD, 40)); // Change title font
        add(menuLabel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 10));

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setPreferredSize(new Dimension(100, 100));  // Adjust button size
        registerButton.setFont(new Font("Arial", Font.PLAIN, 22)); // Set font for button

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(100, 100));  // Adjust button size
        loginButton.setFont(new Font("Arial", Font.PLAIN, 22)); // Set font for button

        // Quiz Button
        JButton quizButton = new JButton("Take Quiz");
        quizButton.setPreferredSize(new Dimension(100, 100));  // Adjust button size
        quizButton.setFont(new Font("Arial", Font.PLAIN, 22)); // Set font for button

        // Exit Button
        JButton exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(100, 100));  // Adjust button size
        exitButton.setFont(new Font("Arial", Font.PLAIN, 22)); // Set font for button

        buttonPanel.add(registerButton);
        buttonPanel.add(loginButton);
        buttonPanel.add(quizButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.CENTER);

        // Register Action
        registerButton.addActionListener(e -> {
            String username = JOptionPane.showInputDialog("Enter username: ");
            String password = JOptionPane.showInputDialog("Enter password: ");
            String isAdmin = JOptionPane.showInputDialog("Is this an admin account? (yes/no): ");
            boolean isAdminBool = isAdmin.equalsIgnoreCase("yes");

            userService.register(username, password, isAdminBool);
            JOptionPane.showMessageDialog(null, "Registration complete!");
        });

        // Login Action
        loginButton.addActionListener(e -> {
            String username = JOptionPane.showInputDialog("Enter username: ");
            String password = JOptionPane.showInputDialog("Enter password: ");

            if (userService.login(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Login failed!");
            }
        });

        // Quiz Action
        quizButton.addActionListener(e -> {
            if (userService.getLoggedInUser() != null) {
                quizService.takeQuiz();
            } else {
                JOptionPane.showMessageDialog(null, "Please login first to take the quiz.");
            }
        });

        // Exit Action
        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
