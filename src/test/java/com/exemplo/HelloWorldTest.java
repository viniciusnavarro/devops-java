package com.exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {

    @Test
    public void testMainRuns() {
        // Simples teste para garantir que o método main pode ser chamado sem erro
        HelloWorld.main(new String[]{});
        assertTrue(true);
    }
}