package Homework.Bank;
import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome;
    Period between = Period.between(lastIncome, LocalDate.now());



    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);

    }

    @Override
    public void take(double amountToTake) {
        lastIncome = LocalDate.now();
       if (between.getMonths() >1){
           System.out.println("Вы сняли указанную сумму");
           super.take(amountToTake);
       } else if(between.isZero()){
           System.out.println("C последнего пополнения прошло менее 30 дней");
       }else{
           System.out.println("Недостаточно средств");
       }


    }
}


