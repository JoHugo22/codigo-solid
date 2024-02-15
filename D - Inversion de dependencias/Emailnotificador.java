
package maind;

public class Emailnotificador implements Notificador{
    
    public void notificar(String mensaje){
    System.out.println("Enviando correo electronico "+ mensaje);
    }
    
}
