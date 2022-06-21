import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

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
		setBackground(new Color(255, 222, 173));
		setTitle("AURUM CINEMA welcome page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME !");
		lblWelcome.setBounds(218, 28, 170, 23);
		contentPane.add(lblWelcome);
		
		JLabel lblAurumCinema = new JLabel("AURUM CINEMA");
		lblAurumCinema.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblAurumCinema.setBounds(131, 62, 329, 47);
		contentPane.add(lblAurumCinema);
		
		lblWelcome.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 25));
		lblWelcome.setForeground(Color.DARK_GRAY);
		
		JLabel lblCreator = new JLabel("Creator: Amanina, Balqis, Izzati, Sabreena");
		lblCreator.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCreator.setBounds(158, 104, 274, 23);
		contentPane.add(lblCreator);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(230, 230, 250));
		progressBar.setBounds(33, 327, 513, 14);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Welcome To AURUM CINEMA e-ticketing...");
		lblNewLabel.setBounds(178, 302, 240, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnMovieslist = new JButton("Now Showing");
		btnMovieslist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movielist ml = new movielist();
				ml.setVisible(true);
			}
		});
		btnMovieslist.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnMovieslist.setBounds(213, 192, 161, 29);
		contentPane.add(btnMovieslist);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
			}
		});
		btnlogin.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnlogin.setBounds(501, 11, 73, 23);
		contentPane.add(btnlogin);
	}
}