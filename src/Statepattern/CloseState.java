package Statepattern;

public class CloseState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Cannot suspend closed account!");
    }


    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

}

