import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Method m = new Method();

        Scanner scan = new Scanner(System.in);
    loop: while(true){
        System.out.println("Menu: \n1. Deposit\n2. Withdraw \n3. Display\n4. Exit");
        int choose = scan.nextInt();
    
        switch (choose) {
            case 1:
                System.out.println("Enter Ammount");
                int a = scan.nextInt();
                m.deposit(a);
                break;
            case 2:
                System.out.println("Enter Ammount");
                int ammount = scan.nextInt();
                m.withdraw(ammount);
                break;
            case 3:
                m.display();
            break;
            case 4:
                System.out.println("Exit Bank");
                break loop;
            default:

                break;
        }
    }
        scan.close();
    }
}