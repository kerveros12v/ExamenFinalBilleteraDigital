package com.krakedev.Billetera;
public class Billetera {
private String propietario,numeroCuenta;
private double saldo;
private boolean activa;
public Billetera(String propietario, String numeroCuenta, double saldoInicial){
    this.propietario=propietario;
    this.numeroCuenta=numeroCuenta;
    this.saldo=saldoInicial;
    this.activa=true;
}
public void mostrarInfo(){
    System.out.println("=== Billetera Digital ===");
    System.out.println("Propietario: " +propietario+
                "\nCuenta: " + numeroCuenta+
                "\nSaldo: " +saldo+
                "\nEstado: "+((activa)?"Activa":"Inactiva"));
}
public void depositar(double monto){
    saldo+=monto;
    System.out.println("Depósito exitoso: $" + monto+
                "\nNuevo saldo:$" + saldo);
}
public void retirar(double monto){
    if(saldo<monto){
        System.out.println("Fondos insuficientes.\nSaldo actual: "+saldo);
    }else{
        saldo-=monto;
         System.out.println("Retiro exitoso: $" + monto+
                "\nSaldo restante: $" + saldo);
    }
}
}
