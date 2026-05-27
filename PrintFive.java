import java.util.Scanner; 
public class PrintFive{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int sum = 0;
    int count = 1;   
        while(count <=5){
            System.out.print("enter anumber:");
            int number = input.nextInt();
            sum = sum + number;
            count ++;
            
        }
     System.out.print(sum);
    }
}
