package userInput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateInput {

    /**
     *
     * @return
     */

    public LocalDate date() {

        // в методе пользователь вводит дату, с которой хочет в дальнейшем работать

        while (true) {
            System.out.println("Если выхотите узнать или внести данные за сегодня, введите команду: 'next' ");
            System.out.println("Если вы хотите внести или узнать данные за другой день, введите команду 'day'");
            Scanner console = new Scanner(System.in);
            String check = console.nextLine();
            switch (check) {
                case ("next"):
                    LocalDate defaultDate = LocalDate.now();
                    return defaultDate;
                case ("day"):
                    System.out.println("введите год");
                    int year = console.nextInt();
                    System.out.println("Введите месяц (числом) ");
                    int month = console.nextInt();
                    System.out.println("Введите число месяца");
                    int day = console.nextInt();
                    LocalDate date = LocalDate.of(year, month, day);
                    return date;
                default:
                    System.out.println("Команда введена неверно, попробуйте еще раз");
                    break;
            }
        }
    }


}
