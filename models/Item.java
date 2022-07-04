package pt.iade.unimanagerdb.models;


public class Item {
    private Product product;
	private double price;
	private int quantity;



	public Item(Product product, double price, int quantity) {

		this.product = product;
		this.price = price;
		this.quantity = quantity;

	}

	public Product getProduct() {
		return product;

	}

	public int getQuantity() {
		return quantity;
	}
	 
	
	public void price(Product product) {
		
	}

	@Override
	public String toString() {
		return "Item: product -> " + product + ", price -> " + price + ", price -> " + price
				+ ", quantity -> " + quantity + "";
	}
}