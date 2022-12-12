package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.AlunoControle;
import modelo.Aluno;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class janelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTable table;
	private Aluno alunoSelecionado;

	private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

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
		setBounds(100, 100, 807, 262);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); // deixar sempre no centro

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Baskerville Old Face", Font.PLAIN, 31));
		lblCadastro.setBounds(105, 0, 177, 41);
		contentPane.add(lblCadastro);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(25, 53, 56, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(93, 52, 191, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(25, 146, 46, 14);
		contentPane.add(lblEmail);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(93, 114, 189, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setBounds(93, 83, 191, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 115, 56, 14);
		contentPane.add(lblTelefone);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(25, 78, 46, 14);
		contentPane.add(lblCpf);

		txtEmail = new JTextField();
		txtEmail.setBounds(93, 145, 191, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(128, 128, 128));
		btnFechar.setBounds(683, 189, 98, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnFechar);

		// botao de cadastro, importante
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(128, 128, 128));
		btnCadastrar.setBounds(251, 189, 98, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// variaveis
				String nome = txtNome.getText();
				String telefone = txtTelefone.getText();
				String cpf = txtCPF.getText();
				String email = txtEmail.getText();
				Aluno a = new Aluno();

				// importacao do modelo aluno, n sei mto bem pq
				Aluno novoAluno = new Aluno();

				// garantia de todos os campos preenchidos

				// nome
				if (nome == null || nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'nome' preenchido!");
				} else {
					novoAluno.setNome(nome);
				}
				// telefone
				if (telefone == null || telefone.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'telefone' preenchido!");
				} else {
					novoAluno.setTelefone(telefone);
				}
				// cpf
				if (cpf == null || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'cpf' preenchido!");
				} else {
					novoAluno.setCpf(cpf);
				}
				// email
				if (email == null || email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum 'email' preenchido!");
				} else {
					novoAluno.setNome(email);
				}

				// confirmacao de inserir? eu acho
				AlunoControle tabelaAluno = AlunoControle.getInstancia();
				boolean inserir = tabelaAluno.inserir(novoAluno);

				if (inserir == true) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

					a.setNome(nome);
					a.setCpf(cpf);
					a.setTelefone(telefone);
					a.setEmail(email);

					listaAlunos.add(a);
					atualizarJTable();

					// Limpa campos
					txtNome.setText(null);
					txtCPF.setText(null);
					txtEmail.setText(null);
					txtTelefone.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
				}

			}
		});
		contentPane.add(btnCadastrar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(128, 128, 128));
		btnVoltar.setBounds(575, 189, 98, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuServidor j6 = new MenuServidor();
				j6.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVoltar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(new Color(128, 128, 128));
		btnAlterar.setBounds(359, 189, 98, 23);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int posicao = listaAlunos.indexOf(alunoSelecionado);

				String novoNome = txtNome.getText();
				String novoCPF = txtCPF.getText();
				String novoTelefone = txtTelefone.getText();
				String novoEmail = txtEmail.getText();
				
				alunoSelecionado.setNome(novoNome);
				alunoSelecionado.setCpf(novoCPF);
				alunoSelecionado.setTelefone(novoTelefone);
				alunoSelecionado.setEmail(novoEmail);

				listaAlunos.set(posicao, alunoSelecionado);
				atualizarJTable();
				limparCampos();

			}
		});
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(128, 128, 128));
		btnExcluir.setBounds(467, 189, 98, 23);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (alunoSelecionado != null) {
					listaAlunos.remove(alunoSelecionado);
					atualizarJTable();
					limparCampos();
				}
			}
		});
		contentPane.add(btnExcluir);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(292, 24, 489, 138);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicaoAluno = table.getSelectedRow();
				alunoSelecionado = listaAlunos.get(posicaoAluno);
				txtNome.setText(alunoSelecionado.getNome());
				txtCPF.setText(alunoSelecionado.getCpf());
				txtTelefone.setText(alunoSelecionado.getTelefone());
				txtEmail.setText(alunoSelecionado.getEmail());
				
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF", "Telefone", "Email" }));
	}

	protected void atualizarJTable() {
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "CPF", "Telefone", "Email" });

		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno a = listaAlunos.get(i);
			modelo.addRow(new Object[] { a.getNome(), a.getCpf(), a.getTelefone(), a.getEmail() });
		}

		table.setModel(modelo);

	}
	
	protected void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtEmail.setText("");
	}
}
