import java.io.IOException;

public class Admin {

    public Admin() {

    }

    public void listCommand() {
        Helper.listAdminCommands();
    }

    public void list(VendingMachine vm) {
        vm.displayStock();
    }

    public void removeItem(VendingMachine vm, int row, int col) throws IOException {
        vm.removeItem(row, col);
    }

    public void addItem(VendingMachine vm, String type, String name, double price, int quantity, int row, int col) throws IOException {
        vm.addItem(type, name, price, quantity, row, col);
    }
}
