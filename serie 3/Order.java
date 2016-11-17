//P1 Übungsserie 3, Aufgabe 3-2, Korrektur, Jurosevic Sandra 16-102-766, Künzi Livia 11-114-055

public class Order {
	
	private int id; 
    private static int userId = 1;
    private String customerName;
    private String customerAddress;
    private Book book1, book2, book3, book4, book5;
    private int orderlist; 

    public Order() 
    {
    	id = userId;
        userId++;
        orderlist = 0;
    }

   	public void addBook( Book item)	{
		if ( ( orderlist >= 5 ) || ( null == item ) ) {
			return ;
		}
		
		if(orderlist == 0){	
			book1 = item;
			orderlist++;
			return ;
		}
		
		if(orderlist == 1){	
			book2 = item;
			orderlist++;
			return ;
		}
		
		if(orderlist == 2){
			book3 = item;
			orderlist++;
			return ;
		}
		
		if(orderlist == 3){
			book4 = item;
			orderlist++;
			return ;
		}
		
		if(orderlist == 4){
			book5 = item;
			orderlist++;
			return ;
		}
	}

  	public int getTotalPrice(){
		int price = 0;
		if ( orderlist > 0 )
			price = book1.getPrice();
		if ( orderlist > 1 )
			price = book1.getPrice() + book2.getPrice();
		if ( orderlist > 2 )
			price = book1.getPrice() + book2.getPrice() + book3.getPrice();
		if ( orderlist > 3 )
			price = book1.getPrice() + book2.getPrice() + book3.getPrice() + book4.getPrice();
		if ( orderlist > 4 )
			price = book1.getPrice() + book2.getPrice() + book3.getPrice() + book4.getPrice() + book5.getPrice();
		return price;
	}


  
    public void setCustomerName(String tmpName) 
    {
        customerName = tmpName;
    }
    
    public void setCustomerAddress(String tmpAddress) 
    {
        customerAddress = tmpAddress;
    }
    
    
	public String toString()
	{
		String result = "Order id: " + id + ", Customer: ";
		{
		if(null != customerName) {
			result += customerName;
		}
		else result += "Name nicht bekannt";
		}
		result+= ", ";
		{
		if(null!= customerAddress){
			result+= customerAddress;
		}
		else result += "Adresse nicht bekannt";
		}
				
		result += "\n";
		
		if ( orderlist > 0 )
			result += book1 + "\n";
		if ( orderlist > 1 )
			result += book2 + "\n";
		if ( orderlist > 2 )
			result += book3 + "\n";
		if ( orderlist > 3 )
			result += book4 + "\n";
		if ( orderlist > 4 )
			result += book5 + "\n";
		result += "Total price: " + getTotalPrice() + " CHF";
		
		return result;

    }
}


