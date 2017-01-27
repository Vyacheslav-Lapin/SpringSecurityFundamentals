package edu.teldir.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Anton German &lt;AGerman@luxoft.com&gt;
 * @version 1.0 27.04.12
 */
public class MyUserDetailsService implements UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
