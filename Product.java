package Inventory_Managment_System;

public class Product {
	private String Pro_ID;
	private String name;
	private  int quality;
	private double price;
	
    	public void Set_product_detailes(String x,String n,int q,double p) {
		if(q> 0 && p>0) {
			Pro_ID=x;
			name=n;
			quality=q;
			price=p;
			}
		}
    	  public int getq()
  		{
  			return quality;
  			
  		}
    	  public double  getp()
    	  {
    		  return price;
    	  }
    	  public String getpid() {
    		  return Pro_ID;
    	  }

    	  public String getn() {
    		  return name;
    	  }
    	  
    	  public void  display() {
    		 System.out.println("Product_ID: "+getpid());
 			 System.out.println("Name: "+getn());
 			 System.out.println("Quality: "+getq());
 			 System.out.println("Price: "+getp());
    	  }
	

}
