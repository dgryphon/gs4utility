package com.dg.gs4utility.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/changeAccountInfo").setViewName("changeAccountInfo");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/newRegistration").setViewName("newRegistration");
        registry.addViewController("/configureSettings").setViewName("configureSettings");
    }

}