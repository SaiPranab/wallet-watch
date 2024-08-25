package com.walletwatch.model;

import java.time.LocalDate;

import com.walletwatch.constant.ExpenseCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String expenseId;
    private double expenseAmount;
    private String expenseDescription;
    @Enumerated(EnumType.STRING)
    private ExpenseCategory expenseCategory;
    private LocalDate expenseDate;
}
