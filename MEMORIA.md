Hemos configurado el entorno siguiendo las restricciones de la práctica:
Ramas: La rama principal se ha nombrado master. Se ha creado una rama develop para integrar los cambios antes de pasarlos a la principal.
Protección: Se ha activado la protección en master, haciendo obligatorio el uso de Pull Requests para subir código.
Colaboradores: Todos los miembros del equipo han sido añadidos con permisos de edición

tarea 2
Extract Method: El método procesarArchivo hace demasiadas cosas. Vamos a separar la lógica de extraer la extensión y el cálculo de tamaño en métodos propios para que el código sea más legible.

Replace Magic Number with Symbolic Constant: Vamos a quitar el 1024 * 1024 y sustituirlo por una constante llamada BYTES_POR_MB para que se entienda mejor qué significa ese número.

Rename Variable: Cambiaremos el nombre de la variable i por dotIndex, ya que un nombre de una sola letra no explica que estamos buscando la posición del punto en el nombre del archivo.

tarea 3
Para realizar los cambios, hemos utilizado las herramientas automáticas del IDE (Eclipse/IntelliJ):

Rename (Alt+Shift+R): Usado para renombrar la variable i de forma segura en todo el proyecto.

Extract Method (Alt+Shift+T): Usado para crear los nuevos métodos a partir del código seleccionado.

Extract Constant: Usado para definir la constante del tamaño de archivo.
