package Statepattern;

public class ActiveState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit to Account " + depositAmount + "\n" + account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdraw to account " + withdrawAmount + "\n" + account.toString());
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!\n" + account.toString());
        account.setAccountState(new CloseState());
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already Activated");
    }


}
