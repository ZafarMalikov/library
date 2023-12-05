package com.example.library.user;



import com.example.library.user.entity.User;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(String name, String password) {
        password = passwordEncoder.encode(password);
        User user = new User(UUID.randomUUID(), name, password,null);
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return userRepository.findByName(name);
    }
}
