import java.util.*;


public class Order {
		
	private int temporaryprice;
	private int totalprice;
	private static int id = 0;
    private String customerName = "null";
    private String customerAddress = "null";
    private ArrayList<IArticle> orders = new ArrayList<IArticle>();
    
	public Order() {
        id++;
	}

	public int getTotalPrice(){
		for (int i=0; i<orders.size(); i ++){
			temporaryprice = orders.get(i).getPrice();
			if (temporaryprice < 0) {temporaryprice = 0;}
			totalprice += temporaryprice;
			}
		return totalprice;
	}
	
	public Iterable<IArticle> getOrderedArticles() {
        return orders;
	}
	
	public void add (IArticle item ){
		orders.add(item);
	}
	
	public String setCustomerAddress(String tmpAddress){
		customerAddress = tmpAddress;
		return customerAddress;
	}
		
	public String setCustomerName(String tmpName) {
		customerName = tmpName;
		return customerName;
	}
	
	public int getId(){
		return id;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}

		
}
