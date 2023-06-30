package GUI;

import fun.LoginFUN;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {

    private JPanel login;
    private JTextField userField;
    private JPasswordField passField;
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
                String username = userField.getText();
                String password = passField.getText();
                int type=0;//用户类型，默认为普通用户，当复选框选中时变为1
                if(AdminCheckBox.isSelected()){
                    type=1;
                }
                boolean islogin = false ;//是否成功登录,初始为失败
                islogin = new LoginFUN().loginfun(type,username,password);
                if(islogin&&type==0){
                    UserGUI.show();

                }else if(islogin){

                }else {

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
