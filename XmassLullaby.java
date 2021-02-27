import java.util.Scanner;

public class XmassLullaby {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                String promptMessage = """
                    -->Press 1 for Verse I.
                    -->Press 2 for Verse II.
                    -->Press 3 for Verse III.
                    -->Press 4 for Verse IV.
                    -->press 5 for Verse v
                    """;

        System.out.println(promptMessage);
        int userInput = input.nextInt();

                switch (userInput) {


                    case 1:
                        System.out.println("The first day of Christmas my true love sent to me a partridge" +
                                " and a pear-tree!");
                        break;
                    case 2:
                        System.out.println("The second day of Christmas my true love sent to me two turtle-doves, " +
                                "a partridge, and a pear-tree");
                        break;
                    case 3:
                        System.out.println("The third day of Christmas my true love sent to me three fat hens, " +
                                "two turtle-doves, a partridge, and a pear-tree");
                        break;
                    case 4:
                        System.out.println("The fourth day of Christmas my true love sent to me four ducks quacking," +
                                "three fat hens, two turtle-doves, a partridge,and a pear-tree");
                        break;
                    case 5:
                        System.out.println("The fifth day of Christmas my true love sent to me five hares running," +
                                "four ducks quacking, three fat hens, two turtle-doves, a partridge,and a pear-tree.");
                        break;
                    default:
                        System.out.println("Invalid key; Press 1,2,3,4 or 5 for your choice");
                }

    }


}









