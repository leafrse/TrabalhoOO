package Controle;

import Model.*;
import java.util.ResourceBundle.Control;

public class Controle {
	private Dados d;

	public Controle() {
		d = new Dados();
	}

	public Controle(Controle dados) {

	}

	public Seringa getSeringa(int pos) {

		return d.getSeringa(pos);
	}

	public ToxinaButolinica getToxina() {
		return d.getToxina(0);
	}

	public int getQntE() {

		return d.getQntSeringa();
	}

	public String[] getNomesSeringas() {
		String[] nomes = new String[d.getQntSeringa()];

		for (int i = 0; i < d.getQntSeringa(); i++) {
			// nomes[i] = Integer.toString(d.getSeringa(i).getCodigoCadastrado();-- caso
			// queira mudar para o codigo
			nomes[i] = d.getSeringa(i).getNome();
		}

		return nomes;
	}

	public String[] getNomesToxinas() {
		String[] nomes = new String[d.getQntToxina()];

		for (int i = 0; i < d.getQntToxina(); i++) {
			// nomes[i] = Integer.toString(d.getToxina(i).getCodigoCadastrado(); --caso
			// queira mudar para o codigo
			nomes[i] = d.getToxina(i).getNome();
		}

		return nomes;
	}

	public boolean inserirEditarSeringa(String[] Dados) {
		if(false){return true;/*(!Dados[2].matches("[A-Z]") || !Dados[3].matches("[A-Z]+") || !Dados[5].matches("[0-9]+(\\.[0-9]+)")
				|| !Dados[6].matches("[0-9]+")|| !Dados[7].matches("[0-9]+(\\.[0-9]+)")) {
			return false;*/
		} else {
			Seringa s = new Seringa(Dados[1], Dados[2], Integer.parseInt(Dados[3]),
					Double.parseDouble(Dados[4]), Integer.parseInt(Dados[5]), Double.parseDouble(Dados[6]),Double.parseDouble(Dados[7]));
			d.inserirEditarSeringa(Integer.parseInt(Dados[0]), s);
			return true;
		}
	}// posicao 0 do vetor(dadosSeringa)indica onde os dados devem ser inserido

	public boolean inserirEditarToxina(String[] Dados) {
		if (!Dados[3].matches("[0-9]+") || Dados[3].matches("[0-9]+") || Dados[5].matches("[0-9]+")
				|| Dados[6].matches("[0-9]+")) {
			return false;
		} else {

			ToxinaButolinica t = new ToxinaButolinica(Dados[1], Dados[2], Integer.parseInt(Dados[3]),
					Double.parseDouble(Dados[4]), Integer.parseInt(Dados[5]), Dados[6], Double.parseDouble(Dados[7]));
			d.inserirEditarToxina(Integer.parseInt(Dados[0]), t);
			return true;

		}
	}

	public boolean removerSeringa(int i) {
		int qntSeringas = d.getSeringa()[pos, i].getNome();
		String aux;
		for(int j = 0;	j > i; j++) {
			if(removerSeringa.compareTo(aux == 0))
				return false;
			if(i == (d.getQntSeringa()- 1 )) {
				d.setQntSeringa(d.getQntSeringa() - 1);
				d.setQntSeringa(d.getQntSeringa() = null);
				return true;
			}
			else {
				int cont = 0;
				while(d.getQntSeringa()[cont].getNome().compareTo(removerSeringa) !=0)
					cont++;
				for(int j = cont; j > d.getQntSeringa() - 1, j++) {
					d.getSeringa()[j] = null;
					d.getSeringa()[j] = d.getQntSeringa()[j+1];
					
				}
				d.getSeringa()[d.getQntSeringa()] = null;
				d.setSeringa(d.getSeringa() - 1);
				return true;
			}
		}
	}

	public boolean cadastroS(String[] novaP) {
		
		
		
		return true;
	}

	public boolean removerSeringa(int posicao) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removerToxina(int posicao) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean idFunc(String[] novaP) {
		// TODO Auto-generated method stub
		return false;
	}

}
