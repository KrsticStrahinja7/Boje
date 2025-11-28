package boje;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boje {

	private JFrame frame;
	private Color newColor1 = Color.CYAN;
	private Color newColor2 = Color.CYAN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boje window = new Boje();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Boje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBorderColor = new JButton("Border Color");
		btnBorderColor.setBackground(newColor1);
		btnBorderColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newColor1 = JColorChooser.showDialog(btnBorderColor, "Izaberi boj", newColor1);
				
				btnBorderColor.setBackground(newColor1);
			}
		});
		btnBorderColor.setBounds(156, 48, 118, 46);
		frame.getContentPane().add(btnBorderColor);
		
		JButton btnInnerColor = new JButton("Inner Color");
		btnInnerColor.setBackground(newColor2);
		btnInnerColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newColor2 = JColorChooser.showDialog(btnInnerColor, "Izaberi boj", newColor2);
				
				btnInnerColor.setBackground(newColor2);
			}
		});
		btnInnerColor.setBounds(156, 118, 118, 46);
		frame.getContentPane().add(btnInnerColor);
	}
}
