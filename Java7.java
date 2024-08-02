// Lab4
import java.util.*;

class Java7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Variable declaration for rows and columns
		int row1,col1;
		int row2,col2;

		// Taking rows and columns input
		System.out.print("Enter number of rows for first matrix : ");
		row1 = sc.nextInt();
		System.out.print("Enter number of columns for first matrix : ");
		col1 = sc.nextInt();
		System.out.print("Enter number of rows for second matrix : ");
		row2 = sc.nextInt();
		System.out.print("Enter number of columns for second matrix : ");
		col2 = sc.nextInt();

		// Matrix initialisation
		int[][] matrix1 = new int[row1][col1];
		int[][] matrix2 = new int[row2][col2];

		// First matrix input (initialization)
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Enter Elements for Matrix 1 : ");
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[0].length;j++){
				System.out.print("Enter value for position ["+i+"]["+j+"] : ");
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		System.out.println("\nMatrix 1 : ");
		display(matrix1);
		System.out.println("");

		// Second matrix input (initialization)
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Enter Elements for Matrix 2 : ");
		for(int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[0].length;j++){
				System.out.print("Enter value for position ["+i+"]["+j+"] : ");
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		System.out.println("\nMatrix 2 : ");
		display(matrix2);
		System.out.println("");

		// Matrix operations
		int choice;
		while(true){
			System.out.println("Choose operation : ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					addition(matrix1,matrix2);
					break;
				case 2:
					subtraction(matrix1,matrix2);
					break;
				case 3:
					multiplication(matrix1,matrix2);
					break;
				case 4:
					transpose(matrix1,matrix2);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice!!!");
					break;
			}//end of switch
		}// while loop end

	}
	// Main function end	

	// Matrix display function
	public static void display(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

	
	// Matrix Addition function
	public static void addition(int[][] matrix1,int[][] matrix2){
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[0].length;j++){
				System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
			}
			System.out.println("");
		}
	}

	
	// Matrix Subtraction function
	public static void subtraction(int[][] matrix1,int[][] matrix2){
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[0].length;j++){
				System.out.print(matrix1[i][j]-matrix2[i][j]+" ");
			}
			System.out.println("");
		}
	}

	
	// Matrix multiplication function
	public static void multiplication(int[][] matrix1,int[][] matrix2){
		int[][] mat = new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix2.length;j++){
				for(int k=0;k<matrix1.length;k++){
					mat[i][j] += matrix1[i][k] * matrix2[k][j];	
				}
			}
		}
		display(mat);
	}

	
	// Matrix transpose function
	public static void transpose(int[][] matrix1,int[][] matrix2){
		int[][] mat = new int[matrix1.length][matrix1[0].length];
		System.out.println("Transpose of first matrix : ");
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[0].length;j++){
				mat[i][j] = matrix1[j][i];
			}
			System.out.println("");
		}
		display(mat);
		System.out.println("Transpose of second matrix : ");
		for(int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[0].length;j++){
				mat[i][j] = matrix2[j][i];
			}
			System.out.println("");
		}
		display(mat);
	}
}