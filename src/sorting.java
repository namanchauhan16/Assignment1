import java.util.Scanner;

public class sorting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array:-");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the array of length "+ n +":-");
	for(int i = 0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	for(int i = 1;i<arr.length;i++) {
		for(int j = 0;j < arr.length - 1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	System.out.println("Sorted array in descending order is:-");
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
