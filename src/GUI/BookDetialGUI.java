package GUI;

import javax.swing.*;

public class BookDetialGUI {
    private JPanel detail;
    private JButton 加入书架Button;
    private JButton 借阅Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BookDetialGUI");
        frame.setContentPane(new BookDetialGUI().detail);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
