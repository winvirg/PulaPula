import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testCrianca {
    
    @Test
    public void testInicializandoCrianca(){
        Crianca crianca = new Crianca("Dora", 6);
        assertEquals(6, crianca.getIdade(),
            "Ao inicializar uma crianca ela deve ter a mesma idade que foi passada na inicialização");
        assertEquals("Dora", crianca.getName(),
            "Ao inicializar uma crianca ela deve ter o mesmo nome que foi passada na inicialização");
    }
}
