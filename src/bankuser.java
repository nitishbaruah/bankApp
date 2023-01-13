import java.util.Objects;
import java.util.UUID;

public class bankuser implements BankInterface {
    //attributes
    private String name;
    private String accountNo;
    private String password;
    private double rateOfInterest;
    private double balance;



    //methods

    public bankuser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest=6.6;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "Your account Balance credited with "+amount+"\nNew Balance "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String checkPassword) {
        if(Objects.equals(password,checkPassword)){
            if(balance<amount) return "Insufficient Balance";
            else {
                balance -= amount;
                return amount + " debited from your account. \n" + "Remaining balance: " + balance;
            }
        }
        else return "Invalid Password";
    }

    @Override
    public Double checkInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
