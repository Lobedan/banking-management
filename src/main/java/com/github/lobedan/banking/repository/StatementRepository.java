package com.github.lobedan.banking.repository;

import java.util.List;

import com.github.lobedan.banking.domain.Statement;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
public interface StatementRepository extends ElasticsearchCrudRepository<Statement, String> {
  List<Statement> findByFileName(String filename);
}
