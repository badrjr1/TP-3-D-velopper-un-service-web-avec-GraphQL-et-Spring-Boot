package com.example.bankservice.service;

import com.example.bankservice.dtos.transaction.AddWirerTransferRequest;
import com.example.bankservice.dtos.transaction.AddWirerTransferResponse;
import com.example.bankservice.dtos.transaction.GetTransactionListRequest;
import com.example.bankservice.dtos.transaction.TransactionDto;

import java.util.Date;
import java.util.List;
public interface ITransactionService {
    AddWirerTransferResponse wiredTransfer(AddWirerTransferRequest dto);
    List<TransactionDto> getTransactions(GetTransactionListRequest dto);
}
