//package com.valtech.poc.lifecare.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration {

//	@SuppressWarnings("removal")
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		
//
//		http.csrf().disable();
//		
////		.authorizeRequests().requestMatchers("/buyers", "/sellers/**").hasAnyRole("buyers", "sellers")
////				.requestMatchers("/sellers").hasRole("buyers").antMatchers("/login", "/logout", "/register").anonymous()
////				.anyRequest().authenticated();
//
////		http.formLogin().loginPage("/login").defaultSuccessUrl("/hello").failureUrl("/login?error=true");
//
//		return http.build();
//
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//
//		return new BCryptPasswordEncoder();
//	}
//
//}
