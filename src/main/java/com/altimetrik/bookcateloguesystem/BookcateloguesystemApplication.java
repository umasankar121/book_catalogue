package com.altimetrik.bookcateloguesystem;

import com.altimetrik.bookcateloguesystem.config.BookCatalogueAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BookcateloguesystemApplication {
    static ConfigurableApplicationContext CONTEXT;

    public static ConfigurableApplicationContext getContext() {
        return CONTEXT;
    }

    public static void main(String[] args) {
        CONTEXT = SpringApplication.run(
                new Class<?>[] {BookCatalogueAppConfig.class, BookcateloguesystemApplication.class}, args
        );
    }
}
