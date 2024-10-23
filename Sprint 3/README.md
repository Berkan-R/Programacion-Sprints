**var**

 //Declaramos los tipos de datos

numeroResgitro ,tieneHermano, viveMismaPoblación, trabajaMismaPoblacion, maximaProximidad, tieneDiscapacidad, esFamiliaNumerosa, haEstadoEscolarizado, puntosTotales = **entero**;

**fvar**

// Solicitamos datos del alumno

**escribirPantalla**("Introduce el número de registro del niño: ");<br>
numeroResgitro = **leerTeclado(entero)**;

**escribirPantalla**("Tiene algún hermano/a en el centro? (0:NO / 1:SÍ): ");<br>
tieneHermano = **leerTeclado(entero)**;

**escribirPantalla**("Vive en la zona de la escuela? (0:NO / 1:SÍ): ");<br>
viveMismaPoblacion= **leerTeclado(entero)**;

**escribirPantalla**("Sus padres trabajan por la zona de la escuela? (0:NO / 1:SÍ): ");<br>
trabajaMismaPoblacion = **leerTeclado(entero)**;

**escribirPantalla**("Tiene alguna discapacidad mayor o igual al 33% o una enfermedad crónica? (0:NO / 1:SÍ): ");<br>
tieneDiscapacidad = **leerTeclado(entero)**;

**escribirPantalla**("Son una familia numerosa o monoparental? (0:NO / 1:SÍ): ");<br>
esFamiliaNumerosa = **leerTeclado(entero)**;

**escribirPantalla**("Los padres, tutor legal o hermano han estado estudiado en esta escuela? (0:NO / 1:SÍ): ");<br>
haEstadoEscolarizado = **leerTeclado(entero)**;

// Calculamos todos los puntos y los mostramos

**si** (tieneHermano = 1) **entonces**<br>
    puntosTotales = 40;

**sino**<br>
    puntosTotales = 0;

**fsi**

// Se evalua el criterio de proximidad: elegir el de más puntuación

**si** (viveMismaPoblacion = 1) **entonces**<br>
    maximaProximidad = 30;

**sino**<br>
    **si** (trabajaMismaPoblacion = 1) **entonces**<br>
        maximaProximidad = 20;<br>
    **sino**<br>
        maximaProximidad = 0;<br>
    **fsi**

**fsi**

// Sumamos los puntos de proximidad

puntosTotales = puntosTotales + maximaProximidad;

**si** (tieneDiscapacidad = 1) **entonces**<br>
    puntostTotales = puntosTotales + 10;

**fsi**

**si** (esFamiliaNumerosa = 1) **entonces**<br>
    puntosTotales = puntostTotales + 15;

**fsi**

**si** (haEstadoEscolarizado = 1) **entonces**<br>
    puntos Totales = PuntosTotales + 5;

**fsi**

**escribitPantalla**("El alumno con número de regitro: " + numeroRegistro + "tiene un total de " + puntosTotales + "puntos");