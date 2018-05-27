package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
		
		
		
		Stack<Double> doubles = new Stack <>();
		
		
		
		Random r = new Random(); 
		for (int i = 0; i < 100; i++) {		
			double hi = r.nextDouble()*100;
		doubles.push(hi);
		String string1 =JOptionPane.showInputDialog("Enter a number between 1 and 100 (inclusive)");
		String string2 = JOptionPane.showInputDialog("Enter another number between 1 and 100 (inclusive)");
		int num1 = Integer.parseInt(string1);	
		int num2 = Integer.parseInt(string2);
		if (num1 > num2) {
			int num3 = num1;
			num1 = num2;
			num2 = num3;
		}
		for (int j = 0; j < 100; j++) {
			
			double check = doubles.pop(); 
			if (check > num1) {
				if (check< num2) {
					System.out.println(check);
				}
				doubles.pop();
			}
		}
		
		
		
		
		
		
		
		
		
		}
	}
}
