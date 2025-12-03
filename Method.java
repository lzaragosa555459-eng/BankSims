public class Method{
    private int money = 0;
    private int dep = 0;
    private int wit = 0;
    private String name;
    private String number;
    public boolean isEmpty(){
        return money == 0;
    }
    public Method(){

    }
    public Method(String name, String number){
        this.name = name;
        this.number = number;
        
    }

    public void deposit(int ammount){
       money = ammount + money;
       dep+=ammount;
       System.out.println("Ammount Deposited: "+ammount);
    }

    public void withdraw(int ammount){
        if(isEmpty()){
            System.out.println("No money currently in your bank Account");
        } else {
            money = money - ammount;
            wit+=ammount;
            System.out.println("Ammount Withdrawed: "+ammount);
        }
        
    }
    
    public void display(){
        System.out.println("Your Account// Name: "+this.name+" Account Number: "+this.number);
        System.out.println("Current Money: "+money);
        System.out.println("Total Ammount Deposited: "+dep);
        System.out.println("Total Deposited: "+wit);
    }
}
