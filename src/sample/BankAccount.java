package sample;

public abstract class BankAccount {
    //a 4 private instance variables
    private String memberName,accountNumber;
    private double accountBalance,minimumBalance;

    //b constructor
    BankAccount(String memberName, double accountBalance, double minimumBalance){
        this.memberName=memberName;
        this.accountBalance=accountBalance;
        this.minimumBalance=minimumBalance;
        ///this.accountNumber
        String acNum = 1000 + (int)(Math.random() * 89999) + "";
        this.accountNumber= acNum;
    }

    //c
    public void deposit(double depAmount){
        // BankAccount b=findAccount(accountNumber);
        accountBalance=depAmount+accountBalance;
    }

    //d
     /*
    public void withdraw(double withAmount){
        if(withAmount<=accountBalance){
            accountBalance=accountBalance-withAmount;
        }
        else System.out.println("Insufficient Balance");
    }
    */
    public void withdraw(double withAmount) throws  InsufficientBalanceException{
        if(this.getAccountBalance()-withAmount>=minimumBalance)
        {
            this.setAccountBalance(this.getAccountBalance() - withAmount);
            System.out.println("Amount withdrawn");
        }
        else {
            throw new InsufficientBalanceException(this.getAccountBalance()-withAmount);
        }
    }

    //e
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance() {return accountBalance;}
    public String getAccountNumber() { return accountNumber;}

    public String getMemberName() {return memberName;}
    public void setMemberName() {this.memberName= memberName; }

    public double getMinimumBalance() { return minimumBalance; }
    public void setMinimumBalance(double minimumBalance) {this.minimumBalance = minimumBalance; }

    //f


}