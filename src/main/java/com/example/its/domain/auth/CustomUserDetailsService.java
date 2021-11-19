package com.example.its.domain.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("tom".equals(username)) {
            return new CustomUserDetails("tom", "password", Collections.emptyList());
        }
        throw new UsernameNotFoundException(
          "Given username is not found. (username = '" + username + "')"
        );
    }
}
