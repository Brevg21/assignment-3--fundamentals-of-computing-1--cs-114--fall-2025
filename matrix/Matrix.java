public class Matrix {
int[][] matrix;
int rows;
int collums;

public void constructMatrix(int size){
  matrix = new int[size][size];
  rows = size;
  collums = size;
  for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
      matrix[row][col] = 0;
    }
  }
  System.out.println("The matrix dimensions are: " + size + "x" + size);
  System.out.println();
}

public void printMatrix(){
  int cols = 1;
  int rowss = matrix.length -1;
  final String RESET = "\u001b[0m";
  final String HIGHLIGHT = "\u001b[33m";
  for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
      if (col == matrix.length - cols && row == 0){
        System.out.print(HIGHLIGHT + matrix[row][col] + RESET + "\t");
        cols++;
      }
      else if (col == matrix.length - cols && row == matrix.length - rowss || col == matrix.length - cols && row == matrix.length -rowss){
        System.out.print(HIGHLIGHT + matrix[row][col] + RESET + "\t");
        cols++;
        rowss--;
      }
      else{
      System.out.print (matrix[row][col] + "\t");
      }
    }

    System.out.println();
  }
  System.out.println();
}

public void populateMatrix() {
  int count = 1;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = count;

        count++;
      }
    }
}

private void swap(int x1, int y1, int x2, int y2){
  int copyOne = matrix[x1][y1];

  matrix[x1][y1] = matrix[x2][y2];
  matrix[x2][y2] = copyOne;

}

public void flipMatrix(){

  for(int i = 0; i < rows; i++){
    for(int k = 0; k < collums; k++){

      if (i > rows - 1 - i) continue;
      if (i == rows - 1 -i && k > collums -1 -k) continue;

      if(k == collums - 1 -i) continue;
      if (collums - 1 -k == rows - 1 - (rows - 1- i)) continue;

      swap(i,k,rows - 1 - i,collums - 1 -k);

    }
  }

}

}
