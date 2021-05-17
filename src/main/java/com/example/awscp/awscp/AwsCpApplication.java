package com.example.awscp.awscp;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;

@SpringBootApplication(exclude = ContextInstanceDataAutoConfiguration.class)
public class AwsCpApplication {

  private final AmazonS3Client amazonS3Client;

  public AwsCpApplication(AmazonS3Client amazonS3Client) {
    this.amazonS3Client = amazonS3Client;
  }

  public static void main(String[] args) {
    SpringApplication.run(AwsCpApplication.class, args);
  }
}
