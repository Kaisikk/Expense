package dto;

import userInput.DateInput;
import userInput.ExpensesInput;
import userInput.ReasonInput;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateItem {

    /**
     *
     * @param checker
     * @return
     */

    public Expense newItem(int checker) {
        // в методе создается новый объект конструктора
        // переменная checker нужна для разного вывода для пользователя

        DateInput dateSelection = new DateInput();
        LocalDate date = dateSelection.date();
        // тут получаем дату
        BigDecimal expense = new ExpensesInput().expense(checker);
        // тут получаем количество расходов/доходов
        String reason = new ReasonInput().expenseReason(checker);
        // тут пользователь вводит причину расходов/доходов
        Expense item = new Expense(date, expense, reason);
        return item;

    }
}
