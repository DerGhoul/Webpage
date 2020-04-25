import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.04.2020
 * @author 
 */

public class UI extends JFrame {
  
  

  // Anfang Attribute
  private ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("/Server2.png"));
  private JLabel jLabel2 = new JLabel(imageIcon1);
  private JLabel jLabel1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JPasswordField jPasswordField1 = new JPasswordField();
  
  // Ende Attribute
  
  

  public UI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 868; 
    int frameHeight = 614;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("UI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(96, 32, 137, 57);
    jLabel1.setText("text");
    cp.add(jLabel1);
    jTextField1.setBounds(96, 200, 233, 49);
    cp.add(jTextField1);
    jButton1.setBounds(96, 368, 153, 73);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(632, 24, 153, 73);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    
    cp.add(jButton2);
    jPasswordField1.setBounds(560, 200, 230, 44);
    cp.add(jPasswordField1);
    jLabel2.setBounds(8, 0, 849, 577);
    jLabel2.setText("text");
    cp.add(jLabel2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public UserUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new UI();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class UserUI
