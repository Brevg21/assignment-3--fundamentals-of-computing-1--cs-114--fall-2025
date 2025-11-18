import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int diamondDimensions;

    System.out.println("Plese enter dimensions for a diamond");
    diamondDimensions = input.nextInt();
    input.close();
    if (diamondDimensions % 2 != 0) {
      diamondDimensions = (diamondDimensions+1)/2;

      for (int i =1 ; i <= diamondDimensions; i++) {
        for (int j = diamondDimensions; j > i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2*i-1); k++) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i = diamondDimensions -1; i >= 1; i--){
        for (int j = diamondDimensions; j > i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2*i-1); k++) {
          System.out.print("*");
        }
        System.out.println();

      }
    }
    else if (diamondDimensions % 2 == 0) {
      diamondDimensions = (diamondDimensions)/2;
      int z = 2;
      for (int i = 1; i <= diamondDimensions; i++){
        for (int j = i; j <= diamondDimensions; j++){
          System.out.print(" ");
        }
        //if (i == 1){
          //System.out.print(" *");
        //}
      for (int k = 1; k <= i; k++){
        System.out.print("* ");
      }
      for (int k = 1; k <= i ; k++){
        System.out.print("* ");

      }
          //z+=2;

        System.out.println();

      }



      }

  }
}
