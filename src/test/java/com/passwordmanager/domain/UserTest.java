package com.passwordmanager.domain;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;    
    
public class UserTest {
        
    @Test
    public void itCreatesClientWithEmptyName() {
        User user = new User();
        assertEquals(user.getName(), "");
    }

    @ParameterizedTest
    @ValueSource(strings = { "Ja_ck", "0Jane", "Michael000001" })    
    public void itCreatesClientWithName(String name) {
        User user = new User(0, name, null, name);
        assertEquals(user.getName(), name);
    }

    @org.junit.jupiter.api.Test
    void testName() {
        
    }

    
}
    