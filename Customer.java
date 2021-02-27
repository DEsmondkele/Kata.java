import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        String promptMessage = """
                -->Press 1 for Igbo.
                -->Press 2 for Hausa.
                -->Press 3 for Yoruba.
                -->Press 4 for English
                """;
        System.out.println(promptMessage);//prompt.
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch(userInput){
            case 1:
                System.out.println("Ig bo kwenu!!!");
                break;
            case 2:
                System.out.println("Aboki kwenu!!!");
                break;
            case 3:
                System.out.println("Ekabo!!!");
                break;
            case 4:
                System.out.println("Hello World!!!");
                break;
            default:
                System.out.println("Get lost!!!");
        }
    }
}
