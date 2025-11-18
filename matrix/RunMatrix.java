import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.println("Please enter the size of your matrix.");
    Scanner input = new Scanner(System.in);
    int matrixDimensions =0;
    int checkingForPositiveInteger = 0;

    while(checkingForPositiveInteger ==0){
      if(input.hasNextInt()){
        matrixDimensions = input.nextInt();
        if (matrixDimensions > 0){
          checkingForPositiveInteger++;
        }
        else{
          System.out.println("Please enter a positive integer greater than 0");
          input.nextLine();
        }
      }
      else{
        System.out.println("Please enter a valid integer");
        input.nextLine();
      }
    }
    input.close();
    Matrix myMatrix = new Matrix(matrixDimensions);

    System.out.println("Printing all zero's matrix.\n");
    myMatrix.printMatrix();

    System.out.println("Populating matrix...");
    myMatrix.populateMatrix();

    System.out.println("Printing fully populated matrix.\n");
    myMatrix.printMatrix();

    System.out.println("Flipping matrix... Completed\nPrinting flipped matrix.");
    myMatrix.flipMatrix();
    myMatrix.printMatrix();
  }
}
