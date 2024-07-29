import java.util.Scanner;

public class ContInput {
    public static void main(String[]args){

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a name");
            String name = input.nextLine();
            System.out.println(name);

            if(name.equalsIgnoreCase("quit")){
                break;
            }


        }

    }
}
