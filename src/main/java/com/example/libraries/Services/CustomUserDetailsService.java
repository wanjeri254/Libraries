package com.example.libraries.Services;

import com.example.libraries.Repository.MembersLoginRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
   private MembersLoginRepository repo;
    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {
        return null;
    }
}
