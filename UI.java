import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        interaction.setBounds(x, y, w, h);
        interaction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interaction.setLayout(null);
        

        interaction.add(setButton((int) (0.2 * w), (int) (0.7 * h), (int) (0.6 * w), (int) (0.1 * h)));
        interaction.add(setServerLabel(0, 0, w, h));
        //interaction.add(setEditor((int) (x + (0.1 * x)), (int) (y + (0.5 * y)), (int) 0.1 * h, (int) 0.9 * w));
        //interaction.add(setPasswordField(x, y, h, w));
        
        interaction.setVisible(true);
    }

    public JButton setButton(int x, int y, int w, int h) {
        JButton accept = new JButton("ANMELDEN");
        accept.setBounds(x, y, w, h);
        return accept;
    }

    public JTextField setEditor(int x, int y, int w, int h) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, w, h);
        return textField;
    }

    public JPasswordField setPasswordField(int x, int y, int w, int h) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, w, h);
        return passwordField;
    }

    public JLabel setServerLabel(int x, int y, int w, int h) {
        BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        try {
            bi = ImageIO.read(getClass().getResource("/Server2.png"));
        } catch(IOException e) {}
        ImageIcon i = new ImageIcon(bi.getScaledInstance(w, h, Image.SCALE_AREA_AVERAGING));

        JLabel serverLabel = new JLabel(i);
        serverLabel.setBounds(x, y, i.getIconWidth(), i.getIconHeight());
        return serverLabel;
    }
}