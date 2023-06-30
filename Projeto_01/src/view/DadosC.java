package view;

import java.awt.Color;
//tela detalhe pessoal 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controle.*;

// Aba de registro de cliente (parte principal do registro)

public class DadosC implements ActionListener {
	private JFrame aba;
	private JPanel telinha = new JPanel();
	private JLabel idNome = new JLabel("Nome do produto: ");
	private JTextField nome;
	private JLabel idTipo = new JLabel("Tipo de produto:");
	private JTextField tipoP;
	private JLabel idCodP = new JLabel("Código de produto ");
	private JTextField codigo;
	private JLabel idValor = new JLabel("Valor: ");
	private JTextField valor;
	private JLabel idSize = new JLabel("Tamanho: ");
	private JTextField size;
	private JLabel idExpess = new JLabel("Expessura da Agulha: ");
	private JTextField expess;
	private JLabel idQntE = new JLabel("Quantidade em estoque");
	private JTextField qntE;
	private JLabel idFunc = new JLabel("Funcionalidade");
	private JTextField func;
	private JLabel idQntA = new JLabel("Quantidade Por Ampola");
	private JTextField qntA;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton seringa = new JButton("Seringa");
	private JButton toxina = new JButton("Toxina");
	private String[] novaP = new String[50];
	private static Controle dadosC;
	private int posicao;
	private int op = 1 ;

	public void telinhas(int op) {
	
		telinha.removeAll();
		telinha.setBounds(0, 40, 390, 310);
		
		nome = new JTextField();
		tipoP = new JTextField();
		codigo = new JTextField();
		valor = new JTextField();
		
		idNome.setBounds(30, 20, 180, 25);
		nome.setBounds(180, 20, 180, 25);
		idTipo.setBounds(30, 50, 180, 25);
		tipoP.setBounds(180, 50, 180, 25);
		idCodP.setBounds(30, 80, 180, 25);
		codigo.setBounds(180, 80, 180, 25);
		idValor.setBounds(30, 110, 180, 25);
		valor.setBounds(180, 110, 180, 25);
		
		telinha.add(idNome);
		telinha.add(nome);
		telinha.add(idTipo);
		telinha.add(tipoP);
		telinha.add(idCodP);
		telinha.add(codigo);
		telinha.add(idValor);
		telinha.add(valor);
		
		if(op == 1) {
			
			size = new JTextField();
			qntE = new JTextField();
			expess = new JTextField();
			
			idSize.setBounds(30, 140, 150, 25);
			size.setBounds(180, 140, 180, 25);
			idQntE.setBounds(30, 170, 150, 25);
			qntE.setBounds(180, 170, 180, 25);
			idExpess.setBounds(30, 200, 150, 25);
			expess.setBounds(180, 200, 180, 25);
			
			telinha.add(idSize);
			telinha.add(size);
			telinha.add(idQntE);
			telinha.add(qntE);
			telinha.add(idExpess);
			telinha.add(expess);
			
			
		} 
		if (op == 2) {
			
			size = new JTextField();
			qntE = new JTextField();
			func = new JTextField();
			qntA = new JTextField();
			
			idFunc.setBounds(30, 140, 150, 25);
			func.setBounds(180, 140, 180, 25);
			idQntA.setBounds(30, 170, 150, 25);
			qntA.setBounds(180, 170, 180, 25);
			
			telinha.add(idFunc);
			telinha.add(func);
			telinha.add(idQntA);
			telinha.add(qntA);
			
		}
		
		telinha.revalidate();
		telinha.repaint();
	}
	
	public void editar(Controle c, int pos) {

		posicao = pos;
		dadosC = c;

		aba = new JFrame("Cadastrar");
		aba.setBounds(400, 50, 400, 310);
		
		seringa.setBounds(100, 20, 100, 30);
		toxina.setBounds(210, 20, 100, 30);
		
		// Preencher dados com dados da Seringa cadastrada
		if (op == 1) {
			
			telinhas(1);

		} else {
			
			telinhas(2);
			
		}
		
		botaoSalvar.setBounds(210, 300, 115, 30);
		botaoExcluir.setBounds(60, 300, 115, 30);
		
		telinha.setLayout(null);
		
		aba.add(seringa);
		aba.add(toxina);
		aba.add(botaoSalvar);
		aba.add(botaoExcluir);
		aba.add(telinha);
		
		aba.setLayout(null);
		aba.setSize(400, 450);
		aba.setVisible(true);
		seringa.addActionListener(this);
		toxina.addActionListener(this);
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == seringa) {
			op = 1;
			aba.dispose();
			editar(dadosC, posicao);
		}
		
		if (src == toxina) {
			op = 2;
			aba.dispose();
			editar(dadosC, posicao);
		}
		
		if (src == botaoSalvar) {
			 
				boolean res;
				if (op == 1)// cadastro seringa
				{
					novaP[6] = idSize.getText();
					novaP[7] = idExpess.getText();
				}
					
				
				else if (op == 2) {
					novaP[8] = idFunc.getText();
					novaP[9] = idQntA.getText();
				}
					
				 // edicao de dados
					novaP[0] = Integer.toString(posicao);
				novaP[1] = idNome.getText();
				novaP[2] = idTipo.getText();
				novaP[3] = idCodP.getText();
				novaP[4] = idValor.getText();
				novaP[5] = idQntE.getText();
				
				if (op == 1 ) {
					
					res = dadosC.inserirEditarSeringa(novaP);
					System.out.println(res);

				} else {
					
					res = dadosC.idFunc(novaP);

				}
				if (res) {
					mensagemSucessoCadastro();

				} else
					mensagemErroCadastro();
			
			if (src == botaoExcluir) {// Excluir seringa
				 res = false;
				if (op == 3) {
					res = dadosC.removerSeringa(posicao);
					if (res)
						mensagemErroExclusaoSeringa();
				}
				if (op == 4) {
					res = dadosC.removerToxina(posicao);
					if (res)
						mensagemErroSucessoToxina();
					else
						mensagemErroSucessoToxina();
				}

			}
		}
	}

	private void mensagemErroSucessoToxina() {
		// TODO Auto-generated method stub
		
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		aba.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);

	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS!\n ");
	}

	public void mensagemErroExclusaoSeringa() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);

	}
}
