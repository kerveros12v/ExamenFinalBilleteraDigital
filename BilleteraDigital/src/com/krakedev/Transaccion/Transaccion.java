package com.krakedev.Transaccion;
public class Transaccion {
    private String tipo;
    private double monto;
    private String descripcion;
    private boolean exitosa;

    public Transaccion(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.exitosa = true;
    }


    public String getTipo() {
    return tipo;
    }

    public void setTipo(String tipo) {
    this.tipo = tipo;
    }

    public double getMonto() {
    return monto;
    }

    public void setMonto(double monto) {
    this.monto = monto;
    }

    public String getDescripcion() {
    return descripcion;
    }

    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }

    public boolean isExitosa() {
    return exitosa;
    }

    public void setExitosa(boolean exitosa) {
    this.exitosa = exitosa;
    }   

    public void mostrarDetalle() {
        System.out.println("---- Detalle de Transacción ----");
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Descripción: " + descripcion);
        
        if (exitosa) {
            System.out.println("Estado: Exitosa");
        } else {
            System.out.println("Estado: Fallida");
        }
        
    }

    public void aplicarComision(double porcentaje) {
        double comision = monto*(porcentaje/100);
        double montoTotal = monto + comision;

        System.out.println("Comisión (" + porcentaje + "%): $" + comision);
        System.out.println("Monto total con comisión: $" + montoTotal);
        
    }  
    
    
    public void marcarFallida() {
        this.exitosa = false;
        System.out.println("Transacción marcada como fallida.");
        System.out.println("Monto afectado: $" + monto);
    }

      
           
}
