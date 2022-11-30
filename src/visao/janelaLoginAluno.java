package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class janelaLoginAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaLoginAluno frame = new janelaLoginAluno();
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
	public janelaLoginAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblAluno.setBounds(93, 0, 116, 39);
		contentPane.add(lblAluno);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(20, 61, 76, 21);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(83, 61, 201, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(20, 105, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(83, 104, 201, 20);
		contentPane.add(txtSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.setBounds(93, 155, 89, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(checkLogin(txtUsuario.getText(), new String(((JPasswordField) txtSenha).getPassword()))) {
					JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!" );
				} else {
					JOptionPane.showMessageDialog(null, "Dados inválidos");
				}
				
			}
		});
		contentPane.add(btnLogin);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(195, 155, 89, 23);
		contentPane.add(btnFechar);
	
	}
	
	public boolean checkLogin (String usuario, String senha) {
		return usuario.equals("aluno") && senha.equals("123");
	}
}
