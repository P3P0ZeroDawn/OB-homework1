public class Homework9 {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(18);
        cliente.setNombre("Pedro");
        cliente.setTelefono(12345678);
        cliente.setCredito(3213123);
        System.out.println("Cliente");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(24);
        trabajador.setNombre("Alfredo");
        trabajador.setTelefono(87654321);
        trabajador.setSalario(8000);
        System.out.println("Trabajador");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }
}
