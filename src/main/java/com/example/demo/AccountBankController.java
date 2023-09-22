package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class AccountBankController {
	@Autowired
	private BankService accountService;

	@GetMapping
	public List<BankAccount> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@PostMapping
	public BankAccount createAccount(@RequestBody BankAccount account) {
			return accountService.createAccount(account);
	}

	@GetMapping("/{id}")
	public BankAccount getAccountById(@PathVariable Long id) {
			return accountService.getAccountById(id);
	}
}
