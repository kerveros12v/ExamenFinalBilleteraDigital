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
}
