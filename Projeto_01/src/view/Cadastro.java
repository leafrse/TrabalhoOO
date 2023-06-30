package view;

import Controle.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

//equivalente a telaPessoa
public class Cadastro implements ActionListener, ListSelectionListener {

	private JLabel titulo;
	private JFrame aba;
	private JLabel menuC;
	private JButton cadastroS = new JButton("Cadastrar nova seringa ");
	private JButton refreshS = new JButton("RefreshSerin");
	private JButton cadastroT = new JButton("Cadastrar nova Toxina:");
	private JButton refreshT = new JButton("RefreshTox");
	private static Controle dados;
	private JList<String> seringasCadastradas;
	private JList<String> toxinasCadastradas;
	private JScrollPane scrollSeringas;
	private JScrollPane scrollToxinas;
	private String[] listaSeringas;
	private String[] listaToxinas;

	public void mostrarDados(Controle d, int op) {
		dados = d;
		
		switch (op) {
		case 1:// Mostrar dados de Seringas cadastradas
			
			aba = new JFrame("DADOS");
			titulo = new JLabel("==== MENU DE TOXINAS ====");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			seringasCadastradas = new JList<String>(dados.getNomesSeringas());
			scrollSeringas = new JScrollPane(seringasCadastradas);
			scrollSeringas.setBounds(20, 50, 350, 120);
			seringasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			seringasCadastradas.setVisibleRowCount(10);
			cadastroS.setBounds(70, 177, 100, 30);
			refreshS.setBounds(200, 177, 100, 30);
			aba.setLayout(null);
			aba.add(titulo);
			aba.getContentPane().add(scrollSeringas);
			aba.add(cadastroS);
			aba.add(refreshS);

			aba.setSize(400, 250);
			aba.setVisible(true);
			cadastroS.addActionListener(this);
			refreshS.addActionListener(this);
			seringasCadastradas.addListSelectionListener(this);
			break;
		case 2:// Mostrar dados de produtos tipo toxina cadastrados

			
			aba = new JFrame("DADOS");
			titulo = new JLabel("==== MENU SERINGAS ====");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			toxinasCadastradas = new JList<String>(dados.getNomesToxinas());
			scrollToxinas = new JScrollPane(toxinasCadastradas);
			titulo.setBounds(90, 10, 250, 30);
			scrollToxinas.setBounds(20, 50, 350, 120);
			toxinasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			toxinasCadastradas.setVisibleRowCount(10);
			cadastroT.setBounds(70, 177, 100, 30);
			refreshS.setBounds(200, 177, 100, 30);
			aba.setLayout(null);
			aba.add(titulo);
			aba.getContentPane().add(scrollToxinas);
			aba.add(cadastroT);
			aba.add(refreshS);

			aba.setSize(400, 250);
			aba.setVisible(true);
			cadastroT.addActionListener(this);
			refreshS.addActionListener(this);
			toxinasCadastradas.addListSelectionListener(this);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);

		}
	}

//Captura de eventos relacionado aos botões da interface
	public void actionPerformed(ActionEvent d) {
		Object src = d.getSource();
		// Cadastro seringas
		if (src == cadastroS)

			new Tela_00().inserirEditar(1, dados, this, 0);
		// cadastro toxinas
		if (src == cadastroT)
			new Tela_00().inserirEditar(2, dados, this, 0);
		// refresh seringas(atualiza a lista de nomes de seringas registradas)
		if (src == refreshS) {
			seringasCadastradas.setListData(new Controle(dados).getNomesSeringas());
			seringasCadastradas.updateUI();
		}// refresh toxinas(atualiza a lista de nomes de toxinas registradas)
		if (src == refreshT) {
			toxinasCadastradas.setListData(new Controle(dados).getNomesToxinas());
			toxinasCadastradas.updateUI();
		}
	}

	// captura de eventos relacionados ao jlist
	public void valueChanged(ListSelectionEvent d) {
		Object src = d.getSource();
		if (d.getValueIsAdjusting() && src == listaSeringas) {
			new Tela_00().inserirEditar(3, dados, this, seringasCadastradas.getSelectedIndex());
		}
		if (d.getValueIsAdjusting() && src == listaToxinas) {
			new Tela_00().inserirEditar(3, dados, this, toxinasCadastradas.getSelectedIndex());
		}

	}
}