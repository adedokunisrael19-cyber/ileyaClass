import java.util.Scanner; 
public class Minimum{
    public static void main(String[] args){
    int count = 5;  
    int min = Integer.MAX_VALUE;    
    
    Scanner input = new Scanner(System.in);  
   
    while(count > 0){
        System.out.print("enter a number");
         int number = input.nextInt();
        if(number < min){
            min = number;
        }
        count--;
         } 
    System.out.print(min);
    }
}
