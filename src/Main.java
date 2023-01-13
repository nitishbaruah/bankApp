import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Create User: Enter balance, name, password");
        double balance=sc.nextDouble();
        String name=sc.next();
        String password=sc.next();

        //System.out.println("Create User: Enter name, Password, Balance");
        bankuser user= new bankuser(name,password,balance);

        //check balance
        System.out.print("Your balance: ");
        System.out.println(user.checkBalance());

        //add Money
        System.out.println("Enter a amount(AddMoney):");
        int amount=sc.nextInt();
        System.out.println(user.addMoney(amount));

        //withdraw money
        System.out.println("Enter a amount and password(amount, wrong password for testing)withdraw:");
        int amount1=sc.nextInt();
        String pass=sc.next();
        System.out.println(user.withdrawMoney(amount1,pass));

        System.out.println("Enter a amount and password(amount bigger than balance, password)withdraw:");
        int amount2=sc.nextInt();
        String pass1=sc.next();
        System.out.println(user.withdrawMoney(amount2,pass1));

        System.out.println("Enter a amount and password(withdraw:");
        int amount3=sc.nextInt();
        String pass2=sc.next();
        System.out.println(user.withdrawMoney(amount3,pass2));

        //Check Interest;
        System.out.println("check interest:");
        int year=sc.nextInt();
        System.out.println(user.checkInterest(year));





    }
}