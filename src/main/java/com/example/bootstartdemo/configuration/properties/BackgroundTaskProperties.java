package com.example.bootstartdemo.configuration.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "background-executor")
@Getter
@Setter
public class BackgroundTaskProperties {
    private Boolean enabled;

    private String defaultExecutor;

    private int tasksSize;

    @NestedConfigurationProperty
    private CronExecutorProperties cron;

    @NestedConfigurationProperty
    private TimeExecutorProperties time;

}
