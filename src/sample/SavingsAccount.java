package sample;

import javax.swing.*;

//a
public class SavingsAccount extends BankAccount{
    //b
    private double interest,maxWithLimit;
    //c
    SavingsAccount(String memberName,double accountBalance,double maxWithLimit)
    {
        super(memberName, accountBalance, 2000);
        this.interest = 0.05;
        this.maxWithLimit = maxWithLimit;
    }

    //h

    public double getInterestRate() { return interest; }
    public void setInterestRate(double intRate) {
        this.interest = intRate;
    }

    public double getMaxWithLimit() { return maxWithLimit; }
    public void setMaxWithLimit(double maxWithLim) {
        this.maxWithLimit = maxWithLim;
    }


    //d
    private double calculateInterest(){
        return getAccountBalance()*interest;
    }

    //e
    public double getNetBalance(){
        return calculateInterest()+getAccountBalance();
    }

    //f
     /*
    public void withdraw(double withAmount){
        if(withAmount<calculateInterest()){
            super.withdraw(withAmount);
        }
        else{
            System.out.println("Withdraw Limit Surpassed");
        }
    }
    */
    @Override
    public void withdraw(double withdrawAmount) throws InsufficientBalanceException{
        if(withdrawAmount<=maxWithLimit) {
            try {
                super.withdraw(withdrawAmount);
            } catch (InsufficientBalanceException money) {
                money.printStackTrace();
            }
        }
        else {
            //System.out.println("Not Sufficiant balance");
            JOptionPane.showMessageDialog(null,"Insufficient balance");

        }
    }

    //g
    /*
    public void display(){
        super.display();
        System.out.println("\nInterest: "+calculateInterest()+"\nMax Withdraw Limit: "+calculateInterest());
        System.out.printf("\n");
    }

     */
    @Override
    public String toString() {
        return  "\nSavings Account" +
                "\nAccount Holder Name : " + getMemberName() +
                "\nAccount Number         : " + getAccountNumber() +
                "\nAccount Balance          : " + getAccountBalance() +
                "\nInterest                        : " + calculateInterest() +
                "\nMaximum Withdraw Limit : " + maxWithLimit ;
    }

}