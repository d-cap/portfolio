package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;

@QuarkusTest
@TestProfile(TestLambdaTest.class)
public class TestLambdaTest implements QuarkusTestProfile {
    @Test
    void should() {
        assertTrue(true);
    }
}
