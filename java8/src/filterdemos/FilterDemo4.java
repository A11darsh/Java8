package filterdemos;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	public Product() {
		super();
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class FilterDemo4 {

	public static void main(String[] args) {
		List<Product> producstList=new ArrayList<Product>();
	
		producstList.add(new Product(1,"hp laptop",25000) );
		producstList.add(new Product(2,"lenovo laptop",250009) );
		producstList.add(new Product(3,"apple laptop",250005) );
		producstList.add(new Product(4,"vivo laptop",250070) );
		
		producstList.stream().filter(e -> e.price>25000).forEach(e-> System.out.println(e.price));
		
	}

}
