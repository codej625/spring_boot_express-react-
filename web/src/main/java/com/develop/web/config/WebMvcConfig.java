package com.develop.web.config;

import com.develop.web.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor())
                .addPathPatterns("/**")
                    .excludePathPatterns("/")
    //                .excludePathPatterns("/{path}/index")
                    .excludePathPatterns("/config/**")
                    .excludePathPatterns("/static/**")
                    .excludePathPatterns("/config/**");
    }

}