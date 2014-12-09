package com.github.lobedan.banking.domain;

import org.springframework.data.annotation.Id;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
public class AbstractElasticSearchEntity {

  @Id
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String aId) {
    id = aId;
  }
}
