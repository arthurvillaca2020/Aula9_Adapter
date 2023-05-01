import org.example.Codigo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
     void deveRetornarValorA() {
        Codigo codigo = new Codigo();
        codigo.setAvaliacao("A");

        assertEquals("A", codigo.getAvaliacao());
    }

}
