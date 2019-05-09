import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUI_Kategoriewahl extends JFrame {

	private JPanel contentPane;
	private JLabel lblWhleEineKategorie;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategoriewahl frame = new GUI_Kategoriewahl();
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
	public GUI_Kategoriewahl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWhleEineKategorie = new JLabel("W\u00E4hle eine Kategorie:");
		lblWhleEineKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhleEineKategorie.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblWhleEineKategorie.setBounds(258, 29, 241, 44);
		contentPane.add(lblWhleEineKategorie);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(267, 178, 232, 73);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(267, 248, 232, 65);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(267, 312, 232, 58);
		contentPane.add(btnNewButton_2);
	}
}
