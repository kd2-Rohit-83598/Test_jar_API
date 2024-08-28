package com.bajajhealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HashGeneratorTest {

    @Test
    void testGenerateMD5Hash() throws Exception {
        String input = "testInput";
        String expectedHash = "fb054efb1303abdfd6e954e83f41e7bd";
        
        String result = HashGenerator.generateMD5Hash(input);
        assertEquals(expectedHash, result);
    }

    @Test
    void testGenerateMD5HashEmptyString() throws Exception {
        String input = "";
        String expectedHash = "d41d8cd98f00b204e9800998ecf8427e";
        
        String result = HashGenerator.generateMD5Hash(input);
        assertEquals(expectedHash, result);
    }

    @Test
    void testGenerateMD5HashConsistency() throws Exception {
        String input = "consistencyTest";
        String firstHash = HashGenerator.generateMD5Hash(input);
        String secondHash = HashGenerator.generateMD5Hash(input);
        
        assertEquals(firstHash, secondHash, "Hash should be consistent for the same input");
    }

    // Add more tests as needed
}