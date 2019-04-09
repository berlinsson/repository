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
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgQuizchampion;
	private JButton btnspiel_laden;
	private JButton btnstart;
	private JLabel lblRegeln;
	private JLabel lblSpieleranzahl;
	private JButton btnPlayer_1;
	private JTextField txtSpielername1;
	private JButton btnPlayer_2;
	private JTextField txtSpielername2;
	private JButton btnPlayer_3;
	private JTextField txtSpielername3;
	private final ButtonGroup btngSpielerzahl = new ButtonGroup();

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgQuizchampion = new JLabel("MCG Quizchampion");
		lblMcgQuizchampion.setFont(new Font("Arial", Font.PLAIN, 20));
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
				Hauptklasse.setSpielername1(txtSpielername1.getText());
				Hauptklasse.setSpielername2(txtSpielername2.getText());
				Hauptklasse.setSpielername3(txtSpielername3.getText());
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
		btngSpielerzahl.add(btnPlayer_1);
		btnPlayer_1.setBackground(Color.LIGHT_GRAY);
		btnPlayer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(1);
			}
		});
		btnPlayer_1.setBounds(39, 217, 96, 23);
		contentPane.add(btnPlayer_1);
		
		txtSpielername1 = new JTextField();
		txtSpielername1.setBounds(39, 251, 96, 20);
		contentPane.add(txtSpielername1);
		txtSpielername1.setColumns(10);
		
		btnPlayer_2 = new JButton("Player 2");
		btngSpielerzahl.add(btnPlayer_2);
		btnPlayer_2.setBackground(Color.LIGHT_GRAY);
		btnPlayer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(2);
			}
		});
		btnPlayer_2.setBounds(39, 282, 96, 23);
		contentPane.add(btnPlayer_2);
		
		txtSpielername2 = new JTextField();
		txtSpielername2.setBounds(39, 316, 96, 20);
		contentPane.add(txtSpielername2);
		txtSpielername2.setColumns(10);
		
		btnPlayer_3 = new JButton("Player 3");
		btnPlayer_3.setForeground(Color.BLACK);
		btnPlayer_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btngSpielerzahl.add(btnPlayer_3);
		btnPlayer_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(3);
			}
		});
		btnPlayer_3.setBackground(Color.LIGHT_GRAY);
		btnPlayer_3.setBounds(39, 347, 96, 23);
		contentPane.add(btnPlayer_3);
		
		txtSpielername3 = new JTextField();
		txtSpielername3.setBounds(39, 381, 96, 20);
		contentPane.add(txtSpielername3);
		txtSpielername3.setColumns(10);
	}
}
