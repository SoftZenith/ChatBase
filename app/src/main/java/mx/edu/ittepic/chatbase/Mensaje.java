package mx.edu.ittepic.chatbase;

public class Mensaje {

    private String nombre;
    private String mensaje;
    private String fotoPerfil;
    private String type_mensaje;
    private String hora;

    public Mensaje() {

    }

    public Mensaje(String mensaje, String nombre, String fotoPerfil, String type_mensaje, String hora) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.fotoPerfil = fotoPerfil;
        this.type_mensaje = type_mensaje;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getType_mensaje() {
        return type_mensaje;
    }

    public void setType_mensaje(String type_mensaje) {
        this.type_mensaje = type_mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
