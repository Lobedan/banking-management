package com.github.lobedan.banking.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Document(indexName = "banking", type = "payee", shards = 1, replicas = 0, refreshInterval = "-1")
public class Payee extends AbstractElasticSearchEntity {
  private String name;
  private String description;

  public Payee() {
  }

  public String getName() {
    return name;
  }

  public void setName(String aName) {
    name = aName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String aDescription) {
    description = aDescription;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("name", name)
        .append("description", description)
        .toString();
  }
}
