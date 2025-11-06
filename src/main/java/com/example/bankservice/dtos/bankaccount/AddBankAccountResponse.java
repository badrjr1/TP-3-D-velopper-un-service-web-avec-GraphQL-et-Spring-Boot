package com.example.bankservice.dtos.bankaccount;

import com.example.bankservice.dtos.customer.CustomerDto;
import com.example.bankservice.enums.AccountStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddBankAccountResponse {
    private String message;
    private Long id;
    private String rib;
    private Double amount;
    private String createdAt;
    private AccountStatus accountStatus;
    private CustomerDto customer;
}