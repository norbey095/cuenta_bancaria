
package cuenta_bancaria;

public class CuentaAhorros extends Cuenta{
    
    private final boolean activa;
    
    public CuentaAhorros(float saldo){
        super(saldo);
        //si el saldo es mayor o igual a 10000, entonces estara activa
        activa = saldo > 10.000;
    }
    
    //sobreescrbir los metodos de la clase padre
    @Override
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        } else {
            System.out.println("*La cuenta se encuentra inactiva");
        }
    }
    
    @Override
    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);
        } else {
            System.out.println("*La cuenta se encuentra inactiva");
        }
    }
    
    //imprimir detalles de la cuenta de ahorros
    public void imprimir(){
        System.out.println("saldo = $"+ saldo);
        System.out.println("Numero de transacciones = " + 
                (numero_consignaciones + numero_retiros));
    }
}
