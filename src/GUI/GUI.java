package GUI;

import javax.swing.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("החלון שלי");
        JButton button = new JButton("תלחץ עליי");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "כפתור נלחץ!");
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
