package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterTOKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    private final TwitterTOKafkaServiceConfigData twitterTOKafkaServiceConfigData;

    TwitterToKafkaServiceApplication(TwitterTOKafkaServiceConfigData configData ){
          this.twitterTOKafkaServiceConfigData= configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Application Starts ....... ");
        LOG.info(Arrays.toString(twitterTOKafkaServiceConfigData.getTwitterKeywords().toArray(new String[]{})));
        LOG.info(twitterTOKafkaServiceConfigData.getMessage());
    }
}
