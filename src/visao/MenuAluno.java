package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class MenuAluno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAluno frame = new MenuAluno();
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
	public MenuAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 217);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //deixar sempre no centro


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Aluno");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(132, 11, 185, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnCursos = new JButton("Cursos");
		btnCursos.setBackground(new Color(128, 128, 128));
		btnCursos.setBounds(32, 71, 104, 32);
		contentPane.add(btnCursos);
		
		JButton btnNotas = new JButton("Notas");
		btnNotas.setBackground(new Color(128, 128, 128));
		btnNotas.setBounds(165, 71, 104, 32);
		contentPane.add(btnNotas);
		
		JButton btnNovoCurso = new JButton("Novo curso");
		btnNovoCurso.setBackground(new Color(128, 128, 128));
		btnNovoCurso.setBounds(300, 71, 104, 32);
		contentPane.add(btnNovoCurso);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(300, 126, 104, 32);
		contentPane.add(btnFechar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(128, 128, 128));
		btnVoltar.setBounds(165, 126, 104, 32);
		contentPane.add(btnVoltar);
		
		JButton btnInformacoes = new JButton("Informações");
		btnInformacoes.setBackground(new Color(128, 128, 128));
		btnInformacoes.setBounds(32, 126, 104, 32);
		contentPane.add(btnInformacoes);
	}
}
