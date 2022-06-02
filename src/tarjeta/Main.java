package tarjeta;

public class Main {

    
    public static void main(String[] args) {
        TarjetaPrepago tarjeta1;
        double saldoActual;
        int x;
        
        tarjeta1 = new TarjetaPrepago("Juan Pérez","1425678909877652","1000-2365-85-123456799",150,233);
        System.out.println("Saldo inicial de la tarjeta: "+tarjeta1.getSaldo()+"€");
        retiraDinero(tarjeta1);
        
        recargaTarjeta(tarjeta1);
        saldoActual = tarjeta1.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    public static void recargaTarjeta(TarjetaPrepago tarjeta1) {
        int x;
        try
        {
            x=50;
            System.out.println("Ingreso en tarjeta de "+x+"€");
            tarjeta1.recargar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al recargar");
        }
    }

    public static void retiraDinero(TarjetaPrepago tarjeta1) {
        int x;
        try
        {
            x=100;
            System.out.println("Retirada en tarjeta de "+x+"€");
            tarjeta1.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
