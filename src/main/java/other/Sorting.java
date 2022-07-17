package other;

import dto.Expense;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    // класс с методами для сортировки объектов и вывода данных на экран

    /**
     *
     * @param list
     * @param date
     */


    public void sortExpense(List<Expense> list, LocalDate date) {
// метод сортирует данные о расходах, которые принимает в качестве list и выводит в консоль пользователю
        List<Expense> sortList = list.stream().filter(p -> p.getDate().equals(date)).collect(Collectors.toList());

        if (sortList.isEmpty()) {

            System.out.println(date.toString() + "Вы ничего не потратили");
        } else {
            for (Expense item : sortList) {
                System.out.println(item.getDate().toString() + " Вы потратили " + item.getExpense() + "рублей, причина:" + item.getReason());
            }
        }
    }


    public void sortIncome(List<Expense> list, LocalDate date) {
        // метод сортирует данные о доходах, которые принимает в качестве list и выводит в консоль пользователю

        List<Expense> sortList = list.stream().filter(p -> p.getDate().equals(date)).collect(Collectors.toList());

        if (sortList.isEmpty()) {

            System.out.println(date.toString() + "Вы ничего не заработали");
        } else {
            for (Expense item : sortList) {
                System.out.println(item.getDate().toString() + " Вы заработали " + item.getExpense() + "рублей, источник дохода:" + item.getReason());
            }
        }
    }
}