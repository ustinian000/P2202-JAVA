package GUI;

import javax.swing.*;

public class LoginGUI {
    private JPanel login;
    private JTextField PassField;
    private JPasswordField passwordField;
    private JButton 登录Button;
    private JLabel username;
    private JLabel password;
    private JCheckBox AdminCheckBox;
    private JLabel Register;
    private JLabel Retrieve;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginGUI");
        frame.setContentPane(new LoginGUI().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
