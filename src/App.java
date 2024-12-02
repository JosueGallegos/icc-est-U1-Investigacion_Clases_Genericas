public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        System.out.println("Ejemplo 1.\n ");
        
        Caja<String> cajaDeTexto = new Caja<>("Hola Mundo");
        System.out.println(cajaDeTexto);
        
        
        Caja<Integer> cajaDeEnteros = new Caja<>(123);
        System.out.println(cajaDeEnteros);
        
       
        Caja<Double> cajaDeDecimales = new Caja<>(3.1416);
        System.out.println(cajaDeDecimales);

        System.out.println();
        System.out.println("Ejemplo 2.\n ");

        Par<String, Integer> edadPersona = new Par<>("Alice", 25);
        System.out.println("Par: " + edadPersona );

        edadPersona.setValor(26);
        System.out.println("Par modificado: " + edadPersona );

        Par<Integer, Boolean> resultadoPrueba = new Par<>(101, true);
        System.out.println("Resultado: "+ resultadoPrueba);

        Par<String,String> coordenadas = new Par<>("Latitud ", "Longitud ");
        System.out.println("Coordenadas: "+ coordenadas);



    }
}
