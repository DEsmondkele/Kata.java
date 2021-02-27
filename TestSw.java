import java.util.Scanner;
public class TestSw {
    public static void main(String[] args) {
        int x=30;
        int y=1;
        Scanner input=new Scanner(System.in);
        while (y != x) {
            System.out.print("Enter guess Number:");
             y = input.nextInt();

        if(y == x)
        System.out.println("Correct!");

        else if(y<x)
            System.out.println("Low!");

        else
            System.out.println("High");
        }



}
}
