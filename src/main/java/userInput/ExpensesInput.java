package userInput;

import dto.Expense;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExpensesInput {

    /**
     *
     * @param checker
     * @return
     */

    public BigDecimal expense(int checker) {

        // пользователь вводит сумму доходов/расходов
        if (checker == 0) {
            System.out.println("Введите ваши расходы");
        } else {
            System.out.println("Введите ваши доходы");
        }

        Scanner console = new Scanner(System.in);
        BigDecimal expense = console.nextBigDecimal();
        return expense;


    }


}