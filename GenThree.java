/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {			
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);


	int ran1 = (int)(Math.random()*(b-a) + a);
	int ran2 = (int)(Math.random()*(b-a) + a);		
	int ran3 = (int)(Math.random()*(b-a) + a);
	int minNum = (int)(Math.min(ran1,ran2));
	minNum = (int)(Math.min(minNum,ran3));

	System.out.println(ran1);
	System.out.println(ran2);
	System.out.println(ran3);
	System.out.println("The minimal generated number was " + minNum);

	}
}
