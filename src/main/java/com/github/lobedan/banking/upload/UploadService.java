package com.github.lobedan.banking.upload;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
public interface UploadService {
  boolean upload(String filePath);

  String download(String id);
}
