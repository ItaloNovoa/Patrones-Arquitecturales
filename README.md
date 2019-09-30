# Patrones-Arquitecturales


## si desea saber acerca de los costos generados por AWS en los servicios utilizados en este proyecto puede observarlo en los siguientes link
- [costos EC2](https://aws.amazon.com/ec2/pricing/)
- [costos S3](https://aws.amazon.com/s3/pricing/)
- [costos VPC](https://aws.amazon.com/vpc/pricing/)
- [RDS](https://aws.amazon.com/rds/pricing/)
- ademas se dejara este link en el cual podra calcular los costos de forma mas interactiva dependiendo los servicios y el tiempo de uso del servicio [Calculadora de costos](https://calculator.s3.amazonaws.com/index.html)

# Como desplegar un sitio estático usando S3
##### en el siguiente tutorial se subira como archivo estatico un .html basico, con el fin de poder hacer este archivo visible a travez de la red de forma publica
##### Si desea puede ver un video describiendo los mismo pasos mostrados en el siguiente tutorial [VideoS3](https://www.youtube.com/watch?v=nhXOhzIjrUI&feature=youtu.be)

## Prerequisitos 
- git
- cuenta en amazon web services
## Instrucciones
- paso 1 : descargar el repositorio
  - paso 1.1 : ingrese a la consola o terminal
  - paso 2.2 : ingrese el siguiente codigo en la consola o terminal para tener el archivo que subiremos de forma estatica (si usted lo desea puede usar un archivo propio y no descargar el repositorio)
  ~~~~
  git clone https://github.com/ItaloNovoa/Patrones-Arquitecturales
  ~~~~
- paso 2 : logearse en aws y posteriormente ir a AWS CONSOLE
![image](https://user-images.githubusercontent.com/42522754/65840388-138aee80-e2de-11e9-8281-5c24e623b48c.png)
- paso 3 : dar click en servicios
![image](https://user-images.githubusercontent.com/42522754/65840398-492fd780-e2de-11e9-827e-f76e28188c45.png)
- paso 4: damos click en S3
![image](https://user-images.githubusercontent.com/42522754/65840510-bb54ec00-e2df-11e9-9b9d-ac913e5c649d.png)
- paso 5: le damos a crear bucket
![image](https://user-images.githubusercontent.com/42522754/65840534-fb1bd380-e2df-11e9-9c8c-f17c2072373a.png)
- paso 6: añadimos un nombre al bucket y le damos siguiente (si desea puede cambiar la REGION)
![image](https://user-images.githubusercontent.com/42522754/65840571-5d74d400-e2e0-11e9-8a19-d2ed5f6e0128.png)
- paso 7: ignoramos esta pestaña y procedemos a darle en el boton siguiente
![image](https://user-images.githubusercontent.com/42522754/65840624-d542fe80-e2e0-11e9-9789-de00fa8b8ae8.png)
- paso 8 : desbloqueamos el acceso publico y le damos en siguiente
![image](https://user-images.githubusercontent.com/42522754/65840641-0e7b6e80-e2e1-11e9-87cb-2a57bb19f2a4.png)
- paso 9: ingnoramos el ultimo paso y procedemos a crear el bucket
![image](https://user-images.githubusercontent.com/42522754/65840676-716d0580-e2e1-11e9-8700-e83a5e9d8043.png)
- paso 10: ingresamos al bucket creado
![image](https://user-images.githubusercontent.com/42522754/65840710-d6286000-e2e1-11e9-8c1c-cfda25f9178b.png)
- paso 11: le damos a la opcion cargar
![image](https://user-images.githubusercontent.com/42522754/65840751-4a630380-e2e2-11e9-9483-7b211834107e.png)
- paso 12: arrastramos el archivo [ejemplo.html](https://github.com/ItaloNovoa/Patrones-Arquitecturales/blob/master/ejemplo.html) descargado en el primer paso y le damos en siguiente una vez el archivo termine de cargar
![image](https://user-images.githubusercontent.com/42522754/65840859-4e435580-e2e3-11e9-944e-b446bed4ae6e.png)
![image](https://user-images.githubusercontent.com/42522754/65840852-2a800f80-e2e3-11e9-8ee9-dc0578dcf16e.png)

- paso 13: concedemos persmisos publicos y le damos en siguiente

![image](https://user-images.githubusercontent.com/42522754/65840896-beea7200-e2e3-11e9-984e-7dda0d0862d1.png)

- paso 14: presionamos siguiente
![image](https://user-images.githubusercontent.com/42522754/65840911-ee997a00-e2e3-11e9-8898-852c01655a4d.png)
- paso 15: presionamos cargar
![image](https://user-images.githubusercontent.com/42522754/65840935-14268380-e2e4-11e9-98c2-527a484dbe05.png)
- paso 16: presionamos el archvio estico que acabamos de cargar
![image](https://user-images.githubusercontent.com/42522754/65840960-55b72e80-e2e4-11e9-8252-aae04754cb47.png)
- paso 17: bajamos la pestaña y presionamos la url del objeto 
![image](https://user-images.githubusercontent.com/42522754/65840995-9adb6080-e2e4-11e9-8675-c412cdab5b93.png)
- paso 18: podemos ver como el objeto el cual acabamos de subir se pude visualizar de modo publico a travez de la red
![image](https://user-images.githubusercontent.com/42522754/65841033-e7bf3700-e2e4-11e9-84b2-89f998f31e11.png)


# Como desplegar springboot con maven usando mysql AWS en una maquina linux EC2 de AWS

##### en el siguiente tutorial se explicara como conectar un formulario hecho en spring-boot(MVN) a una base de datos MYSQL de AWS y posteriormente desplegarlo a una maquina linux de AWS
##### Si desea puede ver un video describiendo los mismo pasos mostrados en el siguiente tutorial [VideoSpringboot con aws](https://www.youtube.com/watch?v=dFyCx1MGVgo)

## Prerequisitos 
- git
- cuenta en amazon web services
- maven
- java 1.8
- dbeaver

## Instrucciones
  
- paso 1 : descargar el repositorio
  - paso 1.1 : ingrese a la consola o terminal
  - paso 1.2 : ingrese el siguiente codigo en la consola o terminal para tener el formulario dinamicocon spring-boot (si usted lo desea puede usar un archivo propio y no descargar el repositorio)
  ~~~~
  git clone https://github.com/ItaloNovoa/Patrones-Arquitecturales
  ~~~~
- paso 2 : logearse en aws y posteriormente ir a AWS CONSOLE
![image](https://user-images.githubusercontent.com/42522754/65840388-138aee80-e2de-11e9-8281-5c24e623b48c.png)
- paso 3 : dar click en servicios
![image](https://user-images.githubusercontent.com/42522754/65840398-492fd780-e2de-11e9-827e-f76e28188c45.png)
- paso 4 : dar click en RDS para las bases de datos relacional
![image](https://user-images.githubusercontent.com/42522754/65905584-6f10b700-e386-11e9-947c-87b6d9829605.png)
- paso 5 : le damos en crear la base de datos
![image](https://user-images.githubusercontent.com/42522754/65908058-37583e00-e38b-11e9-8c2e-d5de67838c69.png)
- paso 6: procedemos a crear la base de datos de la siguiente forma y le damos en la opcion de free tier
![image](https://user-images.githubusercontent.com/42522754/65908546-3ffd4400-e38c-11e9-9a43-60a9ba1e770e.png)
![image](https://user-images.githubusercontent.com/42522754/65911035-886b3080-e391-11e9-9d3b-e7d621211fc0.png)
- paso 7: dejamos los datos por defecto y le damos en auto generar claves
![image](https://user-images.githubusercontent.com/42522754/65910373-29f18280-e390-11e9-806d-5e40c8d2e854.png)
- paso 8: dejamos estoigual
![image](https://user-images.githubusercontent.com/42522754/65910395-35dd4480-e390-11e9-9ac8-cf9a7063e4ea.png)
![image](https://user-images.githubusercontent.com/42522754/65910427-442b6080-e390-11e9-95ae-4f9262c6d365.png)
- paso 9: presionamos en configuracion adicional y en yes:
![image](https://user-images.githubusercontent.com/42522754/65910547-8c4a8300-e390-11e9-93f1-86af28ee0f71.png)
- paso 10: presionamos configuracion adicional y asignamos un nombre a la base de datos
![image](https://user-images.githubusercontent.com/42522754/65910809-0c70e880-e391-11e9-96dd-dc79b4ad8525.png)
- paso 11: le damos en crear la base de datos
![image](https://user-images.githubusercontent.com/42522754/65911154-c405fa80-e391-11e9-8c54-b1e184ea263b.png)
- paso 12: presionamos la opcion de ver credenciales y guardamos las credenciales para posteriormente ingresarlas en el codigo del repositorio y en Dbeaver
![image](https://user-images.githubusercontent.com/42522754/65911250-fa437a00-e391-11e9-9dfa-07d8b46196c7.png)
- paso 13: abrimos la carpeta /formularioDinamico del repositorio descargado en el paso 1.2 (en este caso lo abrire con el IDE de VISUAL STUDIO CODE) y cambiamos los datos de applcation.properties por los de las del paso anterior:
![image](https://user-images.githubusercontent.com/42522754/65912213-74c0c980-e393-11e9-86dc-71e45329d6cb.png)
- paso 14: ingresamos a la base de datos una vez este disponible
![image](https://user-images.githubusercontent.com/42522754/65913101-e77e7480-e394-11e9-9439-a3045d7ca8ab.png)
- paso 15: pegamos el endpoint en application.properties
![image](https://user-images.githubusercontent.com/42522754/65913362-62478f80-e395-11e9-9c7c-7a52e3fba697.png)
- paso 16: cambiamos la parte mostrada en la imagen por la del nombre de la base de datos puesto el paso 10
![image](https://user-images.githubusercontent.com/42522754/65913830-23660980-e396-11e9-8726-39bdab400d8e.png)
- paso 17: abrimos dbeaver y seguimos los siguientes pasos 
![image](https://user-images.githubusercontent.com/42522754/65914203-a38c6f00-e396-11e9-8640-1f8058e8be39.png)
![image](https://user-images.githubusercontent.com/42522754/65915112-53aea780-e398-11e9-8667-738cfa2a53e4.png)
![image](https://user-images.githubusercontent.com/42522754/65915020-22ce7280-e398-11e9-8647-1ca29277b4c0.png)
![image](https://user-images.githubusercontent.com/42522754/65915177-85c00980-e398-11e9-86ea-3185c8c6fc90.png)
![image](https://user-images.githubusercontent.com/42522754/65915202-94a6bc00-e398-11e9-8bce-e1af37d48bab.png)
![image](https://user-images.githubusercontent.com/42522754/65915710-91600000-e399-11e9-8ac1-420e6f5e74b7.png)
- PASO 18: PARA ARREGLAR EL ERROR ANTERIOR PROCEDMOS A INGRESAR NUEVAMENTE A AWS
![image](https://user-images.githubusercontent.com/42522754/65915837-db48e600-e399-11e9-92f5-db9a10127c6e.png)
![image](https://user-images.githubusercontent.com/42522754/65916022-3da1e680-e39a-11e9-9ec7-9679e2b71aac.png)
![image](https://user-images.githubusercontent.com/42522754/65916049-4bf00280-e39a-11e9-80ab-dc893610ae4d.png)
![image](https://user-images.githubusercontent.com/42522754/65916147-6f1ab200-e39a-11e9-99ca-2366a33b5a67.png)
- paso 19: volvemos a dBeaver y hacemos lo siguiente:
![image](https://user-images.githubusercontent.com/42522754/65916550-29121e00-e39b-11e9-8f51-658cb29f1b62.png)
![image](https://user-images.githubusercontent.com/42522754/65916602-43e49280-e39b-11e9-86ef-0c5abeaff111.png)
![image](https://user-images.githubusercontent.com/42522754/65916642-5232ae80-e39b-11e9-9434-c33e3690aa44.png)
![image](https://user-images.githubusercontent.com/42522754/65916674-5fe83400-e39b-11e9-92df-551b572fb44b.png)
- paso 20: abrimos el sql editor con un clickderecho en la parte principal de las carpetas y despues click en SQL Editor

![image](https://user-images.githubusercontent.com/42522754/65916827-a178df00-e39b-11e9-8f7e-ce93fd58f24a.png)
- paso 21: copiamos el siguiente codigo en el script como se muestra en la siguiente imagen y le damos click en la flecha verde subrayada
 ~~~~
USE db1
  ~~~~
~~~~
  CREATE TABLE first_Table(
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
firstname VARCHAR(30) NOT NULL,
lastname VARCHAR(30) NOT NULL
)
~~~~
![image](https://user-images.githubusercontent.com/42522754/65917258-98d4d880-e39c-11e9-96ae-bdc553ac7559.png)

- paso 22: y despues vamos a a visual studio code y creamos una nueva terminal

![image](https://user-images.githubusercontent.com/42522754/65917782-cb330580-e39d-11e9-82a1-ef0742f0d95d.png)

- paso 23: la terminal se debe asi

![image](https://user-images.githubusercontent.com/42522754/65919030-d20f4780-e3a0-11e9-8184-e759dd64f1f4.png)

- paso 24: escribimos las siguientes lineas en la consola
~~~~
mvn install
mvn spirng-boot:run
~~~~
- paso 25: al terminar de correr mvn spring-boot:run ingresamos a este link http://localhost:8080/ y veremos lo siguiente

![image](https://user-images.githubusercontent.com/42522754/65920142-d426d580-e3a3-11e9-8a23-c03ca713cc5c.png)

- paso 26: ingresaremos un usario y veremos la base de datos
![image](https://user-images.githubusercontent.com/42522754/65920234-1e0fbb80-e3a4-11e9-8607-e43ee952a93b.png)


![image](https://user-images.githubusercontent.com/42522754/65920217-13552680-e3a4-11e9-8a1f-37b4b2d7b8d2.png)

![image](https://user-images.githubusercontent.com/42522754/65920404-88286080-e3a4-11e9-8428-8704f2fefa8a.png)



