import java.util.Scanner;
class powFunction {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true) {
    System.out.print("Enter a number(-1 to exit): ");
    int num=sc.nextInt();
    if(num==-1) {
      System.out.println("Exiting...");
      break;
    }
    System.out.print("Enter power: ");
    int power=sc.nextInt();
    double powNum=MyMath.pow(num, power);
    System.out.println("Result: "+powNum);
    }
    sc.close();
  }
}
class MyMath {
  public static double pow(double num, int power) {
    try {
    if(power==0) return 1;
    if(power<0) return 1/pow(num, -power);
    return num*pow(num, power-1);
    } catch(StackOverflowError e) {
      System.out.println("Error: Too large power caused stack overflow!");
      return Double.NaN;
    }
  }
}