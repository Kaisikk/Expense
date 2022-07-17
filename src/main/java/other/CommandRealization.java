package other;


import dto.CreateItem;
import dto.Expense;
import fileServise.AddToFile;
import fileServise.ReadList;
import userInput.DateInput;

import java.time.LocalDate;
import java.util.List;

public class CommandRealization {

    /**
     *
     */


    public final String expenseFile = "Expense";
    public final String incomeFile = "Income";
    // переменные содержат имена файлов для записи или чтения

    public void addExpense() {


        Expense item = new CreateItem().newItem(0);
        // создается новый объект конструктора в методе newItem класс CreateItem
        ReadList reader = new ReadList();
        List<Expense> list = reader.readFromFile(expenseFile);
        // метод reader класс ReadList читает данные из файла и записывает в лист list
        list.add(item);
        // в list добавляется новый объект
        AddToFile add = new AddToFile();
        add.writeToFile(list, expenseFile);
        // файл перезаписывается, туда добавляется новый лист


    }


    public void addIncome() {

        Expense item = new CreateItem().newItem(1);
        // создается новый объект конструктора в методе newItem класс CreateItem
        ReadList reader = new ReadList();
        List<Expense> list = reader.readFromFile(incomeFile);
        // метод reader класс ReadList читает данные из файла и записывает в лист list
        list.add(item);
        // в list добавляется новый объект
        AddToFile add = new AddToFile();
        add.writeToFile(list, incomeFile);
        // файл перезаписывается, туда добавляется новый лист
    }


    public void getExpense() {

        List<Expense> list = new ReadList().readFromFile(expenseFile);
        // метод readFromFile получает list с объектами конструктора

        LocalDate date = new DateInput().date();
        // пользователь вводит дату, за которую желает получить данные о расходах
        Sorting sort = new Sorting();
        sort.sortExpense(list, date);
        // метод сортирует данные и выводит для пользователя
    }


    public void getIncome() {
        List<Expense> list = new ReadList().readFromFile(incomeFile);
        // метод readFromFile получает list с объектами конструктора

        LocalDate date = new DateInput().date();
        // пользователь вводит дату, за которую желает получить данные о расходах
        Sorting sort = new Sorting();
        sort.sortIncome(list, date);
        // метод сортирует данные и выводит для пользователя

    }
}


