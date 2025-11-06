package com.example.bankservice.service;

import com.example.bankservice.dtos.bankaccount.AddBankAccountRequest;
import com.example.bankservice.dtos.bankaccount.AddBankAccountResponse;
import com.example.bankservice.dtos.bankaccount.BankAccountDto;

import java.util.List;

public interface IBankAccountService {
    AddBankAccountResponse saveBankAccount(AddBankAccountRequest dto);
    List<BankAccountDto> getAllBankAccounts();
    BankAccountDto getBankAccountByRib(String rib);
}
