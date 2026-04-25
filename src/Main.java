import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       boolean health = true;
       while(health){
           System.out.println("-----WELCOME TO ADVANCED RAILWAY TICKET BOOKING SYSTEM-----");
           System.out.println("choose your option");
           System.out.println("Enter the option you want to proceed with");
           System.out.println("1. Register");
           System.out.println("2. Login");
           System.out.println("3. View Profile");
           System.out.println("4. Update Profile");
           System.out.println("5. Delete Account");

           int option1 = scanner.nextInt();
           scanner.nextLine();

           switch (option1){
               case 1:
               {
                   System.out.println("1. Enter User Name");
                   String userName = scanner.next();
                   System.out.println("2. Enter Email Id");
                   String email = scanner.next();
                   System.out.println("3. Enter Address");
                   String address = scanner.nextLine();
                   System.out.println("4. Enter Password");
                   String password = scanner.next();
                   System.out.println("5. Re-enter Password");
                   String reenterPass = scanner.next();

                   while(!password.equals(reenterPass)){
                       System.out.println("Password did not match re-enter the password");
                       reenterPass = scanner.next();
                   }
               }

           }


       }
    }
}