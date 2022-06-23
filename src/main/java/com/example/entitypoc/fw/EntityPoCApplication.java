package com.example.entitypoc.fw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages =
    {
            "com.example.entitypoc.domain",
            "ru.lanit.duidiligence.domainpoc.domain"
    }
)
@EnableJpaRepositories(basePackages = {
        "com.example.entitypoc.adapter.persistence"
})
@ComponentScan(basePackages = "com.example.entitypoc",
    excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = PojoSubject.class),
        @ComponentScan.Filter(type=FilterType.REGEX, pattern="com\\.example\\.entitypoc\\.notdomain\\..*")
    }
)
public class EntityPoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntityPoCApplication.class, args);
    }
}
