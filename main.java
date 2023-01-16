package singleton_factory;

public class main {

	public static void main(String[] args) {

			OrderList newOrderList= new OrderList();
			Order newOrder=newOrderList.getOrderName("Pizza");
			Order newOrder1=newOrderList.getOrderName("Pasta");
			newOrder.getOrder();
			System.out.println(newOrder.getName());
			newOrder1.getOrder();
			System.out.println(newOrder1.getName());
			newOrder.getOrder();
			System.out.println(newOrder.getName());
			newOrder1.getOrder();
			System.out.println(newOrder1.getName());
			
	}
}
