/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import junit.framework.TestCase;
import tarjeta.TarjetaPrepago;

/**
 *
 * @author brais
 */
public class TestTarjeta extends TestCase {
    
    public TestTarjeta(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test para recagarValido
     */
    public void testRecagarValido() throws Exception {
        System.out.println("Test de prueba para un valor de recarga válido");
        int cantidad = 50;
        TarjetaPrepago tarjeta1 = new TarjetaPrepago("Juan Pérez", "1425678909877652", "1000-2365-85-123456799", 150, 233);
        tarjeta1.recargar(cantidad);
    }

    /**
     * Test para recargarInvalido
     */
    public void testRecagarInvalido() throws Exception {
        System.out.println("Test de prueba para un valor de recarga inválido");
        int cantidad = -50;
        TarjetaPrepago tarjeta1 = new TarjetaPrepago("Juan Pérez", "1425678909877652", "1000-2365-85-123456799", 150, 233);
        try {
            tarjeta1.recargar(cantidad);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test para retirarValido
     */
    public void testRetirarValido() throws Exception {
        System.out.println("Test de prueba para un valor de retirada válida");
        int cantidad = 50;
        TarjetaPrepago tarjeta1 = new TarjetaPrepago("Juan Pérez", "1425678909877652", "1000-2365-85-123456799", 150, 233);
        tarjeta1.retirar(cantidad);
    }

    /**
     * Test para retirarInvalido
     */
    public void testRetirarInvalido() throws Exception {
        System.out.println("Test de prueba para un valor de retirada inválida");
        int cantidad = -50;
        TarjetaPrepago tarjeta1 = new TarjetaPrepago("Juan Pérez", "1425678909877652", "1000-2365-85-123456799", 150, 233);
        try {
            tarjeta1.retirar(cantidad);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
