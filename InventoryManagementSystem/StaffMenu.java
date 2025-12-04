 import java.util.Scanner;
public class staffMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;  //Varaiable choice bnaya jo user k menu selection ko store krega
        do{   //using do while loop jo menu ko bar bar dikhaye ga jb tak user exit na choose kry
           //Displaying main menu
            System.out.println("===LOGIN MENU===");
            System.out.println("1. Admin Login");
            System.out.println("2. Staff Login");
            System.out.println("3. Exit");
            System.out.print("Choose option:");
            choice = sc.nextInt();
            
            //Switch case for Menu user li choice k according logic execute hota hai
            //agar ham multiple if-else use krein gy to complicated ho jaye ga switch case simple hai
            switch(choice){
                case 1:
                    System.out.println("Admin login(handled by someone else)");  //user ko msg dikhaya k adminlogin isn't here
                    break;
                case 2:
                    System.out.println("Staff Login");
                    System.out.print("Enter username (type 1 for staff):"); //ask for username ur password to verify staff
                    int username = sc.nextInt();
                    System.out.print("Enter password (type 1234):");
                    int password = sc.nextInt();

                    //Staff Validation security aur correct login k lye
                    if(username == 1 && password == 1234){
                        //Staff Menu... giving options for mutliple actions
                        int staffChoice;
                        //using do-while taake menu repeat ho jab tk exit choose na ho
                        do {
                            System.out.println("=== STAFF MENU===");
                            System.out.println("1. Show Username");
                            System.out.println("2. Show Password");
                            System.out.println("3. Exit");
                            
                            System.out.print("Choose option:");
                            staffChoice= sc.nextInt();
                            //Switch Case for Staff Menu (actions perform hongy as per choice)
                            switch (staffChoice){
                             case 1:
             System.out.println("Username: staff");
                                 break;
                             case 2:
             System.out.println(" Password: 1234");
                                  break;
                             case 3:   
             System.out.println("Good Bye!");
                                   break;
                             default:  
             System.out.println("Wrong option!");
                            }
                        } while(staffChoice!= 3);
                    } else { 
                        System.out.println("Wrong username or password,try again");
                    }
                    break;

                  case 3:  //user program sy bahir ja raha
                    System.out.println("Exiting program...God Bye");
                    break;
                  default:  //agar user invalid number enter kare to error msg show kry
                    System.out.println("Wrong choice, try again");
            }
        } while (choice!=3);
    }
}
