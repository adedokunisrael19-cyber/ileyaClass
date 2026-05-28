import java.util.Scanner; 
public class CheckPass{
    public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);  
    String CorrectPassword = "correct";
   do { System.out.print("enter anumber:");
    String UserPassword = input.nextLine();

        if(!UserPassword .equals(CorrectPassword)){
            System.out.print("Wrong password");
            }
        } while (!UserPassword .equals(CorrectPassword));
        System.out.print("right password");
    }
}
