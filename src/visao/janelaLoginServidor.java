package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class janelaLoginServidor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaLoginServidor frame = new janelaLoginServidor();
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
	public janelaLoginServidor() {
		setBackground(new Color(105, 105, 105));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblServidor = new JLabel("Servidor");
		lblServidor.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblServidor.setBounds(76, 0, 158, 32);
		contentPane.add(lblServidor);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(195, 147, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.setBounds(96, 147, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(24, 60, 77, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(23, 106, 53, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(86, 59, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 105, 198, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
