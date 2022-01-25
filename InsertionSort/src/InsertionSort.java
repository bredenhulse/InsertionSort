import java.io.*;
import java.util.*;
public class InsertionSort {
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/Insertion.dat"));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			while(scan.hasNext()){
				numbers.add(scan.nextInt());
			}
		for(int i = 1; i < numbers.size(); i++){
			for(int j = i; j > 0; j--){
				if(j == 0){
					break;
				}
				else if (numbers.get(j) < numbers.get(j - 1)){
				int temp = numbers.get(j);
				numbers.set(j, numbers.get(j -1));
				numbers.set(j - 1, temp);
				}
				else{
				}
			}

		}
		for(int i = 0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
	}
}
