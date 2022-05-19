package bote;

/**
 *
 * @author Almudena
 * @version 13-05-2022
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Bote titan;
        int centilitros=300;
        int centimos=200;
        int metros=2;
        
        //creamoas un nuevo bote 
        
        titan=new Bote(300,10,"azul",2,500);
       
        
     /**
     *Vamos a intentar añadir 300 centilitros al bote, como se supera la capacidad saltará
        una excepción y no se modificará el contenido del depósito que seguirá siendo 280cl
     * @param args
     */
        pintar(titan, metros);
 
        pintarBote(titan, centilitros, centimos);
    }

    private static void pintarBote(Bote titan, int centilitros, int centimos) {
        try {
            System.out.println("Vamos a rellenar el bote");
            titan.rellenar(centilitros, centimos);
            System.out.println("Recarga realizada, ahora tiene "+titan.getContenido()+" centilitros en el bote");
        } catch (Exception e) {
            System.out.println("Error al rellenar el bote, el contenido sigue siendo: "+titan.getContenido());
            
        }
    }

    /**
     *Metodo para Vamos a pintar 2 metros, como hay suficiente pintura la operación tendrá éxito y se
        descontarán 20 centilitros del contenido del bote, quedan 280cl
     * @param titan contenido del bote 
     * @param metros distancia que va a ser pintada
     */
    public static void pintar(Bote titan, int metros) {
    
        try {
            System.out.println("Vamos a pintar");
            titan.pintar(metros);
            System.out.println("En el bote quedan "+titan.getContenido()+" centilitros");
        } catch (Exception e) {
            System.out.println("Error al pintar");
        }
    }
    
}
