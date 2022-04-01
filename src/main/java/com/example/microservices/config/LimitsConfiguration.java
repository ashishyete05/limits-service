package com.example.microservices.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@ConfigurationProperties("limits-service")
@Component
public class LimitsConfiguration {

    private int minimum;
    private int maximum;
}
