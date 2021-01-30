# Taller MVN y GIT

En este proyecto vamos a implementar un proyecto utilizando la herramienta de software Maven el cual nos gestiona la contraccion y el manejo del ciclo de vida de nuestros proyectos en Java, y Git que es la herramienta para el control de versiones de nuestro codigo.

Implementaremos un programa el cual calcula la media y la desviación estandar, utilizando una LinkedList creada por mi.

## Correr proyecto

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
$ git clone https://github.com/SoyTiyi/LinkedList_AREP.git
 ```

 Y luego entraremos a la carperta LinkedList_AREP

```sh
$ cd LinkedList_AREP
 ```
 Ahora descargaremos las dependencias de nuestro programa.

 ```sh
$ mvn package
 ```
 Y finalmente para ejecutar la aplicacion.

 ```sh
$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.Main"
 ```

### Prerequisitos

Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Correr Pruebas

Para correr las pruebas, ejecutamos el siguiente comando

```sh
$ mvn test
 ```

### Generar Javadoc

Para generar el javadoc, corremos el siguiente comando

```sh
$ mvn javadoc:javadoc 
 ```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [vscode](https://code.visualstudio.com/) - IDE

## Authors

 - Santiago Martínez Martínez - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito - Noveno Semestre

## License

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
