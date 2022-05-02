import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTeste {

    @Test
    @DisplayName("Adicionar saldo")
    void depositar() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(442);
        assertEquals(442, cc.getSaldo());
    }

    @Test
    @DisplayName("Realizar saque com saldo")
    void sacarComSaldo() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(442);
        cc.sacar(400);
        assertEquals(42, cc.getSaldo());
    }

    @Test
    @DisplayName("Relizar saque sem saldo")
    void sacarSemSaldo() {
        ContaCorrente cc = new ContaCorrente();
        cc.sacar(442);
        assertEquals(0, cc.getSaldo());
    }
}