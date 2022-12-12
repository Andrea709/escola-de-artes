package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class janelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaPrincipal frame = new janelaPrincipal();
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
	public janelaPrincipal() {
		setBackground(new Color(105, 105, 105));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 162);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoginServidor = new JButton("Servidor");
		btnLoginServidor.setBackground(new Color(128, 128, 128));
		btnLoginServidor.setBounds(144, 51, 111, 32);
		btnLoginServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janelaLoginServidor j3 = new janelaLoginServidor();
				j3.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnLoginServidor);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblLogin.setBounds(91, 0, 154, 40);
		contentPane.add(lblLogin);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(179, 94, 76, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnFechar);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.setBackground(new Color(128, 128, 128));
		btnAluno.setBounds(21, 51, 111, 32);
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janelaLoginAluno j2 = new janelaLoginAluno();
				j2.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnAluno);
	}
}
