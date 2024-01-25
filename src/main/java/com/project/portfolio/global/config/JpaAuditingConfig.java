package com.project.portfolio.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaAuditingConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("test"); // TODO: 현재는 임의의 데이터를 넣어놓았다. 추후 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정하자
    }

}
