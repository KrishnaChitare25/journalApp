package com.krishna.journalApp.service;

import com.krishna.journalApp.Repository.UserRepository;
import com.krishna.journalApp.entity.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    @Disabled
    public void testFindByUserName(){
        assertEquals(4, 2+2);
        User user = userRepository.findByUserName("ram");
        assertTrue(!user.getJournalEntries().isEmpty());
    }

//    @Disabled
//    @ParameterizedTest
//    @ValueSource(strings = {
//            "ram",
//            "shyam",
//            "krishna"
//    })
//    public void testFindByUserNamee(String name){
//        assertNotNull(userRepository.findByUserName(name), "failed for: "+name);
//    }

//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user){
//        assertTrue(userService.saveNewUser(user));
//    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
           "1,1,2",
            "2,10,12",
            "3,3,6"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a + b);
    }
}
