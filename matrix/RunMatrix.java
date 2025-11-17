import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.println("Please enter dimension of your matrix");
    Scanner input = new Scanner(System.in);
    int matrixDimensions;
    matrixDimensions = input.nextInt();
    input.close();

    Matrix myMatrix = new Matrix();

    myMatrix.constructMatrix(matrixDimensions);
    myMatrix.printMatrix();
    myMatrix.populateMatrix();
    myMatrix.printMatrix();
    myMatrix.flipMatrix();
    myMatrix.printMatrix();


  }
}
