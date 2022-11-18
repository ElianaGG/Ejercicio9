public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Julieta");
        cliente.setEdad(25);
        cliente.setTelefono(35133333);
        cliente.setCredito(18000.70);

        System.out.println(cliente.getNombre() + " de " + cliente.getEdad() + " años, " + "teléfono:" +
                cliente.getTelefono() + " posee un crédito de $" + cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Joaquín");
        trabajador.setEdad(25);
        trabajador.setTelefono(35133333);
        trabajador.setSalario(180000.97);

        System.out.println(trabajador.getNombre() + " de " + trabajador.getEdad() + " años, " + "teléfono:" +
                trabajador.getTelefono() + " posee un salario de $" + trabajador.getSalario());
    }
}
