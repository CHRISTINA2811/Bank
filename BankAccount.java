package Homework.Bank;



public class BankAccount {
    double amount;

    public double getAmount() {

        return amount;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;// пополнение
        }}


        public void take(double amountToTake) {
            if (amountToTake > 0 && amountToTake <= amount) {
                amount -= amountToTake;//. При попытке снять большую сумму, чем есть на счёте, сумма не списывается со счёта, сумма на счёте не изменяется.
            }
        }
    }