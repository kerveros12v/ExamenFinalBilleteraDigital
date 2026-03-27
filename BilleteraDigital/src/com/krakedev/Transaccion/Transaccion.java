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

    
}
