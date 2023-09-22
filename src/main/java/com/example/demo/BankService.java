package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@Service
public class BankService {
    @Autowired
    private BankRepository accountRepository;
    public List<BankAccount> getAllAccounts() {
        return accountRepository.findAll();
    }
    public BankAccount createAccount(BankAccount account) {
        account.setCreatedDate(new Date());
        /*account.setStatus(AccountStatus.ACTIVE);
        account.setStatus(AccountStatus.CLOSED); */
        return accountRepository.save(account);
    }
    public BankAccount getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }
}

