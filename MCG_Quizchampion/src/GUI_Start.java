import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgQuizchampion;
	private JButton btnspiel_laden;
	private JButton btnstart;
	private JLabel lblRegeln;
	private JLabel lblSpieleranzahl;
	private JButton btnPlayer_1;
	private JTextField textName_1;
	private JButton btnPlayer_2;
	private JTextField textName_2;
	private JButton btnPlayer_3;
	private JTextField textName_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgQuizchampion = new JLabel("MCG Quizchampion");
		lblMcgQuizchampion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMcgQuizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcgQuizchampion.setBounds(405, 54, 194, 40);
		contentPane.add(lblMcgQuizchampion);
		
		btnspiel_laden = new JButton("Spiel laden");
		btnspiel_laden.setBackground(Color.ORANGE);
		btnspiel_laden.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnspiel_laden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnspiel_laden.setBounds(39, 620, 96, 40);
		contentPane.add(btnspiel_laden);
		
		btnstart = new JButton("Start");
		btnstart.setBackground(new Color(51, 255, 51));
		btnstart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnstart.setForeground(Color.BLACK);
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnstart.setBounds(39, 671, 96, 60);
		contentPane.add(btnstart);
		
		lblRegeln = new JLabel("Regeln:");
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegeln.setVerticalAlignment(SwingConstants.TOP);
		lblRegeln.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegeln.setBounds(238, 177, 517, 467);
		contentPane.add(lblRegeln);
		
		lblSpieleranzahl = new JLabel("Spieleranzahl:");
		lblSpieleranzahl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpieleranzahl.setVerticalAlignment(SwingConstants.TOP);
		lblSpieleranzahl.setBounds(39, 177, 96, 29);
		contentPane.add(lblSpieleranzahl);
		
		btnPlayer_1 = new JButton("Player 1");
		btnPlayer_1.setBounds(39, 217, 96, 23);
		contentPane.add(btnPlayer_1);
		
		textName_1 = new JTextField();
		textName_1.setBounds(39, 251, 96, 20);
		contentPane.add(textName_1);
		textName_1.setColumns(10);
		
		btnPlayer_2 = new JButton("Player 2");
		btnPlayer_2.setBounds(39, 282, 96, 23);
		contentPane.add(btnPlayer_2);
		
		textName_2 = new JTextField();
		textName_2.setBounds(39, 316, 96, 20);
		contentPane.add(textName_2);
		textName_2.setColumns(10);
		
		btnPlayer_3 = new JButton("Player 3");
		btnPlayer_3.setBounds(39, 347, 96, 23);
		contentPane.add(btnPlayer_3);
		
		textName_3 = new JTextField();
		textName_3.setBounds(39, 381, 96, 20);
		contentPane.add(textName_3);
		textName_3.setColumns(10);
	}
}
