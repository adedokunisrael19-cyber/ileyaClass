import java.util.Scanner; 
public class Maximum{
    public static void main(String[] args){
    int count = 5;  
    int max = 0;     
    
    Scanner input = new Scanner(System.in);  
   
    while(count > 0){
        System.out.print("enter a number");
         int number = input.nextInt();
        if(number > max){
            max = number;
        }
        count--;
         } 
    System.out.print(max);
    }
}
