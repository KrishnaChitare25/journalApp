package com.krishna.journalApp.service;

import com.krishna.journalApp.Repository.UserRepository;
import com.krishna.journalApp.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import static org.mockito.Mockito.*;

@ActiveProfiles("dev")
public class UserDetailsServiceImplTests {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository; // @MockBean for older version

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void loadUserByUserNameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
                .thenReturn(User.builder()
                        .userName("ram")
                        .password("xyznn")
                        .roles(new ArrayList<>())
                        .build()
                );

        UserDetails user = userDetailsService.loadUserByUsername("ram");
        Assertions.assertNotNull(user);
    }
}
