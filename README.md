# Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java
##  Lenguaje
- Java JDK 1.8
- ID Netbeans Apache 11.3
## Librerias
- javax.swing.JOptionPane
- javax.swing.jLabel
- javax.swing.jTextField
- javax.swing.JButton
- java.util.List
# Practica
## 1.Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 06: Gestión de Directorios en Java”
- En el siguiente link se encuentra la evidencia del repositorio creado en GitHub:
- https://github.com/RomelAvila2001/Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java
## 2. Desarrollar una aplicación que permita la gestión de Directorios
- Una vez leído y entendido las indicaciones procedemos a crear un proyecto en NetBeans con sus respectivos paquetes y clases en cada uno de ellos, interpretando así el diagrama propuesto en las instrucciones.
![imagen](https://user-images.githubusercontent.com/64879338/86553091-5afa7700-bf0f-11ea-8f9f-a4afc65651b4.jpg)
### Paquete Controlador
##### Clase Controlador Directorio
- https://github.com/RomelAvila2001/Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java/blob/master/src/main/java/ec/edu/ups/controlador/ControladorDirectorio.java
- En esta clase instanciamos los métodos que después serán llamados por la vista para la ejecución del programa, la clase consta con los siguientes metodos:
###### -Listar Archivos:
- En este método instanciamos una lista a la cual le vamos a ir pasando los archivos y Directorios encontrados en la ruta pasada, apoyándonos con el método isHidden de la clase File con el cual vamos a evitar que se muestren los archivos ocultos en la carpeta.
###### -Listar Archivos Ocultos:
- En este método instanciamos una lista a la cual le vamos a ir pasando los archivos encontrados en la ruta pasada, apoyándonos con el método isHidden y el método isDirectory negado de la clase File con el cual vamos a obtener solo los archivos ocultos en la ruta buscada.
###### -Listar Directorios Ocultos:
- En este método instanciamos una lista a la cual le vamos a ir pasando los archivos encontrados en la ruta pasada, apoyándonos con el método isHidden y el método isDirectory de la clase File con el cual vamos a obtener solo los Directorios ocultos en la ruta buscada.
###### -Crear Directorio:
- En este método vamos a recibir de la vista la ruta en donde queremos crear el directorio con ayuda del método mkdir.
###### -Eliminar Directorio:
- En este método gracias a la recursividad y un arreglo de Files podemos eliminar un Directorio sin ningún problema porque eliminamos los archivos que están dentro de él.
###### -Renombrar Directorio:
- En este método utilizamos el método renameTo al cual le pasamos un nuevo File con el nuevo nombre.
###### -Mostrar Información:
- En este método recorremos el arreglo de Files hasta que encuentre uno que es igual al nombre que le pasamos al método después de eso para sacar la información requerida utilizamos los método de la clase File, pare encontrar el path utilizamos getAbsolutePath, para saber el tamaño utilizamos length, para obtener el permiso de escritura y de lectura utilizamos el  canWrite y el canRead y final mente para saber su última modificación utilizamos el método lastModified() detro de la clase del simpleDateFormate para darle un formato de mes dia año y las horas minutos y segundos ya que el método nos devuelve solo en nanosegundos.
### Paquete Vista 
##### Ventana Principal 
- El código se encuentra en el siguiente link debido a que es muy extenso:
- https://github.com/RomelAvila2001/Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java/tree/master/src/main/java/ec/edu/ups/vista
- En esta ventana se encuentra las acciones que realizara con sus respectivos botones y menusItems instanciando el controlado y llamando a sus métodos, pensando así los datos que requiera cada método.  
### Funcionamiento.
- Ventana inicial 
![2](https://user-images.githubusercontent.com/64879338/86553783-4fa84b00-bf11-11ea-86b0-f854d452dd9a.jpg)
- Al ingresar la ruta y presionar en listar Directorios
![3](https://user-images.githubusercontent.com/64879338/86553929-c47b8500-bf11-11ea-8a1e-7545e52bcc61.jpg)
- Al presionar en archivos ocultos
![4](https://user-images.githubusercontent.com/64879338/86553957-e37a1700-bf11-11ea-96fe-e91457e9144c.jpg)
- Al presionar en directorios ocultos 
![5](https://user-images.githubusercontent.com/64879338/86554025-0f959800-bf12-11ea-8cbb-7a7fca474386.jpg)
- Al seleccionar un directorio de la lista y presionar en mostrar información
![6](https://user-images.githubusercontent.com/64879338/86554065-2c31d000-bf12-11ea-808e-cdc0ed7b170f.jpg)
- Al aplastar gestionar directorios y seleccionar crear 
![7](https://user-images.githubusercontent.com/64879338/86554133-5e433200-bf12-11ea-8219-dd42b2268c67.jpg)
![8](https://user-images.githubusercontent.com/64879338/86554168-77e47980-bf12-11ea-949d-434f13084db7.jpg)
- Al presionar gestionar directorios y seleccionar renombrar 
![9](https://user-images.githubusercontent.com/64879338/86554199-9185c100-bf12-11ea-983c-c915cc178af8.jpg)
![10](https://user-images.githubusercontent.com/64879338/86554233-a19da080-bf12-11ea-8958-64a1e27eb040.jpg)
- Al presionar gestionar directorios y seleccionar eliminar 
![11](https://user-images.githubusercontent.com/64879338/86554267-c09c3280-bf12-11ea-8fc1-c7f31503bbfb.jpg)
![12](https://user-images.githubusercontent.com/64879338/86554297-d7428980-bf12-11ea-906d-4747002a7daa.jpg)
## 3.Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin.
- En el siguiente link se encuentra el historial de commits, como evidencia de los commits realizados a lo largo de la practica:
- https://github.com/RomelAvila2001/Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java/commits/master
## 4. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica (incluidas las imágenes y versiones de las herramientas)
- En el siguiente link se encuentra el acceso como evidencia de la creación del readme en la pagina de GitHub:
- https://github.com/RomelAvila2001/Practica-de-laboratorio-06-Gestion-de-Directorios-en-Java/blob/master/README.md
# RESULTADO(S) OBTENIDO(S):
- Una profundización del tema de manejo de Directorios con java 
- Manejo de la clase File ya que tuvimos que implantar varios de sus métodos para ir gestionando los directorios 
- Manejo de directorios con la ayuda de la interface grafica de java 
# CONCLUSIONES:
- En conclusión, la practica nos ayudó a aumentar y a sustentar los conocimientos vistos debido a la implementación de estos en un programa funcional, también nos ayudó a expandir un poco más nuestros conocimientos debido a que tuvimos que investigar ciertos métodos que no conocíamos y así usamos cosas nuevas.
# RECOMENDACIONES:
- Dar a conocer un poco más de los métodos con recursividad.

