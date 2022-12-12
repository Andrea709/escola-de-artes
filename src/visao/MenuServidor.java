package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MenuServidor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuServidor frame = new MenuServidor();
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
	public MenuServidor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu Servidor");
		lblMenu.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblMenu.setBounds(114, 11, 207, 41);
		contentPane.add(lblMenu);
		
		JButton btnCadastrarAlunos = new JButton("Cadastrar Alunos");
		btnCadastrarAlunos.setBackground(new Color(128, 128, 128));
		btnCadastrarAlunos.setBounds(29, 79, 139, 41);
		contentPane.add(btnCadastrarAlunos);
		
		JButton btnCadastrarCursos = new JButton("Cadastrar Cursos");
		btnCadastrarCursos.setBackground(new Color(128, 128, 128));
		btnCadastrarCursos.setBounds(249, 79, 139, 41);
		contentPane.add(btnCadastrarCursos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(128, 128, 128));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setBounds(209, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFechar.setBounds(319, 227, 89, 23);
		contentPane.add(btnFechar);
	}
}
