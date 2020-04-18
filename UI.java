import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UI {

    public static void main(String[] args) {
        new UI();
    }

    public UI() {
        setFrame();
    }

    public void setFrame() {
        int x, y, h, w;

        x = 100;
        y = 100;
        w = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
        h = Toolkit.getDefaultToolkit().getScreenSize().height / 2;

        JFrame interaction = new JFrame();
        interaction.setBounds(x, y, h, w);
        interaction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interaction.setVisible(true);

        interaction.add(setButton((int) 0.05 * x, y, (int) 0.01 * h, (int) 0.01 * h));
        interaction.add(setEditor((int) (x + (0.1 * x)), (int) (y + (0.5 * y)), (int) 0.1 * h, (int) 0.9 * w));
        interaction.add(setPasswordField(x, y, h, w));

    }

    public JButton setButton(int x, int y, int w, int h) {
        JButton accept = new JButton();
        accept.setBounds(x, y, w, h);
        return accept;
    }

    public JTextField setEditor(int x, int y, int w, int h) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, w, h);
        return textField;
    }

    public JPasswordField setPasswordField(int x, int y, int h, int w) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, w, h);
        return passwordField;
    }
}