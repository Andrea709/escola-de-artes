package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.AlunoControle;
import modelo.Aluno;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class janelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaCadastro frame = new janelaCadastro();
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
	public janelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(93, 61, 208, 22);
		contentPane.add(comboBox);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Baskerville Old Face", Font.PLAIN, 31));
		lblCadastro.setBounds(105, 0, 177, 41);
		contentPane.add(lblCadastro);
		
		JLabel lblTipo = new JLabel("Função:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipo.setBounds(25, 59, 86, 22);
		contentPane.add(lblTipo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(25, 92, 56, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(93, 94, 208, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(25, 188, 46, 14);
		contentPane.add(lblEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(93, 156, 208, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(93, 125, 208, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(25, 157, 56, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(25, 126, 46, 14);
		contentPane.add(lblCpf);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(93, 187, 208, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(232, 227, 98, 23);
		contentPane.add(btnFechar);
		
		
		//botao de cadastro, importante
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(128, 128, 128));
		btnCadastrar.setBounds(10, 227, 98, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//variaveis
				String nome = txtNome.getText();
				String telefone = txtTelefone.getText();
				String cpf = txtCPF.getText();
				String email = txtEmail.getText();
				
				//importacao do modelo aluno, n sei mto bem pq
				Aluno novoAluno = new Aluno();
				
				//garantia de todos os campos preenchidos
				
				//nome
				if (nome == null || nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'nome' preenchido!");
				} else {
					novoAluno.setNome(nome);
				}
				//telefone
				if (telefone == null || telefone.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'telefone' preenchido!");
				} else {
					novoAluno.setTelefone(Integer.parseInt(telefone));
				}
				//cpf
				if (cpf == null || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'cpf' preenchido!");
				} else {
					novoAluno.setCPF(Long.parseLong(cpf));
				}
				//email
				if (email == null || email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'email' preenchido!");
				} else {
					novoAluno.setNome(email);
				}
				
				//confirmacao de inserir? eu acho
				AlunoControle tabelaAluno = new AlunoControle();
				boolean inserir = tabelaAluno.inserir(novoAluno);
				
				
				if (inserir == true) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

					// Limpa campos
					txtNome.setText(null);
					txtCPF.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
				}
			
				
			}
		});
		contentPane.add(btnCadastrar);
		

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(128, 128, 128));
		btnVoltar.setBounds(121, 227, 98, 23);
		contentPane.add(btnVoltar);
	}
}
