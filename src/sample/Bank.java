package sample;
import javax.swing.*;
import java.util.ArrayList;
public class Bank {
    ArrayList<BankAccount> accounts= new ArrayList<>();

    //a
    private String addAccount(BankAccount acc){
        accounts.add(acc);
        return acc.getAccountNumber();
    }

    //b
    public String addAccount(String memberName,double accountBalance,double maxWithLimit){
        SavingsAccount account = new SavingsAccount(memberName,accountBalance,maxWithLimit);
        String acN=addAccount(account);
        return acN;

    }

    //c
    public String addAccount(String memberName,double accountBalance,String tradeLicense){
        CurrentAccount account2= new CurrentAccount(memberName,accountBalance,tradeLicense);
        String acN2=addAccount(account2);
        return acN2;
    }

    //d
    private BankAccount findAccount(String accountNum) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNum))
                return accounts.get(i);
        }
        return null;
    }

    //e
    void deposit(String accountNum,double amt){
        BankAccount bac=findAccount(accountNum);{
            if(bac!=null) {
                bac.deposit(amt);
                JOptionPane.showMessageDialog(null, "Depost Successful");
            }
            else
                //System.out.println("No "+accountNum+" account exists.");
                // for pop-up
                JOptionPane.showMessageDialog(null,"Account Doesn't found");

        }
    }

    //f
    void withdraw(String accountNum,double amt)throws InsufficientBalanceException {
        BankAccount bac=findAccount(accountNum);{
            if(bac!=null) {
                bac.withdraw(amt);
                JOptionPane.showMessageDialog(null, "Withdrawal Successful");
            }
            else
                // System.out.println("No "+accountNum+" account exists.");
                JOptionPane.showMessageDialog(null,"Account Doesn't found");
        }
    }

    //g
    public double getBalance(String accountNum){
        BankAccount bac=findAccount(accountNum);
        double balance = 0.0;

        if(bac!=null){
            if(bac instanceof SavingsAccount){
                SavingsAccount sac=(SavingsAccount)bac;
                balance= sac.getNetBalance();
            }
            else {
                BankAccount sac=(BankAccount)bac;
                balance=bac.getAccountBalance();
            }
        }
        else //System.out.println("Account "+accountNum+" didn't found");
            JOptionPane.showMessageDialog(null,"Account Doesn't found");
        return balance;
    }

    //h
    public BankAccount display(String accountNum){
        BankAccount bac=findAccount(accountNum);
        if(bac!=null){
            return bac;
        }
        else //System.out.println("Account "+accountNum+" didn't found");
            JOptionPane.showMessageDialog(null,"Account Doesn't found");
        return null;
    }

    //i
    public BankAccount display(int i)
    {
        BankAccount bnk = findAccount(accounts.get(i).getAccountNumber());
        return bnk;
    }

}
