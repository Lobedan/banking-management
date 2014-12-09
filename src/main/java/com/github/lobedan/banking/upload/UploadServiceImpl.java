package com.github.lobedan.banking.upload;

import com.github.lobedan.banking.domain.Statement;
import com.github.lobedan.banking.repository.StatementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@Service
public class UploadServiceImpl implements UploadService {

  @Autowired
  private StatementRepository repository;

  @Override
  public boolean upload(String filePath) {
    //take filepath and upload
    //receive a fileobject to new location
    //store statement in elasticsearch

    return true;
  }

  @Override
  public String download(String id) {
    Statement statement = repository.findById(id);
    return statement.getFile();
  }
}
