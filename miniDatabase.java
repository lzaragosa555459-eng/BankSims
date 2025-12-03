public class miniDatabase{
   
    Main m = new Main();
    private String[] UserNumber = new String[5];
    private int top = -1;

    public void AddNum(String No){

        UserNumber[++top] = No;

    }
    public void getUserNumber(String userNo){
        for(String numbers: UserNumber){
            if((userNo).equals(numbers)){
                System.out.println("Welcome: "+userNo);
            } else {
                System.out.println("Wrong user number. Try again.");
            }
        }

        }
        public int getIndex(){
            return top;
        }
    }


