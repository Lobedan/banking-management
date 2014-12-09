package com.github.lobedan.banking.domain;

import java.util.List;

import com.github.lobedan.banking.types.AccountType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Document(indexName = "banking", type = "account", shards = 1, replicas = 0, refreshInterval = "-1")
public class Account extends AbstractElasticSearchEntity {
  private String accountNumber;
  private String bankCode;
  private List<Position> positions;
  private List<Statement> statements;
  private AccountType type = AccountType.GIRO;
  private boolean payed = false;

  public Account() {
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String aAccountNumber) {
    accountNumber = aAccountNumber;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String aBankCode) {
    bankCode = aBankCode;
  }

  public List<Position> getPositions() {
    return positions;
  }

  public void setPositions(List<Position> aPositions) {
    positions = aPositions;
  }

  public List<Statement> getStatements() {
    return statements;
  }

  public void setStatements(List<Statement> aStatements) {
    statements = aStatements;
  }

  public AccountType getType() {
    return type;
  }

  public void setType(AccountType aType) {
    type = aType;
  }

  public boolean isPayed() {
    return payed;
  }

  public void setPayed(boolean aPayed) {
    payed = aPayed;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("accountNumber", accountNumber)
        .append("bankCode", bankCode)
        .append("positions", positions)
        .append("statements", statements)
        .append("type", type)
        .append("payed", payed)
        .toString();
  }
}
