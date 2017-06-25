package TelaDeCadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME :");
		lblNome.setBounds(20, 21, 91, 29);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(362, 28, 46, 14);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(20, 43, 304, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(362, 43, 186, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(292, 199, 63, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblRua = new JLabel("RUA");
		lblRua.setBounds(20, 392, 46, 14);
		contentPane.add(lblRua);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 21, 618, 2);
		contentPane.add(separator);
		
		JLabel lblDadosGerais = new JLabel("Dados Gerais");
		lblDadosGerais.setBounds(292, 3, 116, 14);
		contentPane.add(lblDadosGerais);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 224, 618, 2);
		contentPane.add(separator_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 255, 116, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(20, 304, 335, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(20, 237, 46, 14);
		contentPane.add(lblCep);
		
		JLabel lblRua_1 = new JLabel("RUA:");
		lblRua_1.setBounds(20, 286, 46, 14);
		contentPane.add(lblRua_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(362, 304, 232, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(362, 286, 46, 14);
		contentPane.add(lblBairro);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 255, 115, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(271, 255, 293, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblComplemento = new JLabel("COMPLEMENTO:");
		lblComplemento.setBounds(271, 237, 84, 14);
		contentPane.add(lblComplemento);
		
		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setBounds(146, 237, 63, 14);
		contentPane.add(lblNumero);
		
		textField_7 = new JTextField();
		textField_7.setBounds(20, 95, 126, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("DATA DE NASCIMENTO :");
		lblDataDeNascimento.setBounds(20, 74, 126, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setBounds(20, 140, 46, 14);
		contentPane.add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(20, 165, 304, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(334, 165, 260, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(156, 95, 168, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(362, 95, 168, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCelular = new JLabel("CELULAR:");
		lblCelular.setBounds(158, 74, 63, 14);
		contentPane.add(lblCelular);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setBounds(362, 74, 63, 14);
		contentPane.add(lblTelefone);
	}
}
