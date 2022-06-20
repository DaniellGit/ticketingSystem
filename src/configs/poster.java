package configs;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class poster {

  public static void main(String avg[]) throws Exception {
    BufferedImage img = ImageIO.read(new URL(
        "http://www.prworldwidelive.com/wp-content/uploads/2022/03/JUSTINBIEBER_ADMAT_COLOR_KL.jpg"));
    ImageIcon icon = new ImageIcon(img);
    JFrame frame = new JFrame();
    frame.getContentPane().setLayout(new FlowLayout());
    frame.setSize(1161, 1142);
    JLabel lbl = new JLabel();
    lbl.setIcon(icon);
    frame.getContentPane().add(lbl);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}