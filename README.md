# TulChallenge
Excersice 1
Elegi este ejercicio porque fue un desafio para mi interpretar ese problema y llevarlo a codigo.
Para resolver el ejercicio
Primeramente tuve que crear una cadena que pueda ser modificada con una cantidad maxima de cambios permitidos.
Descompuse el string en una matriz.
Contabilizo el tamano de la matriz.
Y creo un contador de cambios.
Luego ejecute un bucle donde leo la mitad de la cadena de izquierda a derecha para comparar los valores, para poder seleccionar el de mayor valor y reemplazar en el string.
Si el numero de cambios necesarios es mayor al numero de cambios permitidos arroja -1.
Si el numero de cambios necesarios puede replicar un palindromo, pinta el numero de mayor valor en su simetrico.
Finalmente la funcion retorna la cadena con los cambios realizados.


//Instrucciones.
Ingresar el valor que deseas modificar, separa con un espacio e ingresa el numero de cambios maximos que deseas realizar.
Ejemplo 
1231 1
