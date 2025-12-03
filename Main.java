import java.util.Scanner;
public class Main{
    private static String number;
    public static void main(String [] args){
        Method[] m = new Method[5];
        miniDatabase d = new miniDatabase();
        Scanner scan = new Scanner(System.in);
mainloop: while(true){
        System.out.println("Choose option: 1.Enter 2.Exit");
        int user = scan.nextInt();

        if(user == 2){
            System.out.println("Exit Bank..");
            break mainloop;
        } else if (user == 1){

        System.out.println("1.Login In 2. Sign in");
        int userChoose = scan.nextInt();

        if(userChoose == 2){
             System.out.println("Enter your name: ");
            String name = scan.next();
            System.out.println("Enter Account number: ");
            number = scan.next();

            m = new Method[]{
                new Method(name, number)
            };
            d.AddNum(number);
            
          

        } else if (userChoose == 1) {
           
            System.out.println("Enter number Account");
            String usernum = scan.next();
            d.getUserNumber(usernum);

loop: while(true){
        System.out.println("Menu: \n1. Deposit\n2. Withdraw \n3. Display\n4. Exit");
        int choose = scan.nextInt();
    
        switch (choose) {
            case 1:
                System.out.println("Enter Ammount");
                int a = scan.nextInt();
                m[d.getIndex()].deposit(a);
                break;
            case 2:
                System.out.println("Enter Ammount");
                int ammount = scan.nextInt();
                m[d.getIndex()].withdraw(ammount);
                break;
            case 3:
                m[d.getIndex()].display();
            break;
            case 4:
                System.out.println("Exit Bank..");
                break loop;
            default:
                System.out.println("Invalid Input! Try again");
                break;
        }
    }
}
        }
        
       
    }
    scan.close();
}
    public String getNumber(){
        return number;
    }
}
