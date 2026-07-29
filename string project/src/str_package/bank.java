package str_package;

public class bb {
    public static void main(String[] args){
        bank b=new bank();
        b.setpinbn

    }

}
class bank {
    public void setAcc(String acc) {
        this.acc = acc;
    }

    private double balance;
    String acc;
    private int pin;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;


    }

    public int getpin() {
        return pin;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }
    void deposit(int e_pin,double amount){
        if(pin==e_pin)
        {
            balance+=amount;
            System.out.println("deposited");
        }
        else {
            System.out.println("Invalied");
        }

    }
    void withdraw(int e_pin,double amount){
        if(pin==e_pin)
        {
            if(amount>balance)
            {
                System.out.println("insufficient balance");
            }
            else {
                balance-=amount;
                System.out.println("wiyhdrawn");

            }
        }
        else{
            System.out.println("invalied");
        }
    }
    void check(int e_pin){
        if(pin==e_pin)
        {
            System.out.println("Current balance:"+balance);
        }
        else{
            System.out.println("invaled pin");
        }
    }
}
