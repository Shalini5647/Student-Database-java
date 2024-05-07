import java.util.Scanner;

public class studentdatabase {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in) ;
     int choice;
     do{
        System.out.println("Menu:");
      System.out.println("1. Enter student marks: ");
      System.out.println("0. Exit");
      System.out.print("Enter your choice(1 or 0): ");
      choice = sc.nextInt();

      if (choice == 1){
     System.out.print("Enter the number(out of the 0 to 100) : ");
     int num = sc.nextInt();
     if(num>=90)  
     {
        System.out.println("This is Good");

     }
     else if(num <= 89 &&  num>=60)
     {
    System.out.println("This is also good");
     }
    else if(num <=59 && num>=0)
    {
     System.out.println("This is Good as well");
     }
     else{
        System.out.println("Invalid input. marks should bne 0 to 100");
         }
        }
     else if (choice !=0) {
        
        System.out.println("Invalid choice. Please enter 1 or 0.");
     }
    }
     while (choice!=0); 
        System.out.println("Thank you for using the program!");
        
     }
     

    }



