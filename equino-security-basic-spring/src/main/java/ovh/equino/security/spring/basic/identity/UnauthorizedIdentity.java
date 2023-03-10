package ovh.equino.security.spring.basic.identity;

import org.springframework.security.core.userdetails.UserDetails;
import ovh.equino.security.identity.Identity;

import java.util.Collection;

import static java.util.Collections.emptyList;

class UnauthorizedIdentity implements Identity, UserDetails {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return emptyList();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
