package ovh.equino.security.spring.basic.identity;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public interface Identity extends UserDetails, ovh.equino.security.identity.Identity {

    @Override
    String getId();

    @Override
    String getUsername();

    @Override
    String getPassword();


    @Override
    Collection<GrantedAuthority> getAuthorities();

    @Override
    boolean isAccountNonExpired();

    @Override
    boolean isAccountNonLocked();

    @Override
    boolean isCredentialsNonExpired();

    @Override
    boolean isEnabled();
}