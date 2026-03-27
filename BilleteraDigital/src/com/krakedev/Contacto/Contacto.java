public class Contacto {

 private String nombre;
 private String cuentaDestino;
 private String banco;
 private boolean favorito;
 
 public Contacto (String nombre, String cuentaDestino, String banco) {
	 this.nombre = nombre;
	 this.cuentaDestino = cuentaDestino;
	 this.banco = banco;
	 this.favorito = false;
 }
public void mostrarContacto() {
	 System.out.println("=== Contacto ===");
	 System.out.println("");
	 System.out.println("Nombre: "+this.nombre);
	 System.out.println("Cuenta: "+this.cuentaDestino);
	 System.out.println("Banco: "+this.banco);
	 if(!favorito) {
		 System.out.println("Favorito: Sin Marcar");
	 }else {
		 System.out.println("★ Favorito");
	 }
}
public void marcarFavorito() {
	 this.favorito = true;
	 System.out.println(this.nombre+"agregador a favoritos ★");
 }

}
