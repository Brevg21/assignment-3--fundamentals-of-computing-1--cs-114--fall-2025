public class Matrix {
  private int[][] matrix;
  private int rows;
  private int columns;

  public Matrix(int size){
    matrix = new int[size][size];
    rows = size;
    columns = size;
    System.out.println("The matrix dimensions are: " + size + "x" + size);
    System.out.println();
  }

  public void printMatrix(){
    int checkingColumn = 1;
    int checkingRows = matrix.length -1;
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (col == matrix.length - checkingColumn && row == 0){
          System.out.print(HIGHLIGHT + matrix[row][col] + RESET + "\t");
          checkingColumn++;
        }
        else if (col == matrix.length - checkingColumn && row == matrix.length - checkingRows){
          System.out.print(HIGHLIGHT + matrix[row][col] + RESET + "\t");
          checkingColumn++;
          checkingRows--;
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
    int cellValue = 1;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = cellValue;
        cellValue++;
      }
    }
  }

  private void swap(int x1, int y1, int x2, int y2){
    int copyOfCell = matrix[x1][y1];

    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = copyOfCell;
  }

  public void flipMatrix(){
    for(int i = 0; i < rows; i++){
      for(int k = 0; k < columns; k++){
        if (i > rows - 1 - i) continue;
        if (i == rows - 1 -i && k > columns -1 -k) continue;

        if(k == columns - 1 -i) continue;
        if (columns - 1 -k == rows - 1 - (rows - 1- i)) continue;

        swap(i,k,rows - 1 - i,columns - 1 -k);
      }
    }
  }
}
