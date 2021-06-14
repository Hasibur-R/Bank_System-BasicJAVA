package sample;

public class InsufficientBalanceException extends Exception {

    public void InsufficientBalanceException(String amt) {

    }

    public InsufficientBalanceException(double amt) {
        // TODO Auto-generated constructor stub
        super("Can't Withdraw more then " +amt+ "Taka");
    }

}