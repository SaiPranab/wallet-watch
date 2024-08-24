package com.walletwatch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Account {

    private String accoutnId;
    private String accountHolderName;
    private String contactNumber;
}
