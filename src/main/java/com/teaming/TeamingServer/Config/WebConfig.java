package com.teaming.TeamingServer.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 스프링 서버 전역적으로 CORS 설정
@Configuration
public class WebConfig implements WebMvcConfigurer {

    String[] accessURL = {"http://localhost:3000", "https://localhost:3000", "https://teaming-six.vercel.app", "http://teaming-six.vercel.app"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(accessURL) // 허용할 출처
                .allowedMethods("GET", "POST", "PATCH", "DELETE", "OPTIONS") // 허용할 HTTP method
                .allowedHeaders("*")
                .allowCredentials(true) // 쿠키 인증 요청 허용
                .maxAge(3000); // 원하는 시간만큼 pre-flight 리퀘스트를 캐싱
    }
}
