import java.util.Scanner;

/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double price;
    
    System.out.println("Select age Senior/Adult/Child:");
    String age=input.nextLine();
    
    System.out.println("Select Language of movie Nepali/English/Hindi: ");
    String lang=input.nextLine();
    
    System.out.println("Are they student? Yes/No: ");
    String std=input.nextLine();
    
    System.out.println("Is it the day of festival? Yes/No");
    String fes=input.nextLine();
    
    switch(age){
    case"senior":
    price=200.0;
    break;
    
    case"Adult":
    price=250.0;
    break;
    
    case"Child":
    price=150.0;
    break;
    
    default:
        System.out.println("Invalid group");
        return;
    
    
    }
    
    switch(lang){
    case "Nepali":
        System.out.println("Nepali Movie has no Surcharge!");
        break;
        
    case "English":
        price+=100.0;
        System.out.println("Additional fee (+Rs. 100): Rs. "+price);
        break;
        
    case "Hindi":
        price+=50.0;
        System.out.println("Additional fee (+Rs. 50): Rs. "+price);
        break;
    
    default:
    
        System.out.println("The given language is not valid.");
        break;
    
    }
    
    if (std.equals("yes")){
    double stdDiscount=price*0.20;
    price -=stdDiscount;
    System.out.println("Student Discount: Rs. " +stdDiscount);
    }
    if (fes.equals("yes")){
    double festiveDiscount=price*0.15;
    price -=festiveDiscount;
    System.out.println("Festival Discount: Rs. " +festiveDiscount);
    }
    
    System.out.println("Yout total ticket price is: Rs. " +price);
    
    }
}