import java.util.Scanner;

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
    if (diamondDimensions % 2 == 0) {
      diamondDimensions = (diamondDimensions +4)/2;

      for (int i = 1 ; i <= diamondDimensions -1; i++) {
        int diamondOrSpace = 0;
        for (int j = diamondDimensions ; j > i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2*i -1); k++) {
          if (diamondOrSpace == 0) {
            System.out.print("*");
            diamondOrSpace++;
          }
          else if (diamondOrSpace == 1){
            System.out.print(" ");
            diamondOrSpace--;
          }
        }
        System.out.println();
      }
      for (int i = diamondDimensions -2; i >= 1; i--){
        int diamondOrSpace =0;
        for (int j = diamondDimensions; j > i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2*i -1); k++) {
          if (diamondOrSpace == 0){
            System.out.print("*");
            diamondOrSpace++;
          }
          else {
            System.out.print(" ");
            diamondOrSpace--;
          }

        }
        System.out.println();

      }
    }
  }
}
