
package maind;

public class MainD {
    public static void main(String[] args) {
        
        Notificador emailnotificador=new Emailnotificador();
        Cliente cliente1=new Cliente(emailnotificador);
        cliente1.realizarpedido();
        
        Notificador smsnotificador=new SMSNotificador();
        Cliente cliente2=new Cliente(smsnotificador);
        cliente2.realizarpedido();
        
        
        
    }
    
}
