package com.example.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    /*@Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        builder.username("postgres");
        builder.password("trogir");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }*/
}
