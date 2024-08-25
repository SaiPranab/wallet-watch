package com.walletwatch.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.walletwatch.model.Expense;
import com.walletwatch.repository.ExpenseRepository;
import com.walletwatch.service.IExpenseService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ExpenseServiceImpl implements IExpenseService{
    private final ExpenseRepository expenseRepository;

    @Override
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    
    @Override
    public Expense getExpenseById(String expenseId) {
        return expenseRepository.findById(expenseId).orElseThrow(() -> new RuntimeException("Expense with id " + expenseId+ " not found"));
    }

    @Override
    public Expense updateExpense(String expenseId, Expense newExpense) {
        if(!expenseRepository.existsById(expenseId)){
            throw new RuntimeException("Expense with id " + expenseId+ " not found");
        }
        
        newExpense.setExpenseId(expenseId);
        return expenseRepository.save(newExpense);
    }

    @Override
    public Expense deleteExpense(String expenseId) {
        var expense = getExpenseById(expenseId);
        expenseRepository.delete(expense);
        return expense;
    }

    
}
