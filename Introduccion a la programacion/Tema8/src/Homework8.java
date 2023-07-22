public class Homework8 {
    public static void main(String[] args){
        Persona humano = new Persona();
        humano.setNombre("Pedro");
        humano.setEdad(18);
        humano.setTelefono(12345678);

        System.out.println(humano.getNombre());
        System.out.println(humano.getEdad());
        System.out.println(humano.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
