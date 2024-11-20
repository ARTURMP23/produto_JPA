import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import produto_jpa.Produto;

public class ProdutoTest {

    @Test
    public void testProdutoNome() {
        Produto produto = new Produto("Caderno", 15.0, 100);
        assertEquals("Caderno", produto.getNome());
    }
}
