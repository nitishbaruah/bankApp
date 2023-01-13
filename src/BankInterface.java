public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String checkPassword);
    Double checkInterest(int years);




}
