package com.altimetrik.bookcateloguesystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableJpaRepositories(basePackages = {"com.altimetrik.bookcateloguesystem.repo"})
@Configuration
public class BookCatalogueAppConfig {
}
