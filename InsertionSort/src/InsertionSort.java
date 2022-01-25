/*
Name: Breden Hulse
Class: Computer Science 2
Program: It is a Insertion Sort.
*/
import java.io.*;
import java.util.*;
public class InsertionSort {
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/Insertion.dat"));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			while(scan.hasNext()){ //Add Numbers to ArrayList
				numbers.add(scan.nextInt());
			}
		for(int i = 1; i < numbers.size(); i++){
			for(int j = i; j > 0; j--){
				if(numbers.get(j) > numbers.get(j - 1)){//If greater than then it will break.
					break;
				}
				else if (numbers.get(j) < numbers.get(j - 1)){//Will swap with one before if less than
					int nums = j;
					int temp = numbers.get(nums);
					numbers.set(nums, numbers.get(nums - 1));
					numbers.set(nums - 1, temp);
				}
			}

		}
		for(int i = 0; i < numbers.size(); i++){//Print ArrayList
			System.out.println(numbers.get(i));
		}
	}
}
