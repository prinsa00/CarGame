import java.util.Scanner;

public class CarGame {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter command:");
            String command = input.nextLine();

            if(command.equalsIgnoreCase("command")){

                System.out.println("Start");
                System.out.println("Stop");
                System.out.println("Quit");

                String start = input.nextLine();

                if(start.equalsIgnoreCase("start")){
                    System.out.println("Game started");
                }

                else if(start.equalsIgnoreCase("stop")){
                    System.out.println("Game ended");
                }

                else if(start.equalsIgnoreCase("quit")){
                    System.out.println("Game quit");
                    break;
                }
            }
            break;
        }
    }
}
