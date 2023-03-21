package com.cg.ccpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ccpa.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {

}
