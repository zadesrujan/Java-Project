package shopingapp;
//giving package as shoppingapp 
import java.util.*;

public class Customer {
	 int customerID;
	    String customerName;
	    String contactNumber;
	    List <Product>bookedProductList;
	    
	    /*The Constructor creates Customer object with the given id, name &
	    contact no*/
	    public Customer (int custID,String name,String contactNo)
	    {
	       customerID  = custID;
	       customerName = name;
	       contactNumber = contactNo;
	       bookedProductList = new ArrayList<Product>();
	    }
	    
	    
	   
	    public void addBookedProduct(Product obj)
	    {
	        bookedProductList.add(obj);
	    }
	    
	}
		/*Public void addBookedProduct(Product obj) :
		The method adds the product which is booked by the customer to
			his bookedProductList. */
