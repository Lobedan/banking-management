package com.github.lobedan.banking.controller;

import com.github.lobedan.banking.upload.UploadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author svenklemmer
 * @since banking-management 0.1.0
 */
@RestController
public class FileUploadController {

  @Autowired
  private UploadService uploadService;

  /**
   * uploads a file and stores it in datastorage on a given host
   * taskes hosts from elasticsearchconfiguration
   */
  @RequestMapping(value = "/statement/upload", method = { RequestMethod.POST, RequestMethod.POST })
  public String uploadStatement(@RequestBody String filePath) {
    if (uploadService.upload(filePath)) {
      return "{"
             + "\"message\": {"
             + "\"sucessfully uploaded\""
             + "}"
             + "}";
    }
    return null; //TODO: return error statement
  }

  @RequestMapping(value = "/statement/{id}/download", method = RequestMethod.GET)
  public String downloadStatement(@Param("id") String id) {
    return uploadService.download(id);
  }
}
