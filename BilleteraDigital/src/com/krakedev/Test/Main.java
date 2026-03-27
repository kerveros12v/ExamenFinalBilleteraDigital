package com.krakedev.Test;
import com.krakedev.Billetera.*;
import com.krakedev.registroBilletera.*;
import com.krakedev.Contacto.*;
import com.krakedev.Transaccion.*;
public class Main {
public static void main(String[] args) {
    System.out.println("===== Billetera Digital =====");
 System.out.println();
 // ── Integrante 1: Billetera ─────────────────────────────────
 // Crear una instancia de Billetera con datos reales.
Billetera billetera1=new com.krakedev.Billetera.Billetera("Fernando", "123456", 100);

 // Llamar a: mostrarInfo(), depositar() y retirar().
billetera1.mostrarInfo();
billetera1.depositar(50);
billetera1.retirar(155);
billetera1.retirar(60);
 // ── Integrante 2: Transaccion ───────────────────────────────
 // Crear una instancia de Transaccion con datos reales.
 Transaccion transaccion1=new Transaccion("DEPÓSITO", 60, "Deposito Cajero");
 // Llamar a: mostrarDetalle(), aplicarComision() y marcarFallida().
 transaccion1.mostrarDetalle();
 transaccion1.aplicarComision(0);
 transaccion1.marcarFallida();
 // ── Integrante 3: Contacto ──────────────────────────────────
 // Crear una instancia de Contacto con datos reales.
Contacto contacto1=new Contacto("Marcelo Salcedo", "123498", "Pichincha");
 // Llamar a: mostrarContacto(), marcarFavorito() y enviarDinero().
 contacto1.mostrarContacto();
 contacto1.marcarFavorito();
 contacto1.enviarDinero(60);
 // ── Integrante 4 (si aplica): RegistroBilletera ─────────────
 // Crear una instancia de RegistroBilletera.
 RegistroBilletera registroBilletera=new RegistroBilletera("Pichincha");
 // Registrar al menos 2 billeteras con registrarBilletera().
registroBilletera.registrarBilletera("78945612", "Erik");
registroBilletera.registrarBilletera("98524521", "Leonardo");

 // Llamar a buscarCuenta() y mostrarRegistro().
 registroBilletera.buscarCuenta("78945612");
 registroBilletera.mostrarRegistro();
 System.out.println();
 System.out.println("===== Fin del sistema =====");
}
}
