TAREA 1
Hemos configurado el entorno siguiendo las restricciones de la práctica:
Ramas: La rama principal se ha nombrado master. Se ha creado una rama develop para integrar los cambios antes de pasarlos a la principal.
Protección: Se ha activado la protección en master, haciendo obligatorio el uso de Pull Requests para subir código.

TAREA 2
Extract Method: El método procesarArchivo hace demasiadas cosas. Vamos a separar la lógica de extraer la extensión y el cálculo de tamaño en métodos propios para que el código sea más legible.

Replace Magic Number with Symbolic Constant: Vamos a quitar el 1024 * 1024 y sustituirlo por una constante llamada BYTES_POR_MB para que se entienda mejor qué significa ese número.

Rename Variable: Cambiaremos el nombre de la variable i por dotIndex, ya que un nombre de una sola letra no explica que estamos buscando la posición del punto en el nombre del archivo.

TAREA 3
Gestión del Repositorio y Ramas (Marcos).
Marcos configuró el repositorio con reglas de protección en la rama master para simular un entorno de trabajo real. Esto obligó a que los cambios no se subieran directamente, sino mediante una revisión.

Rename (Alt+Shift+R): Usado para renombrar la variable i de forma segura en todo el proyecto.

Extract Method (Alt+Shift+T): Usado para crear los nuevos métodos a partir del código seleccionado.

Extract Constant: Usado para definir la constante del tamaño de archivo.

TAREA 4
Subida y Pull Request (Ricardo y Marcos).
Ricardo subió los archivos a una rama nueva (feature/refactor-final-ricardo) porque master estaba bloqueada. Después, Marcos revisó el código en GitHub y aceptó la Pull Request, fusionando (haciendo el Merge) todo el trabajo en la rama principal.
