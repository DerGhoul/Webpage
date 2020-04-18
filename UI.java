import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class UI {

    public static void main() {
        
    }

    public UI() {
        setFrame();
    }

    public void setFrame() {
        int x, y, h, w;

        x = 100;
        y = 100;
        w = 100;
        h = 100;

        JFrame interaction = new JFrame();
        interaction.setBounds(x, y, h, w);
        interaction.setVisible(true);

        setButton((int) 0.05*x, y, (int) 0.01*h, (int) 0.01*h);
        setEditor((int) (x+(0.1*x)), (int) (y+(0.5*y)), (int) 0.1*h, (int) 0.9*w);
        setPasswordField(x, y, h, w);
    }

    public void setButton(int x, int y, int h, int w) {
        JButton accept = new JButton();
        accept.setBounds(x,y,h,w);
        accept.setVisible(true);
    }

    public void setEditor(int x, int y, int h, int w) {
        JTextField textField = new JTextField();
        textField.setBounds(x,y,h,w);
        textField.setVisible(true);
    }

    public void setPasswordField(int x, int y, int h, int w) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x,y,h,w);
        passwordField.setVisible(true);

    }
}