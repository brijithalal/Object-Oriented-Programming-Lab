 
import java.util.*;

public class MatrixAddition {
  public static void main(String[] args) {
    int rowM, colM;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter Number of Rows and Columns of Matrix : ");
    rowM = in.nextInt();
    colM = in.nextInt();
    
    int M1[][] = new int[rowM][colM];
    int M2[][] = new int[rowM][colM];
    int resMatrix[][] = new int[rowM][colM];
        
    System.out.print("Enter elements of First Matrix : ");
    
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        M1[i][j] = in.nextInt();
      }
    }
    System.out.println("First Matrix : " );
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        System.out.print(" " +M1[i][j]+"\t");
      }
      System.out.println();
    }
        
    System.out.print("Enter elements of Second Matrix : ");    
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        M2[i][j] = in.nextInt();
      }
    }
    System.out.println("Second Matrix : " );
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        System.out.print(" " +M2[i][j] + "\t");
      }
      System.out.println();
    }
        
    // Addition logic 
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        resMatrix[i][j] = M1[i][j] + M2[i][j];
      }
    }
        
    // Printing the result matrix 
    System.out.println("Result Matrix : " );
    for(int i = 0; i < resMatrix.length; i++){
      for(int j = 0; j < colM; j++){
        System.out.print(" " +resMatrix[i][j]+"\t");
      }
      System.out.println();
    }
  }
}