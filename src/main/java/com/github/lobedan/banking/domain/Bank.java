package com.github.lobedan.banking.domain;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Document(indexName = "banking", type = "bank", shards = 1, replicas = 0, refreshInterval = "-1")
public class Bank extends AbstractElasticSearchEntity {

  private String name;
  private List<Account> accounts;

  public Bank() {
  }

  public String getName() {
    return name;
  }

  public void setName(String aName) {
    name = aName;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> aAccounts) {
    accounts = aAccounts;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("name", name)
        .append("accounts", accounts)
        .toString();
  }
}
