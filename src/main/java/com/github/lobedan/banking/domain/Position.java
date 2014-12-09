package com.github.lobedan.banking.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Document(indexName = "banking", type = "position", shards = 1, replicas = 0, refreshInterval = "-1")
public class Position extends AbstractElasticSearchEntity {
  private Date date;
  private String description;
  private Payee payee;
  private String purpose;

  public Position() {
  }

  public Date getDate() {

    return date;
  }

  public void setDate(Date aDate) {
    date = aDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String aDescription) {
    description = aDescription;
  }

  public Payee getPayee() {
    return payee;
  }

  public void setPayee(Payee aPayee) {
    payee = aPayee;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String aPurpose) {
    purpose = aPurpose;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("date", date)
        .append("description", description)
        .append("payee", payee)
        .append("purpose", purpose)
        .toString();
  }
}
