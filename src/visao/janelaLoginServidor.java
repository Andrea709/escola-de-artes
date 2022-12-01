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

public class janelaLoginServidor extends JFrame {

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblServidor = new JLabel("Servidor:");
		lblServidor.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblServidor.setBounds(93, 0, 157, 39);
		contentPane.add(lblServidor);
		
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
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setBounds(10, 155, 89, 23);
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
		btnFechar.setBackground(Color.GRAY);
		btnFechar.setBounds(208, 155, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnFechar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.GRAY);
		btnVoltar.setBounds(109, 155, 89, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janelaPrincipal ja = new janelaPrincipal();
				ja.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);
	
	}
	
	public boolean checkLogin (String usuario, String senha) {
		return usuario.equals("servidor") && senha.equals("456");
	}
}