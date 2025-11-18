import java.util.Scanner;


public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int diamondDimensions = 0;
    int checkingForInteger = 0;

    System.out.println("Plese enter the dimensions for your diamond");

    while(checkingForInteger == 0){
      if (input.hasNextInt()){
        diamondDimensions = input.nextInt();
        if(diamondDimensions > 0){
          checkingForInteger = 1;
        }
        else{
          System.out.println("Please enter a valid integer that is greater than 0");
          input.nextLine();
        }
      }
      else{
        System.out.println("Please enter a valid integer");
        input.nextLine();
      }
    }
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
      int width = diamondDimensions + (diamondDimensions-1);

      for (int star =1; star <= diamondDimensions;){

        int widthOfRow = star + (star -1);
        int spaces = (width- widthOfRow)/2;

        for (int i =0; i < spaces; i++){
          System.out.print(" ");
        }

        for (int i = 0; i < star; i++){
          System.out.print("*");
          if (i < star -1){
            System.out.print(" ");
          }
        }
        if (star == 1){
          star++;
        }
        else {
          star+=2;
        }
        System.out.println();
      }
      for (int star = diamondDimensions -2;star >= 1; star-=2){
        int widthOfRow = star + (star-1) ;
        int space = (width- widthOfRow)/2;

        for (int i =0; i < space; i++){
          System.out.print(" ");
        }
        for (int i =0; i< star; i++){
          System.out.print("*");
          if (i < star -1){
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      int spaces = (width - 1)/2;
      for (int i=0; i < spaces; i++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
