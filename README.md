# Use Maven, HEROKU, GIT, Spark and GITHUB.

En este Taller crearemos una aplicación web la cual mediante una pagina web adjuntaremos la lista de números de los cuales queremos calcularle la media y la desviación estándar.

Para realizar esto, utilizaremos herramientas como Heroku, GIT, Spark y GITHUB.

Y tecnologias como lo son html, css, JavaScript, JQuery, Java y Spark.

## Correr proyecto

Primero Clonaremos el repositorio, para eso desde nuestro navegador nos dirigiremos al siguiente link

```sh
https://github.com/SoyTiyi/Http-LinkedList.git
```

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
git clone https://github.com/SoyTiyi/Http-LinkedList.git
 ```

 Y luego entraremos a la carperta LinkedList_AREP

```sh
$ cd Http-LinkedList
 ```
Descargaremos y compilaremos el proyecto con el siguiente comando
Este comando nos descargara la dependencias necesarias, como lo son JUnit y Spark

 ```sh
$ mvn package
 ```
 Y finalmente para ejecutar la aplicación.

 ```sh
$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.Spark.SparkWebApp"
 ```

### Prerequisitos

* Tener conocimientos básicos en la terminal o CMD
* Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Integracion Continua

[![CircleCI](https://circleci.com/gh/SoyTiyi/Http-LinkedList.svg?style=svg)](https://circleci.com/gh/SoyTiyi/Http-LinkedList)

## Despliegue en Heroku

[![Heroku App](http://heroku-shields.herokuapp.com/fast-waters-46508)](https://fast-waters-46508.herokuapp.com)

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
* [VIM](https://www.vim.org/download.php) - Editor de Texto VIM

## Author

 - Santiago Martínez Martínez 
 - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito 
 - Noveno Semestre

## License

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
