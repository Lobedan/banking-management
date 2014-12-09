package com.github.lobedan.banking.repository;

import java.util.List;

import com.github.lobedan.banking.domain.Bank;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Repository
public interface BankRepository extends ElasticsearchRepository<Bank, String> {
  public List<Bank> findByName(String name);
}
