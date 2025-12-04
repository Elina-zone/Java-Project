import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*==============================================================================================*");
        System.out.println("*  iiiiiii  n        n  v        v  eeeeeee  n        n  ttttttt  ooooooo  rrrrrrr  y       y  *");
        System.out.println("*     i     n  n     n   v      v   e        n  n     n     t     o     o  r     r    y    y   *");
        System.out.println("*     i     n    n   n    v    v    eeeeeee  n    n   n     t     o     o  r  r         y      *");
        System.out.println("*     i     n      n n     v  v     e        n      n n     t     o     o  r     r      y      *");
        System.out.println("*  iiiiiii  n        n      v       eeeeeee  n        n     t     ooooooo  r     r      y      *");
        System.out.println("*==============================================================================================*");  
        System.out.println("*                           WELCOME TO INVENTORY MANAGEMENT SYSTEM                             *");
        System.out.println("*                                     MR. KHURRAM IQBAL                                        *");  
        System.out.println("*----------------------------------------------------------------------------------------------*");
        System.out.println("*                                    Group Members                                             *");
        System.out.println("*                                  FA25-BDS-006: Aleena                                        *");
        System.out.println("*                                  FA25-BDS-008: Alishba                                       *");
        System.out.println("*==============================================================================================*");
        System.out.println();

        int choice;
        do {
            System.out.println("+--------------------------------------+");
            System.out.println("|              LOGIN MENU              |");
            System.out.println("+--------------------------------------+");
            System.out.println("|    1 --> Admin Login                 |");
            System.out.println("|    2 --> Staff Login                 |");
            System.out.println("|    3 --> Exiting..Good Bye!!         |");
            System.out.println("+--------------------------------------+");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (adminLogin(sc)) {
                        adminMenu(sc);
                    }
                    break;
                case 2:
                    if (staffLogin(sc)) {
                        staffMenu(sc);
                    }
                    break;
                case 3:
                    System.out.println("Exiting..Good Bye!!");
                    break;
                default:
                    System.out.println("Invalid choice....Please Retry!!");
            }
        }
        while (choice != 3);
        sc.close();
    }
    // Admin login
    public static boolean adminLogin(Scanner sc) {
        final String adminUsername = "admin";
        final String adminPassword = "admin1234";

        System.out.println("=========================================");
        System.out.println("||            ADMIN LOGIN              ||");
        System.out.println("=========================================");
        //System.out.println("||      1. Username:_______________    ||");
        //System.out.println("||      2. Password:_______________    ||");
        //System.out.println("||      3. Exit the System.            ||");
        //System.out.println("=========================================");

        System.out.println("Enter Admin Username: ");
        String username = sc.nextLine();
        System.out.println("Enter Admin login Password: ");
        String password = sc.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Admin Login Successful! Let's run this system.");
            System.out.println();
            return true;
        }
        else {
            System.out.println("Oops! Login failed. try again!!");
            return false;
        }
    }

    // Staff login
    public static boolean staffLogin(Scanner sc) {
        final String staffUsername = "staff";
        final String staffPassword = "staff1234";

        System.out.println("=========================================");
        System.out.println("||            STAFF LOGIN              ||");
        System.out.println("=========================================");
        //System.out.println("||      1. Username:_______________    ||");
        //System.out.println("||      2. Password:_______________    ||");
        //System.out.println("||      3. Exit the System.            ||");
        //System.out.println("=========================================");

        System.out.println("Enter Staff Username: ");
        String username = sc.nextLine();
        System.out.println("Enter Staff login Password: ");
        String password = sc.nextLine();

        if (username.equals(staffUsername) && password.equals(staffPassword)) {
            System.out.println("Staff Login Successful! Let's manage the tasks.");
            System.out.println();
            return true;
        }
        else {
            System.out.println("Oops! Login failed. try again!!");
            return false;
        }
    }

    public static void adminMenu(Scanner sc) {
        int option;
        do {
            System.out.println("******************************************");
            System.out.println("*               ADMIN MENU               *");
            System.out.println("*----------------------------------------*");
            System.out.println("*Select the option you'd like to explore *");
            System.out.println("*      (Options range from 1 to 6)       *");
            System.out.println("*                                        *");
            System.out.println("*   1. Manage Categories                 *");
            System.out.println("*   2. Manage Products                   *");
            System.out.println("*   3. Manage Customers                  *");
            System.out.println("*   4. Manage Sales Orders               *");
            System.out.println("*   5. Manage Suppliers                  *");
            System.out.println("*   6. Logout                            *");
            System.out.println("*   7. Back to Login Menu                *");
            System.out.println("******************************************");
    
            System.out.println("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    manageCatogeriesMenu(sc);
                    break;
                case 2:
                    manageProductsMenu(sc); 
                    break;
                case 3:
                    manageCustomersMenu(sc);
                    break;
                case 4:
                    manageSalesOrdersMenu(sc);
                    break;
                case 5:
                    manageSuppliersMenu(sc);
                    break;
                case 6:
                    System.out.println("Logging out...");
                case 7:
                    return;  // yaha sa user wapis login menu par ja sakta hai
                default:
                    System.out.println("Invalid option!");
            }
        }
        while (option != 7);
    }
    // Sub menus
    public static void manageCatogeriesMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("=====MANAGE CATEGORIES=====");  
            System.out.println("     1-> Add               ");
            System.out.println("     2-> View              ");
            System.out.println("     3-> Delete            ");
            System.out.println("     4-> Back              ");
            System.out.println("===========================");
        
            System.out.println("Choose Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Adding Category..."); 
                    break;
                case 2:    
                    System.out.println("Viewing Categories..."); 
                    break;
                case 3: 
                    System.out.println("Deleting Category..."); 
                    break;
                case 4: 
                    return; // back to admin menu
                default:    
                    System.out.println("Invalid option!"); 
                    break;
            }
        }
        while (choice != 4);
    }

    public static void manageProductsMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("=====MANAGE PRODUCTS=====");
            System.out.println("      1-> Add            ");
            System.out.println("      2-> View           ");
            System.out.println("      3-> Delete         ");
            System.out.println("      4-> Back           ");
            System.out.println("=========================");
        
            System.out.println("Choose Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Adding Product..."); 
                    break;
                case 2:    
                    System.out.println("Viewing Product..."); 
                    break;
                case 3: 
                    System.out.println("Deleting Product..."); 
                    break;
                case 4: 
                    return; // back to admin menu
                default:    
                    System.out.println("Invalid option!"); 
                    break;
            }
        }
        while (choice != 4);
    }

    public static void manageCustomersMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("====MANAGE CUSTOMERS====");
            System.out.println("       1-> Add          ");
            System.out.println("       2-> View         ");
            System.out.println("       3-> Delete       ");
            System.out.println("       4-> Back         ");
            System.out.println("========================");
            
            System.out.println("Choose Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Adding Customers..."); 
                    break;
                case 2:    
                    System.out.println("Viewing Customers..."); 
                    break;
                case 3: 
                    System.out.println("Deleting Customers..."); 
                    break;
                case 4: 
                    return; // back to admin menu
                default:    
                    System.out.println("Invalid option!"); 
                    break;
            }
        }
        while (choice != 4);
    }

    public static void manageSalesOrdersMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("====MANAGE SALES ORDERS====");
            System.out.println("       1-> Add             ");
            System.out.println("       2-> View            ");
            System.out.println("       3-> Delete          ");
            System.out.println("       4-> Back            ");
            System.out.println("===========================");
            
            System.out.println("Choose Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Adding Sales Orders..."); 
                    break;
                case 2:    
                    System.out.println("Viewing Sales Orders..."); 
                    break;
                case 3: 
                    System.out.println("Deleting Sales Orders..."); 
                    break;
                case 4: 
                    return; // back to admin menu
                default:    
                    System.out.println("Invalid option!"); 
                    break;
            }
        }
        while (choice != 4);
    }
        
    public static void manageSuppliersMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("====MANAGE SUPPLIERS====");
            System.out.println("       1-> Add          ");
            System.out.println("       2-> View         ");
            System.out.println("       3-> Delete       ");
            System.out.println("       4-> Back         ");
            System.out.println("========================");

            System.out.println("Choose Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Adding Suppliers..."); 
                    break;
                case 2:    
                    System.out.println("Viewing Suppliers..."); 
                    break;
                case 3: 
                    System.out.println("Deleting Sales Suppliers..."); 
                    break;
                case 4: 
                    return; // back to admin menu
                default:    
                    System.out.println("Invalid option!"); 
                    break;
            }
        }
        while (choice != 4);
    }

    public static void staffMenu(Scanner sc) {
        int staffChoice;
        do {
            System.out.println("******************************************");
            System.out.println("*               STAFF MENU               *");
            System.out.println("*----------------------------------------*");
            System.out.println("*Select the option you'd like to explore *");
            System.out.println("*      (Options range from 1 to 5)       *");
            System.out.println("*                                        *");
            System.out.println("*    1. View Products                    *");
            System.out.println("*    2. View Sales Orders                *");
            System.out.println("*    3. Add Sales Orders                 *");
            System.out.println("*    4. View Customers                   *");
            System.out.println("*    5. Logout                           *");
            System.out.println("*    6. Back to Login Menu               *");
            System.out.println("******************************************");
    
            System.out.println("Enter your choice: ");
            staffChoice = sc.nextInt();
            sc.nextLine();

            switch (staffChoice) {
                case 1:
                    System.out.println("Displaying Products...");
                    break;
                case 2:
                    System.out.println("Displaying Sales Orders..."); 
                    break;
                case 3:
                    System.out.println("Adding a new Sales Order...");
                    break;
                case 4:
                    System.out.println("Displaying Customers...");
                    break;
                case 5:
                    System.out.println("Logging out...");
                    break;
                case 6:
                    return; // back to login menu    
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        while (staffChoice != 6);
    }
}

    