
public class Session2 {

	public static void main(String[] args) {
		
		//Task 1: Write a Java program that takes a user's Zomato wallet balance (double) and applies a 10% cashback 
		//if the balance is above ₹500, otherwise no cashback. Use arithmetic and relational operators to 
		//calculate and display the final balance.
		
		System.out.println("Task1:");
		
		double balance = 785;
		
		if(balance>500) {
			
			double cashback = balance * 0.10;
			double new_balance = balance + cashback;
			
			System.out.println("Your Current balance is:" + balance);
			System.out.println("Cashback: " + cashback);
			System.out.println("new balance: " + new_balance);
		}
		else {
			System.out.println("no cashback");
		}
		
//		Task2: Create a Java snippet that checks if a user can book a movie ticket on BookMyShow: 
//		declare variables for userAge (int) and hasPaymentMethod (boolean). Use logical and relational 
//		operators to print 'Booking allowed' only if the user is 18 or older and has a payment method linked.
		
		System.out.println("\n\nTask2:");
		
		int userAge = 22;
		boolean hasPaymentMethod = true;
		
		if(userAge>=18  && hasPaymentMethod){
			System.out.println("Booking allowed");
		}
		else {
			System.out.println("Booking is not allowed");
		}
		
		
//		Task3: Write a Java program that takes an integer representing the number of unread WhatsApp messages and 
//		prints 'No new messages', 'Few messages', or 'Too many messages' using the ternary operator.
//		<br><br><em><strong>Hint:</strong> Use nested ternary operators for three possible outputs.</em>
		
		System.out.println("\n\nTask3:");
		
		int unreadMessages = 15;
		String messages = (unreadMessages==0)? "No new messages" : (unreadMessages<=7)? "Few messages" : "Too many messages";
		System.out.println(messages);
		
		
//		Task4: Demonstrate both implicit and explicit type casting in Java by converting a float 
//		rating (e.g., 4.7) to an int and then back to double. Print all values to show the effect of 
//		casting.<br><br><em><strong>Constraint:</strong> Do not use any external libraries; use only standard 
//		Java casting syntax.</em>
		
		
		System.out.println("\n\nTask4:");
		
		float a = 4.864f;
		int A = (int) a;
		double B = A;
		
		System.out.println("float value:" + a);
		System.out.println("Int value:" + A);
		System.out.println("Double value:" + B);
		
		
		
	}
}
