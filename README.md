 ![Azure Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Microsoft_Azure_Logo.svg/200px-Microsoft_Azure_Logo.svg.png)

# SERVICIO COGNITIVO SPEECH 🔍📚
 
  > ***Este proyecto es una implementación del Servicio Cognitivo Azure Speech, el cual proporciona capacidades de reconocimiento de voz y conversión de texto a voz en tiempo real. Utiliza tecnologías de inteligencia artificial y aprendizaje automático para ofrecer     una experiencia de usuario avanzada en aplicaciones que requieren interacciones de voz.***
# AUTORES 🧑‍💻

[![Shirley Ascencio Luyo](https://img.shields.io/badge/GitHub-Shirley%20Ascencio%20Luyo-blue?logo=github)](https://github.com/ShirleyAscencioLuyo)
[![Valery Chumpitaz](https://img.shields.io/badge/GitHub-Valery%20Chumpitaz-blue?logo=github)](https://github.com/16-ValeryChumpitaz)
[![Gabriel Gutierrez Quispe](https://img.shields.io/badge/GitHub-Gabriel%20Gutierrez%20Quispe-blue?logo=github)](https://github.com/GabrielGutierrezQuispe)

## LENGUAJES Y HERRAMIENTAS 💻

-  &#160;![Spring](http://img.shields.io/badge/-Spring-6DB33F?style=flat&logo=spring&logoColor=ffffff)
-  &#160;![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat&logo=postman&logoColor=white)
-  &#160; ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=flat&logo=postgresql&logoColor=white)
- &#160; ![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)
- &#160; ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&link=hhttps://github.com/Quananhle/Java-Web-Developer)
-  &#160;![Git](https://img.shields.io/badge/-Git-black?style=flat&logo=git&link=https://github.com/Quananhle)
-  &#160;![GitHub](https://img.shields.io/badge/GitHub-100000?style=flat&logo=github&logoColor=white)

# PREVIAMENTE📚
### Activar Microsoft Learn Sandbox
_Para comenzar, necesitamos activar el entorno de aprendizaje de Microsoft (Microsoft Learn) Sandbox._

![Badge](https://learn-attachment.microsoft.com/api/attachments/790c643b-5eb2-40f8-8224-54232a4be5fd?platform=QnA)


## CREACIÓN EL SERVICIO COGNITIVO DE AZURE SPEECH 🎙️🚀
_El servicio de reconocimiento de voz de Azure es una herramienta poderosa que permite a los desarrolladores convertir fácilmente la voz humana en texto (reconocimiento de voz) y viceversa (síntesis de voz). Esto es útil para una amplia gama de aplicaciones, como asistencia virtual, servicios de atención al cliente automatizados y más._

_Ahora, procedemos a crear el servicio cognitivo en Azure. Completa los campos requeridos siguiendo estos pasos:_

1. _Inicia sesión en tu cuenta de Azure._
2. _Navega a la sección de servicios cognitivos._
3. _Haz clic en "Crear" y completa el formulario con los detalles necesarios._
4. _Finalmente, confirma la creación del servicio._

_¡Listo! Ahora tienes tu servicio cognitivo de Azure listo para ser utilizado en tu aplicación._

![Badge](https://miro.medium.com/v2/resize:fit:1400/1*MiY3_tIQVdFgerM8UVPV5w.png )

## PROGRAMACIÓN REACTIVA R2DBC Y SPRING WEB FLUX 🌐🛠️

_Utilizamos programación reactiva para gestionar las solicitudes de manera eficiente y escalable. A continuación, se detallan los pasos para configurar R2DBC y Spring Web Flux en tu entorno de desarrollo:_

1. **Agregar dependencias**:

_Agregamos las dependencias necesarias para R2DBC y Spring Web Flux_
  ```
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-webflux</artifactId>
  </dependency>
  <dependency>
       <groupId>io.r2dbc</groupId>
       <artifactId>r2dbc-postgresql</artifactId>
  </dependency>    
  ```
2. **Configurar la conexión a la base de datos**:
   
_En el archivo application.yml configuramos lo necesario para la conexion a la base de datos._
```
       server:
        port: 8085
    
    spring:
        r2dbc:
            url: r2dbc:postgresql://roundhouse.proxy.rlwy.net:16870/railway
            username: postgres
            password: ************************
```

3. **Configurar controladores reactivos**:
   
_Creamos controladores utilizando las anotaciones proporcionadas por Spring Web Flux, como @RestController, @GetMapping, @PostMapping, etc.devolviendo objetos reactivos como Mono o Flux._

![Spring Web Flux](https://i.imgur.com/BFZK0d8.png)

## PROBAR SERVICIO EN POSTMAN  📧📤✔️
_Ponemos en funcionamiento las APIs. Sigue estos pasos para comenzar:_

1. **Descarga e instala Postman**:
     _Si aún no tienes instalado Postman, descárgalo e instálalo desde [aquí](https://www.postman.com/downloads/)._

3. **Obtén tu clave de API**:
     _Antes de empezar, necesitarás obtener tu clave de API del Servicio Cognitivo Azure Speech y tambien tu region._

5. **Configura una nueva solicitud en Postman**:
     _Abre Postman y crea una nueva solicitud. Selecciona el método HTTP adecuado (GET, POST, etc.) según la acción que quieras realizar con la API del Servicio Speech._

7. **Configura los parámetros de la solicitud**:
     _Añade la URL de la API del Servicio Speech y cualquier parámetro necesario, como la clave de API y los datos de entrada._

9. **Envía la solicitud**:
      _Haz clic en el botón de enviar para ejecutar la solicitud y recibir la respuesta del Servicio Speech._
   
![postman1](https://i.imgur.com/ynyQNMU.jpeg)

_¡Y eso es todo! Ahora podemos comenzar a interactuar con la API del Servicio Cognitivo Azure Speech utilizando Postman_

## CONEXIÓN A UNA BASE DE DATOS NUBE POSTGRESQL EN RAILWAY 🔐💾

 _Utilizamos una base de datos PostgreSQL en la nube proporcionada por Railway para almacenar datos de manera segura y escalable. A continuación, se detallan los pasos para configurar la conexión a esta base de datos:_
 
1. **Registro en Railway**:
   
  _Accede al sitio web de Railway y [regístrate](https://railway.app/) para obtener una cuenta si aún no tienes una._

2. **Creación de un proyecto**:
   
  _Después de iniciar sesión, crea un nuevo proyecto en Railway desde tu panel de control._

3. **Agregar una base de datos PostgreSQL**:
   
  _Una vez dentro del proyecto, haz clic en "Add New" y selecciona "Database" en el menú desplegable._
  _Elige PostgreSQL como el tipo de base de datos._
  _Configura las opciones según tus necesidades (tamaño de la base de datos, región, etc.) y confirma la creación._
  
![railway](https://i.imgur.com/g78tY7Q.jpeg)

4. **Obtención de las credenciales de la base de datos**:
   
  _Una vez que la base de datos esté creada, haz clic en ella para ver los detalles._
  _Encuentra las credenciales de conexión, que generalmente incluyen el host, el puerto, el nombre de usuario y la contraseña._

5. **Configuración en el proyecto**
    
_Abre el archivo de configuración del proyecto application.yml y realiza la conexion a la base de datos._

![configuracion](https://i.imgur.com/70dCTur.png)

_Una vez que hayas completado estos pasos, tu aplicación estará configurada para conectarse a la base de datos PostgreSQL en la nube en Railway._

![railway](https://i.imgur.com/tBT3KYN.jpeg)

## DOCKERIZACIÓN DEL PROYECTO 🐳🚀
_Para dockerizar este proyecto y desplegarlo en contenedores Docker, sigue estos pasos:_

1. **Crear el archivo dockerfile**:

   _Realizamos la respectiva configuracion de nuestro archivo_

   ![configuracion](https://i.imgur.com/Gk5Dizg.jpeg)
   
3. **Construir la imagen Docker**:
   
   _Ejecuta el siguiente comando en el directorio raíz del proyecto para construir la imagen Docker:_
   ```
   docker build -t gabrielgutierrezquispe/service-speech:v1 .
   ```
4. **Ejecutar el contenedor Docker**:
   
    _Una vez que la imagen Docker se haya construido correctamente, puedes ejecutar un contenedor con el siguiente comando:_
   ```
   docker run -p 8085:8085 gabrielgutierrezquispe/service-speech:v1
   ```
6. **Publicarlo en docker Hub**:
   
   _Para publicarlo en el perfil de dockerhub, ejecutamos el siguiente comando:_
   ```
   docker push gabrielgutierrezquispe/service-speech:v1
   ```
8. **Verificar el contenido**:
   
   _Para ejecutarlo y poder verificar el contenido ejecutamos:_
   ```
   docker run -d -p 8085:8085 --name Speech_Test gabrielgutierrezquispe/service-speech
   ```
   ![dockerhub](https://i.imgur.com/YHWX2Cf.jpeg)


📚 Recurso: [Inicio rápido de la conversión de voz en texto: servicio de voz - Azure AI services | Microsoft Learn](https://learn.microsoft.com/es-es/azure/cognitive-services/speech-service/get-started)

💬 Foros de la comunidad: [Foros de la comunidad de Microsoft](https://docs.microsoft.com/es-es/answers/topics/azure-speech-service.html)
