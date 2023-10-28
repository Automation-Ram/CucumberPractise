package amazonImpl;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public String productName;
	public int price;

	public Product(String productName, int price) {

		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("Mac Book Pro");
		productList.add("Lenovo");
		productList.add("DELL");
		return productList;
	}

}
