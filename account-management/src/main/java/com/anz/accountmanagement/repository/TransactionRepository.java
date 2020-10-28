package com.anz.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.accountmanagement.account.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
