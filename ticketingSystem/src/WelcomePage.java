import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Label;

public class WelcomePage extends JFrame {

	private JPanel contentPane;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\danie\\OneDrive\\Desktop\\8fa474eb699de10a852b6076fe346c59.jpg"));
		setBackground(SystemColor.activeCaption);
		setTitle("welcome page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreator = new JLabel("Creator: Daniel, Farhan, Aqil, Haikal");
		lblCreator.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCreator.setBounds(310, 338, 274, 23);
		contentPane.add(lblCreator);
		
		JButton btnlogin = new JButton("CONTINUE");
		btnlogin.setForeground(Color.BLUE);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LaunchPage lg = new LaunchPage();
				lg.setVisible(true);
			}
		});
		btnlogin.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnlogin.setBounds(221, 105, 115, 70);
		contentPane.add(btnlogin);
		
		JButton btnNewButton = new JButton("Poster");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConcertPromoWindow lg = new ConcertPromoWindow();
				lg.setVisible(true);
			}
		});
		btnNewButton.setBounds(221, 188, 115, 47);
		contentPane.add(btnNewButton);
		
		Label label = new Label("JUSTIN BIEBER JUSTICE TOUR ");
		label.setFont(new Font("Papyrus", Font.BOLD, 25));
		label.setBounds(84, 52, 402, 47);
		contentPane.add(label);
		
		Label label_1 = new Label("WELCOME PAGE");
		label_1.setFont(new Font("Kristen ITC", Font.ITALIC, 30));
		label_1.setBounds(149, 10, 435, 39);
		contentPane.add(label_1);
	}
		}
