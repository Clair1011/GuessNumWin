package Win;

import javax.swing.*;
import java.awt.*;

public class GuessNumWin extends JFrame {
    private JTextField input;
    private JButton guess;
    private JTextArea log;

    public GuessNumWin() {
        super("猜數字遊戲");
        setLayout(new BorderLayout());
        JPanel topLine = new JPanel(new BorderLayout());
        input = new JTextField(); guess = new JButton("猜");
        topLine.add(input,BorderLayout.CENTER); topLine.add(guess, BorderLayout.EAST);

        add(topLine, BorderLayout.NORTH);

        log = new JTextArea();
        add(log, BorderLayout.CENTER);

        setSize(800,640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new GuessNumWin();
    }
}
