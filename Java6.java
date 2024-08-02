import java.util.Scanner;

// Lab 4
public class Java6{
	public static void main(String[] args){
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element for index ["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}