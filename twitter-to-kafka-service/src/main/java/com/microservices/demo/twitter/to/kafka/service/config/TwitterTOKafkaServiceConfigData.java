package com.microservices.demo.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Here we want to read  the twitter keyword values from the application.yml file
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterTOKafkaServiceConfigData {

    private List<String> twitterKeywords;
}
