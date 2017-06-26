package TelaDeCadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	TelaPrincipal tp = new TelaPrincipal();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Tabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new String[][] {
				{"0",tp.mostrarNome(0),tp.mostrarTelefone(0),tp.mostrarEmail(0),tp.mostrarRua(0)},
				{"0",tp.mostrarNome(1),tp.mostrarTelefone(1),tp.mostrarEmail(1),tp.mostrarRua(1)},
				{"0",tp.mostrarNome(2),tp.mostrarTelefone(2),tp.mostrarEmail(2),tp.mostrarRua(2)},
				{"0",tp.mostrarNome(3),tp.mostrarTelefone(3),tp.mostrarEmail(3),tp.mostrarRua(3)},
				{"0",tp.mostrarNome(4),tp.mostrarTelefone(4),tp.mostrarEmail(4),tp.mostrarRua(4)},
				
			},
			new String[] {
				"Codigo", "Nome", "Telefone", "Email", "Rua"
			}
		));
		table.setBounds(32, 22, 605, 208);
		contentPane.add(table);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tp.setVisible(true);
				
			}
		});
		btnCadastrar.setBounds(258, 238, 117, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(400, 238, 117, 25);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnExcluir.setBounds(129, 238, 117, 25);
		contentPane.add(btnExcluir);
	}
}