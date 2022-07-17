package userInput;

import java.util.Scanner;

public class ReasonInput {

    /**
     *
     * @param checker
     * @return
     */

    public String expenseReason(int checker) {

// пользователь вводит причину своих расходов или источник доходов
        if (checker == 0) {

            System.out.println("Пожалуйста, введите причину ваших расходов");
        } else {
            System.out.println("Введите источник ваших доходов");
        }
        Scanner console = new Scanner(System.in);
        String reason = console.nextLine();
        return reason;
    }

}
