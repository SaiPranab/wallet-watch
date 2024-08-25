package com.walletwatch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walletwatch.model.Expense;
import com.walletwatch.service.IExpenseService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/api/v1/expense")
@RequiredArgsConstructor
public class ExpenseController {
    private final IExpenseService expenseService;

    @GetMapping()
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{expenseId}")
    public Expense getExpenseById(@PathVariable String expenseId) {
        return expenseService.getExpenseById(expenseId);
    }

    @PostMapping()
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.createExpense(expense);
    }

    @PutMapping("/{expenseId}")
    public Expense updateExpense(@PathVariable String expenseId,@RequestBody Expense expense) {
        return expenseService.updateExpense(expenseId, expense);
    }

    @DeleteMapping("/{expenseId}")
    public Expense deleteExpense(@PathVariable String expenseId){
        return expenseService.deleteExpense(expenseId);
    }
}
