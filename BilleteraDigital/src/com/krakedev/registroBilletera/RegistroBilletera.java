package com.krakedev.registroBilletera;

public class RegistroBilletera {
	private String nombreBanco;
    private String[] cuentas;
    private String[] propietarios;
    private int totalRegistros;

    // Constructor
    public RegistroBilletera(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.cuentas = new String[10];
        this.propietarios = new String[10];
        this.totalRegistros = 0;
    }
    
     // Registrar billetera
    public void registrarBilletera(String cuenta, String propietario) {
        if (totalRegistros < cuentas.length) {
            cuentas[totalRegistros] = cuenta;
            propietarios[totalRegistros] = propietario;
            totalRegistros++;

            System.out.println("Billetera registrada: " + cuenta + " - " + propietario);
        } else {
            System.out.println("No se pueden registrar más billeteras (límite alcanzado)");
        }
    }

    // Buscar cuenta
    public void buscarCuenta(String cuenta) {
        boolean encontrada = false;

        for (int i = 0; i < totalRegistros; i++) {
            if (cuentas[i].equals(cuenta)) {
                System.out.println("Cuenta encontrada: " + cuenta +
                                " | Propietario: " + propietarios[i]);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Cuenta no encontrada: " + cuenta);
        }
    }

    // Mostrar registro
    public void mostrarRegistro() {
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Total de billeteras: " + totalRegistros);

        for (int i = 0; i < totalRegistros; i++) {
            System.out.println((i + 1) + ". " + cuentas[i] + " - " + propietarios[i]);
        }
    }
}
