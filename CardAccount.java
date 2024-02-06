package Homework.Bank;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {

        super.take(amountToTake +(0.01*amountToTake));
        // не забывайте, обращаться к методам и конструкторам родителя
        // необходимо используя super, например, super.put(10D);
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }
}
