package tarjeta;

public class Main {

    
    public static void main(String[] args) {
        TarjetaPrepago miTarjeta;
        double saldoActual;
        int x;
        
        miTarjeta = new TarjetaPrepago("Juan Pérez","1425678909877652","1000-2365-85-123456799",150,233);
        System.out.println("Saldo inicial de la tarjeta: "+miTarjeta.saldo+"€");
        try 
        {
            x=100;
            System.out.println("Retirada en tarjeta de "+x+"€");
            miTarjeta.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            x=50;
            System.out.println("Ingreso en tarjeta de "+x+"€");
            miTarjeta.recargar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al recargar");
        }
        saldoActual = miTarjeta.saldo;
        System.out.println("El saldo actual es "+ saldoActual );
    }

}
