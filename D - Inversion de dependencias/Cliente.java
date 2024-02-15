
package maind;

public class Cliente {
    public Notificador notificador;
    
    public Cliente(Notificador notificador){
        this.notificador=notificador;
    }
    
    public void realizarpedido(){
         System.out.println("Pedido realizado.");
         
         notificador.notificar("Su pedido ha sido realizado");
    }
}
