package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import fun.LoginFUN;
public class LoginGUI {
    private JPanel login;
    private JTextField PassField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel username;
    private JLabel password;
    private JCheckBox AdminCheckBox;
    private JLabel Register;
    private JLabel Retrieve;
    public LoginGUI(){
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(new LoginFUN().loginfun(1,"1750000000","111111")){
                    System.out.println("登录成功");
                }else {
                    System.out.println("登录失败");
                }
            }
        });
    }


    public static void show() {
        JFrame frame = new JFrame("LoginGUI");
        frame.setContentPane(new LoginGUI().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
