## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

//INVESTIGACION CLASES GENERICAS.


//Clases Genericas en Java

las clases genericas en java definir clases que opera sobre tipos parametricos es decir permite escribir codigo que sea reutilizable y que funcione con cualquier tipo de datos, sin necesidad de duplicar el codigo para diferenciar tipos de datos. Esto mejora la seguridad de tipos y elimina la necesidad de realizar conversiones explicitas.

Las clases genericas se utilizan comunmente con colecciones(como ArrayList, HashMap) y son utiles para manejar datos de diferentes tipos de formas cinsistentes.


//Ventajas de las clases Genericas:

1. Reutilizacion de codigos: No es necesario dupliocar el codigo para trabajar con diferentes tipos.

2. Seguridad de Tipo: Detectar errores en tiempo de compilacion.

3. Legiblidad: El codigo es mas limpio y facil de entender.

//Ejemplo 1 :

La clase Caja<T> es generica, lo que significa que puede trabajar con diferentes tipos de datos(T es un parametro de tipo). El tipo exacto se especifica al crear una instancia de caja.

//Elementos principales: 

1. Propiedad contenido:
    
    Es una variable privada que almacena un valor del tipo generico T.

2. Constructor:

    Permite inicializar el contenido de la caja con un valor de tipo T.

3. Metodos getContenido y setContenido.

    getContenido: Devuelve el valor almacenado en la caja.
    getContenido: Permite actualizar el valor en al caja.
4. Metodo toString:
    Sobre el metodo toString para mostrar el contenido de la caja como una cadena.

Main( App ): Esta clase contiene el metodo main que es el punto de entrada del programa.

Elementos principales:

1. Una instancia de Caja que almacena un vlaor de tipo String (Hola Mundo).

2. Una instancia de caja que almacena un valor de tipo Integer(123).

3. Una intancia de caja que alamacena un valor de tipo Double (3.1416).

//Ejemplo 2.

1. Clase Par<K, V>:

    K y V son los parametros genericos que representa los tipos de dos elementos del par.

    Estos parametros  genericos que la clase Par puede manejar cualquier combinqcion de tipos (Por ejemplo: String-Interger, Integer-Boolean, etc.).

Elementos principales:

1.1. Atributos clave y valor;
    Representa los dos valores del par.

1.2. Metodos getter y setter.
    Proporcionan acceso y modificacion a los valores el par.

1.3. Metodo toString.
    Sobrescribe el metodo toString para mostrar los valores del par como una cadena legible.

2. Main( App ):

2.1. Par<String, Integer>:
    Representa un par donde la clave es un nombre (String) y el valor es una edad (Integer).

2.2. Par<Integer, Boolean>:
    Representa un par donde la clave es un codigo (Integer) y el valor es una resultado boolean(true o false).

2.3. Par<String, String>:

    Representa un par con dos cadenas de textos (en este caso, etiquetas de coordenadas).






