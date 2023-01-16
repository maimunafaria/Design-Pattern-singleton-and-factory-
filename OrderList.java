package singleton_factory;

public class OrderList {

	public Order getOrderName(String str)
	{
		if(str.equals("Pizza"))
			{return new pizza();}
		if(str.equals("Pasta"))
			{return new pasta();}
		else
		{
			return null;
		}
		
	}
}
