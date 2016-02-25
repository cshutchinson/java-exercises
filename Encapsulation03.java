
class Account {
  private int balance = 0;

  public int getBalance(){
    return this.balance;
  }

  public void setBalance(int amount){
    this.balance = amount;
  }

  public void deposit(int amount){
    this.balance += amount;
  }

  public void withdraw(int amount){
    this.balance -= amount;
  }

}

class Transfer {
  Account sourceAccount;
  Account destinationAccount;

  Transfer(Account sourceAccount, Account destinationAccount) {
    this.sourceAccount = sourceAccount;
    this.destinationAccount = destinationAccount;
  }

  void transfer(int amount) {
    sourceAccount. withdraw(amount);
    destinationAccount.deposit(amount);
  }
}

class Encapsulation03 {
  public static void main(String[] args){
    Account sourceAccount = new Account();
    Account destinationAccount = new Account();

    sourceAccount.setBalance(500);
    destinationAccount.setBalance(750);

    Transfer t = new Transfer(sourceAccount, destinationAccount);
    t.transfer(250);

    System.out.println(sourceAccount.getBalance());
    System.out.println(destinationAccount.getBalance());
  }
}
