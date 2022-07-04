package pt.iade.unimanagerdb.models;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Carrinho<item> {

	private List<Item> listaItens;


	public void adicionarItem(Product product, double price, int quantity) {

		int posicaoEncontrada = -1;

		for (int pos = 0; pos < getItens().size() & posicaoEncontrada < 0; pos++) {
			Item item = listaItens.get(pos);

			if (item.getProduct().equals(product)) {
				posicaoEncontrada = pos;
			}
		}

		try {
			if (posicaoEncontrada < 0) {
				Item item = new Item(product, price, quantity);
				item.price(item.getProduct());
				getItens().add(item);
			} 
		} catch (RuntimeException e) {
			e.getStackTrace();
		}

	}

	
	@SuppressWarnings("unlikely-arg-type")
	public boolean removerItem(Product product) {

		int posicaoEncontrada = -1;

		for (int pos = 0; pos < getItens().size() & posicaoEncontrada < 0; pos++) {
			Item itemTemp = listaItens.get(pos);

			if (itemTemp.getProduct().equals(product)) {
				posicaoEncontrada = pos;
			}
		}

		if (posicaoEncontrada > -1) {
			getItens().remove(posicaoEncontrada);
			return true;
		} else {
			return false;
		}

	}

	
	public boolean removerItem(int posicaoItem) {

		try {
			listaItens.remove(posicaoItem);
			return true;
		} catch (RuntimeException e) {
			return false;
		}

	}

	public Collection<Item> getItens() {

		if (listaItens == null) {
			listaItens = new ArrayList<>();
		}
		return listaItens;

	}


    public List<Item> getListaItens() {
        return listaItens;
    }


    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }
} 