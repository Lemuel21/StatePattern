package Statepattern;

public class SuspendedState implements AccountState{
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("Suspended Account cannot deposit");
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("Suspended Account cannot withdraw");
        account.toString();
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new CloseState());
        System.out.println("Account is closed!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended");
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is Activated!");
    }

}
