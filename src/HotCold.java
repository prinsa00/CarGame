import java.util.Scanner;

public class HotCold {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int firstnumber = 345;

        for(int i = 0; i <= 1000; i++){
            System.out.println("Guess the number");
            int num = input.nextInt();
            if(num < firstnumber){
                System.out.println("Cold");
            }
            else if(num > firstnumber){
                System.out.println("Hot");
            }
            else{
                System.out.println("The guess is correct.");
                break;
            }
        }




//        while(true){
//            if(100>=n){
//                System.out.println("Hot");
//            }
//            else if(1<=n){
//                System.out.println("Cold");
//            }
//        }
    }
}
