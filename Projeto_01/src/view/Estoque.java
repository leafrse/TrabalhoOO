package view;

import Controle.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Estoque implements ActionListener, ListSelectionListener {
	private static final JLabel titulo = null; 
	private JFrame aba;
	private JLabel menuE;
	private JButton cadastroP = new JButton("Adicionar produto em estoque");
	private JButton pesquisarP = new JButton("Pesquisar Produto em estoque");
	private JButton refreshProduto = new JButton("Refresh");
	private static Controle Dados;
	private JList<String> produtosCadastrados;
	private String[] listaProdutos = new String [50];
	
	public void mostrarDadosP(Controle p, int op) {
		Dados = p;
		JList<String> listaProduto;
		JLabel titulo;
		
		switch (op) {
		case 1:
		listaProduto = new JList<String>();
		aba = new JFrame ("Estoque");
		titulo = new JLabel("--- Menu Estoque ---");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90,10,250,30);
		listaProduto.setBounds(20,50,350,120);
		listaProduto.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProduto.setVisibleRowCount(10);
		cadastroP.setBounds(70, 177, 100, 30);
		refreshProduto.setBounds(200, 177,100, 30);
		aba.setLayout(null);
		aba.add(titulo);
		aba.add(listaProduto);
		aba.add(cadastroP);
		aba.add(refreshProduto);
		
		aba.setSize(400, 250);
		aba.setVisible(true);
		cadastroP.addActionListener(this);
		refreshProduto.addActionListener(this);
		listaProduto.addListSelectionListener(this);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			
		}
	}


	public void valueChanged(ListSelectionEvent p) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		
	}

}
