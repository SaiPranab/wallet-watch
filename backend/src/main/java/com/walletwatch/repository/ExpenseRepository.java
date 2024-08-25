package com.walletwatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walletwatch.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, String>{
    
}
