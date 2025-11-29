import java.util.Scanner;

/**
 * Write a description of class q11 here.
 *
 * @author (sirapa Baidya)
 * @version (a version number or a date)
 */
public class q11
{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your annual income in (NPR): ");
    double inc= input.nextInt();
    
    double tax;
    
    if(inc<=500000){
        tax=inc*0.01;
    }else if(inc>500000 && inc<=700000){
        tax=5000+(inc-500000)*0.1;
    }else if(inc>700000 && inc<=1000000){
        tax=15000+(inc-700000)*0.2;
    }else if(inc>1000000 && inc<=2000000){
        tax=35000+(inc-1000000)*0.3;
    }else if(inc>2000000 && inc<=5000000){
        tax=335000+(inc-2000000)*0.36;
    }else {
        tax=1135000+(inc-5000000)*0.39;
    }
    System.out.println("The total tax payable will be" + tax);
    
    
    }
}