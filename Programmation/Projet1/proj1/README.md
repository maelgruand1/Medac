# Verificación de Edad en Java

Este proyecto en Java solicita al usuario que ingrese su nombre y edad, luego verifica si el usuario es mayor o menor de edad, mostrando un mensaje acorde con el resultado.

## Descripción

El programa realiza las siguientes acciones:

1. Pide al usuario su nombre.
2. Pide al usuario su edad.
3. Verifica si la edad del usuario es mayor o igual a 18.
4. Muestra un mensaje indicando si el usuario es mayor de edad o menor de edad.

## Estructura del Código

El proyecto está compuesto por una clase principal llamada `pack` que contiene el método `main`. Esta clase invoca a la clase `User`, que maneja las entradas del usuario, la lógica de verificación de la edad y la impresión de resultados.

### Funciones del Código

- `pedirNombre(Scanner input, String nombre)`: Solicita al usuario su nombre.
- `pedirEdad(Scanner input)`: Solicita al usuario su edad.
- `verificarEdad(int age)`: Verifica si la edad proporcionada es mayor o igual a 18.

## Requisitos

- Java 8 o superior.

## Instrucciones de Uso

1. Clona o descarga este repositorio.
2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, NetBeans, etc.) o en tu terminal.
3. Ejecuta la clase `pack` para iniciar el programa.
4. Ingresa tu nombre y edad cuando se te solicite.

## Ejemplo de Ejecución

```bash
Introduzca su nombre: Juan
Introduzca su edad: 20
Eres mayor de edad.
