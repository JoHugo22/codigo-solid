
package maind;

public class SMSNotificador implements Notificador{
    
    public void notificar(String mensaje){
    System.out.println("Enviando un mensaje "+ mensaje);
    }
}
