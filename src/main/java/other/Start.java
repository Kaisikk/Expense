package other;

import java.util.Scanner;

public class Start {

    /**
     *
     */

    public void start() {

        // метод нужен для того чтобы пользователь выбрал, хочет он получить информацию или добавить новую

        System.out.println("Эта программа предназначенна для учета ваших расходов, а также для записи ваших доходов");
        while (true) {
            System.out.println("Введите команду 'addexpense' для того чтобы добавить ваши расходы");
            System.out.println("Введите команду 'addincome' чтобы добавить ваши доходы");
            System.out.println("Введите команду 'getexpense' чтобы узнать ваши расходы");
            System.out.println("Введите команду'getincome' чтобы узнать ваши доходы");
            System.out.println("Если вы хотите закрыть программу, то введите комаду 'exit'");
            CommandRealization go = new CommandRealization();
            // тут создается объект класса, который реализует всю дальнейшую работу программы
            Scanner console = new Scanner(System.in);
            String command = console.nextLine();


            switch (command) {
                case ("addexpense"):

                    go.addExpense();
                    break;
                case ("addincome"):
                    go.addIncome();
                    break;
                case ("exit"):
                    System.exit(0);
                    break;
                case ("getexpense"):
                    go.getExpense();
                    break;
                case ("getincome"):
                    go.getIncome();

                    break;
                default:
                    System.out.println("Команда введена неверно, попробуйте еще раз");
                    break;
            }
        }
    }
}
