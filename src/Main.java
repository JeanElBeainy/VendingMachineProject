import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     VendingMachine vm = new VendingMachine();
        Balance balance = new Balance();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Balance: " + balance.getBalance() + "\n");
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                System.out.println("Caught an empty String. Please try again.");
            }
            else if(input.equals("exit")) {
                break;
            }
            else if(input.equals("Admin")) {
                System.out.print("Enter admin password: ");
                String password = scanner.nextLine();
                if(Helper.checkPassword(password)) {
                    Helper.adminPrivilege(vm);
                    }
                else {
                    System.out.println("Invalid password");
                }
            }
            else {
                Helper.userInput(input, vm, balance, order);
            }
        }
    }
}
boolean answer = true;
        if(order.getLength() != 0) {
            while(answer) {
                System.out.println("""
                    Would you like to have a receipt? (y/n)
                    WARNING: receipt will be saved in Documents as "Receipt". Any file named similarly
                    inside your Documents will be overwritten.
                """);
                String input = scanner.nextLine();
                answer = Helper.userReceipt(input, vm, order);
            }
        }
        System.out.println("End of program.");
    
