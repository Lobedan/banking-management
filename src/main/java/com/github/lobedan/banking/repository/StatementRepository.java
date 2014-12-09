package com.github.lobedan.banking.repository;

import com.github.lobedan.banking.domain.Statement;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Repository
public interface StatementRepository extends ElasticsearchCrudRepository<Statement, String> {

  Statement findById(String id);

}
