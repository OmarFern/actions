package test1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import fiuba.App;

public class TestCase {

    @Test
    public void testCaseInicial() {
        assertEquals("Hello World", App.saludar());
    }
}
