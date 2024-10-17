**const**

// Declaramos las variables de la primera piscina.

largoPiscina1 = ****real**** := 300;
anchoPiscina1 = **real** := 150;
profundidadPiscina1 = **real** := 20;

// Declaramos las variables de la segunda piscina.

largoPiscina2 = **real** := 300;
anchoPiscina2 = **real** := 80;
profundidadPiscina2 = **real** := 35;

**fconst**

// Calculamos el área de la piscina 1 y 2.

**escribirPantalla**("El área de la Piscina 1 es: " + largoPiscina1 * anchoPiscina1 + " metros cuadrados");
**escribirPantalla**("El área de la Piscina 2 es: " + largoPiscina2 * anchoPiscina2 + " metros cuadrados");

// Calculamos el volumen de la piscina 1 y 2.

**escribirPantalla**("El volumen de la Piscina 1 es : " + largoPiscina1 * anchoPiscina1 * profundidadPiscina1 + " litros cúbicos");
**escribirPantalla**("El volumen de la Piscina 2 es: " + largoPiscina2 * anchoPiscina2 * profundidadPiscina2 + " litros cúbicos");

// Calculamos los valores que tendrían las dos piscinas juntas.

**escribirPantalla**("El largo de las dos piscinas juntas sería la misma: " + largoPiscina1 + " metros");
**escribirPantalla**("El ancho de las dos piscinas juntas sería: " + (anchoPiscina1 + anchoPiscina2) + " metros");

// Calculamos el área de las dos piscinas juntas.

**escribirPantalla**("El área de las dos piscinas juntas es: " + largoPiscina1 * (anchoPiscina1 + anchoPiscina2) + " metros cuadrados");

// Calculamos el volumen de las dos piscinas juntas, se coge la profunidad de la piscina 1.

**escribirPantalla**("El volumen de las dos piscinas juntas es: " + largoPiscina1 * (anchoPiscina1 + anchoPiscina2) * profundidadPiscina1 + " litros cúbicos");

// Intercambiamos los valores de profunidad de las dos piscinas y volvemos a calcular el volumen.

nuevaProfundidad = **real** := profundidadPiscina1;
profundidadPiscina1 = profundidadPiscina2;
profundidadPiscina2 = nuevaProfundidad;

**escribirPantalla**("El volumen de la piscina 1, con la nueva profundidad, es: " + largoPiscina1 * anchoPiscina1 * profundidadPiscina1 + " litros cúbicos");
**escribirPantalla**("El volumen de la piscina 2, con la nueva profunidad, es: " + largoPiscina2 * anchoPiscina2 * profundidadPiscina2 + " litros cúbicos");