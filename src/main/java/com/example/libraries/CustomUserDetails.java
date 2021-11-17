package com.example.libraries;

import com.example.libraries.Entity.MembersLogin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails  implements UserDetails {
    private MembersLogin m;

    public CustomUserDetails(MembersLogin m){
        this.m = m;
    }

    public Collection<? extends GrantedAuthority> getAuthorities(){

        return null;
    }
    public String getPassword(){
        return m.getPassword();

    }

    public String getUsername(){
        return m.getReadername();

    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
