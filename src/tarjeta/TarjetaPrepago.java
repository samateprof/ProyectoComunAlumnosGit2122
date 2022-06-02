package tarjeta;

public class TarjetaPrepago {


    // Propiedades de la Clase TarjetaPrepago
     String nombre;
     String numeroTarjeta;
     String cuentaAsociada;
     double saldo;  //No se contemplan saldos negativos
     double cvv;

    //Constructor sin argumentos
    public TarjetaPrepago ()
    {
    }
   
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public TarjetaPrepago (String nom, String num, String cue, double sal, double cv)
    {
        nombre =nom;
        numeroTarjeta=num;
        cuentaAsociada=cue;
        saldo=sal;
        cvv=cv;
    }
    

    // Método para recargar cantidades en la cuentaAsociada. Modifica el saldo.
    public void recargar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }


    // Método para retirar cantidades en la cuentaAsociada. Modifica el saldo.
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        
        saldo = saldo - cantidad;
    }

}
