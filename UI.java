import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class UI {

    public static void main() {
        
    }
    public UI(){
        setFrame();
    }
    public void setFrame(){
        double x,y,h,w;

        JFrame interaction = new JFrame();
        interaction.setVisible(true);
        x = interaction.getBounds().getX();
        y = interaction.getBounds().getY();
        h = interaction.getBounds().getHeight();
        w = interaction.getBounds().getWidth();
        
        
        interaction.setBounds((double)x,(double)y,(double)h,(double)w);
        setButton(0.05*x, y, 0.01*h, 0.01*h);
        setEditor(x+(0.1*x), y+(0.5*y), 0.1*h, 0.9*w);
        setPasswordField(x, y, h, w);
    }
    public void setButton(double x,double y,double h,double w){
        JButton accept = new JButton();
        accept.setBounds(x,y,h,w);
        accept.setVisible(true);
    }
    public void setEditor(double x,double y,double h,double w){
        JTextField textField = new JTextField();
        textField.setBounds(x,y,h,w);
        textField.setVisible(true);
    }
    public void setPasswordField(double x,double y,double h,double w){
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x,y,h,w);
        passwordField.setVisible(true);

    }
}