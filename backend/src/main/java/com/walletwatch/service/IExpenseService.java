package com.walletwatch.service;

import java.util.List;

import com.walletwatch.model.Expense;

public interface IExpenseService {
    Expense createExpense(Expense expense);
    
    List<Expense> getAllExpenses();

    Expense getExpenseById(String expenseId);

    Expense updateExpense(String expenseId, Expense newExpense);

    Expense deleteExpense(String expenseId);
}
