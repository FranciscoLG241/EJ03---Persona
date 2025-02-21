# Ejercicio 8: Persona y Estudiante¶
## Clases y Objetos Básicos:
- Crea una clase Persona que tenga dos propiedades: nombre y edad. Luego, en el main crea un objeto de esta clase e imprime sus propiedades.

## Métodos Simples:

- Añade un método cumple a la clase Persona que incremente la edad de la persona en uno cada vez que se llama.
- Sobreescribe el método toString() y prográmalo para que se muestre una persona con todas sus propiedades. Por ejemplo "Persona (nombre = Lucía, edad = 21)".
- En el main ejecuta el cumple de la persona y muestra su información de dos formas: accediendo a sus propiedades y mediante el método toString() (recuerda que no es necesario llamar al método toString(), sino que se invocará automáticamente cuando necesite realizar la conversión del contenido a String).

## Encapsulamiento:

- Modifica la clase Persona para que reciba la fecha de nacimiento por el constructor, y se almacene en una propiedad privada. Modificar la edad para que no se pueda modificar, pero se pueda consultar su valor, calculándolo con respecto a la fecha de nacimiento.

## Herencia:

- Crea una clase Estudiante que herede de Persona y añade una propiedad carrera. Las propiedades deben incluir el modificador open (vuelve a dejar la propiedad edad pública).
- Realiza de nuevo un override de toString() para completar la información de Estudiante (intenta usar el resultado del método de la clase padre y completarlo).

## Polimorfismo:

- Añade un método actividad() a la clase Persona que imprima "Lucía está realizando una actividad." y sobreescribe en Estudiante para que muestre un mensaje específico para estudiantes.
- Crea en el main a una persona y un estudiante y muestra la actividad que realizan.

## Clases y Objetos con Validación:

- Modifica la clase Persona para que no acepte nombres vacíos y edades negativas. Utiliza un constructor primario con valores por defecto para edad.
- Prueba a crear un estudiante con una edad negativa, controlando las excepciones y mostrando el mensaje de error específico.
- Objetivo: Aprender a crear clases y objetos, a utilizar métodos y propiedades, a aplicar el encapsulamiento, a utilizar la herencia y el polimorfismo, y a controlar las excepciones.
