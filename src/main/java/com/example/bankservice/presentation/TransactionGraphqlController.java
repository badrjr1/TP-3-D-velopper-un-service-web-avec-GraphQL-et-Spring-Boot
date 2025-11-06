package com.example.bankservice.presentation;

import lombok.AllArgsConstructor;
import com.example.bankservice.common.CommonTools;
import com.example.bankservice.dtos.transaction.AddWirerTransferRequest;
import com.example.bankservice.dtos.transaction.AddWirerTransferResponse;
import com.example.bankservice.dtos.transaction.GetTransactionListRequest;
import com.example.bankservice.dtos.transaction.TransactionDto;
import com.example.bankservice.service.ITransactionService;
import com.example.bankservice.service.exception.BusinessException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor

public class TransactionGraphqlController {

    private ITransactionService transactionService;
    private CommonTools commonTools;

    @MutationMapping
    public AddWirerTransferResponse addWirerTransfer(@Argument("dto") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }

    @QueryMapping
    public List<TransactionDto> getTransactions(@Argument GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}
