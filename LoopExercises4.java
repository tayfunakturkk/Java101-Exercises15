package Loops.Exercises4;
import java.util.Scanner;
public class LoopExercises4 {
  public static void main(String[] args) {
      int n;
      int r;
      int sumn=1;
      int sumr=1;
      int com=1;
      int result=0;
      try (Scanner input = new Scanner(System.in)) {
        System.out.print("Please give a n:");
          n =input.nextInt();
          System.out.print("Please give a r:");
          r =input.nextInt();
    } 
      for(int i=1; i<=n; i++){
          sumn=sumn*i;          
      }
      for(int i=1; i<=r; i++){
          sumr=sumr*i;
      }
      for(int i=1; i<=(n-r); i++){
          com=com*i;
      }
      result=sumn/(sumr*com);

      System.out.println("Result is "+result);
  }
}
