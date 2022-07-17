package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Expense {
    // класс конструктора

    /**
     *
     */


    private LocalDate date;


    private BigDecimal expense;


    private String reason;


    public Expense(LocalDate date, BigDecimal expense, String reason) {
        this.date = date;
        this.expense = expense;
        this.reason = reason;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Expense() {

    }


}





