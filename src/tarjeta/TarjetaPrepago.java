package tarjeta;

public class TarjetaPrepago {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * @return the cuentaAsociada
     */
    public String getCuentaAsociada() {
        return cuentaAsociada;
    }

    /**
     * @param cuentaAsociada the cuentaAsociada to set
     */
    public void setCuentaAsociada(String cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the cvv
     */
    public double getCvv() {
        return cvv;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(double cvv) {
        this.cvv = cvv;
    }


    // Propiedades de la Clase TarjetaPrepago
     private String nombre;
     private String numeroTarjeta;
     private String cuentaAsociada;
     private double saldo;  //No se contemplan saldos negativos
     private double cvv;

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
        setSaldo(getSaldo() + cantidad);
    }


    // Método para retirar cantidades en la cuentaAsociada. Modifica el saldo.
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        
        setSaldo(getSaldo() - cantidad);
    }

}
