import java.util.Scanner;
import java.util.Arrays;

public class _8_SortArrayOfStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		input.nextLine();
		String strings[] = new String[n];
		
		for (int i = 0; i < n; i++) {			
			strings[i]=input.next();
		}
		//input.close();

		Arrays.sort(strings);
		
		for (int i = 0; i < strings.length; i++) {	
		System.out.println(strings[i]);
		}
	}
}
