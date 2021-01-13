import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class fourthPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}
	
	public fourthPage(int result,int job, int M) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrResult = new JTextArea();
		txtrResult.setForeground(Color.BLACK);
		txtrResult.setFont(new Font("Arial", Font.BOLD, 20));
		txtrResult.setBackground(SystemColor.control);
		txtrResult.setText("Result");
		txtrResult.setBounds(15, 16, 98, 31);
		panel.add(txtrResult);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.BOLD, 20));
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(205, 55, 251, 43);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Arial", Font.BOLD, 20));
		textArea_1.setBackground(SystemColor.control);
		textArea_1.setBounds(15, 225, 866, 66);
		panel.add(textArea_1);
		
		
		
		JTextArea txtrRecommendations = new JTextArea();
		txtrRecommendations.setForeground(Color.black);
		txtrRecommendations.setBackground(SystemColor.control);
		txtrRecommendations.setFont(new Font("Arial", Font.BOLD, 20));
		txtrRecommendations.setText("Recommendations:");
		txtrRecommendations.setBounds(15, 153, 205, 31);
		
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		textArea_1_1.setBackground(SystemColor.control);
		textArea_1_1.setBounds(15, 395, 532, 43);
		panel.add(textArea_1_1);
		
		JTextArea txtrTreatments = new JTextArea();
		txtrTreatments.setForeground(Color.BLACK);
		txtrTreatments.setBackground(SystemColor.control);
		txtrTreatments.setFont(new Font("Arial", Font.BOLD, 20));
		txtrTreatments.setText("Treatments:");
		txtrTreatments.setBounds(15, 307, 701, 43);
		
		
		 
		 
		  
		  
		  
		panel.add(textArea);
		panel.add(txtrRecommendations);
		panel.add(txtrTreatments);
		
		
	}

}


