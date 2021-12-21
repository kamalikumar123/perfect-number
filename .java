
import java.util.Scanner;
public class Main 
{  
   public static void main(String[] args) 
   {  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num = sc.nextInt();  
       checkPerfect(num);    
       
   }  
  
   static void checkPerfect(int num)
   {
   
    int sum = 0,i=1;
    while(i<num)
    {
        if(num % i == 0)
        {
            sum = sum + i;
        }
        i++;
    }
    if(sum == num)
    {
        System.out.println("The entered number "+num+" is a Perfect number");
    }
    else
    {
        System.out.println("The entered number "+num+" is not a Perfect number");
    }     
  } 
} 
