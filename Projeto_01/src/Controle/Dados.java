package Controle;

import Model.*;

public class Dados {
	private Farmacia farm;
	

	public Dados() {
		fillWithSomeData();
	}
	

	public void fillWithSomeData() {
		Seringa seringa = new Seringa("Gel", "gel", 1, 2.0, 3, 5, 4);
		farm = new Farmacia();
		farm.setSeringa(seringa);
		ToxinaButolinica toxina = new ToxinaButolinica("a", " b", 1, 2, 3, "g", 1);
		farm.setToxina(toxina);

	}

	

	public Farmacia getFarmacia() {
		return farm;
	}

	public void setDados(Farmacia farm) {
		this.farm = farm;
	}

	public Seringa getSeringa(int pos) {
		return farm.getSeringa(pos);
	}

	public int getQntSeringa() {
		return this.farm.getQntSeringa();
	}

	public ToxinaButolinica getToxina(int pos) {
		return farm.getToxina(pos);
	}

	public int getQntToxina() {
		return this.farm.getQntToxina();
	}
	public void inserirEditarSeringa(int pos, Seringa seringa) {
		if (pos == farm.getQntSeringa()) {
			farm.setSeringa(seringa);
		} else farm.setSeringa(pos, seringa);
	}
	
	public void inserirEditarToxina(int pos, ToxinaButolinica toxina) {
		if (pos == farm.getQntToxina()) {
			farm.setToxina(toxina);
		} else farm.setToxina(pos, toxina);
	}


	


	public void removerToxina(int posicao) {
		// TODO Auto-generated method stub
		
	}


	public void removerSeringa(int posicao) {
		// TODO Auto-generated method stub
		
	}
	
}
