package sample;
//a
public class CurrentAccount extends BankAccount {
    //b
    private String tradeLicenseNumber;

    //c
    public CurrentAccount(String memberName, double accountBalance, String tradeLicenseNumber)
    {

        super(memberName, accountBalance, 5000);
        this.tradeLicenseNumber = tradeLicenseNumber;
    }

    public String getTradeLicenseNumber()
    {
        return tradeLicenseNumber;
    }
    public void setTradeLicenseNumber(String tradeLicenseNumber)
    {
        this.tradeLicenseNumber = tradeLicenseNumber;
    }

    @Override
    public String toString() {
        return  "\nCurrent Account "+
                "\nAccount Holder Name : " + getMemberName() +
                "\nAccount Number         : " + getAccountNumber() +
                "\nAccount Balance         : " + getAccountBalance()+
                "\nTrade License              : " + tradeLicenseNumber ;
    }


}
