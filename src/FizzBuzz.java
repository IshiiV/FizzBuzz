public class FizzBuzz {
	public static void main(String args[]){
		for (int i = 1; i < 101; i++) {
			boolean b = false;
			boolean f = false;
			f = fizz(i);
			b = buzz(i);	
			if (f==true)
				System.out.print("Fizz");
			if (b==true)
				System.out.print("Buzz");
			if (b==true | f==true)
				System.out.println();
			else {
				System.out.println(i);
			}
		}
	}
	
	public static boolean fizz(int i) {
		if (i%10 == 3||i/10 == 3||i%3 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean buzz(int i) {
		if (i%10 == 5||i/10 == 5||i%5 == 0)
			return true;
		else
			return false;
	}
}
