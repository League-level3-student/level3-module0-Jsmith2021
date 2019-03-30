package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		strings();
		reverse();
		everyother();
		randomOrder();
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void strings() {
		String []word=new String[6];
		word[0]="hello";
		word[1]="yes";
		word[2]="no";
		word[3]="ok";
		word[4]="sometimes";
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse() {
		String [] backwards = new String[6];
		backwards[0]="pineapple";
		backwards[1]="apple";
		backwards[2]="mango";
		backwards[3]="blueberry";
		backwards[4]="banana";
		for (int i = 0; i < backwards.length; i++) {
			
			System.out.println(backwards[backwards.length-1]);
			System.out.println(backwards[backwards.length-2]);
			System.out.println(backwards[backwards.length-3]);
			System.out.println(backwards[backwards.length-4]);
			System.out.println(backwards[backwards.length-5]);
			System.out.println(backwards[backwards.length-6]);
			
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyother() {
		String [] other = new String[5];
		other[0]="flour";
		other[1]="cake";
		other[2]="spice";
		other[3]="sugar";
		other[4]="bake";
		for (int i = 0; i < other.length; i++) {
			System.out.println(other[other.length-5]);
			System.out.println(other[other.length-3]);
			System.out.println(other[other.length-1]);
			
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomOrder() {
		String [] random = new String [5];
		random[0]="spoon";
		random[1]="knife";
		random[2]="plate";
		random[3]="fork";
		random[4]="napkin";
		Random rand = new Random();
		
		for (int i = 0; i < random.length; i++) {
			int r=rand.nextInt(5);
			System.out.println(random [r]);
			
			
		}
		
	}
	
		
}
