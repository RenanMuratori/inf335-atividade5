package br.unicamp.ic.inf335.tests;

import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareToTest() {
        ProdutoBean produto1 = new ProdutoBean("CD00001", "Onix 2017", "Preto, Automatico", 1000.0, "Poucos riscos, estado de novo.");
        ProdutoBean produto2 = new ProdutoBean("CD00002", "Celta 2015", "Branco, Direção Hidraulica", 1500.0, "Kilometragem alta.");
        ProdutoBean produto3 = new ProdutoBean("CD00003", "Corsa 2015", "Prata, Ar condicionado", 2000.0, "Manutenção em dia.");

        ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>(List.of(produto3,produto2,produto1));
    
        Collections.sort(produtos);

        assertEquals(List.of(produto1,produto2,produto3), produtos);
    }
}