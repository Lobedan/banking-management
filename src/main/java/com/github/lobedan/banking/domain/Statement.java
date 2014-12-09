package com.github.lobedan.banking.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Document(indexName = "banking", type = "statement", shards = 1, replicas = 0, refreshInterval = "-1")
public class Statement extends AbstractElasticSearchEntity {
  private Date date;
  private String fileName;
  private String filePath;
  private String host;

  public Statement() {
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String aFileName) {
    fileName = aFileName;
  }

  public String getFile() {
    return this.filePath + "/" + this.fileName;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date aDate) {
    date = aDate;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String aFilePath) {
    filePath = aFilePath;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String aHost) {
    host = aHost;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("date", date)
        .append("filePath", filePath)
        .append("host", host)
        .toString();
  }
}
