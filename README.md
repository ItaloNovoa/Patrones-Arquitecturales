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
##### Si desea puede ver un video describiendo los mismo pasos mostrados en el siguiente tutorial [VideoSpringboot con aws](https://www.youtube.com/watch?v=nhXOhzIjrUI&feature=youtu.be)

## Prerequisitos 
- git
- cuenta en amazon web services
- maven
- java 1.8

## Instrucciones
  
- paso 1 : descargar el repositorio
  - paso 1.1 : ingrese a la consola o terminal
  - paso 2.2 : ingrese el siguiente codigo en la consola o terminal para tener el formulario dinamicocon spring-boot (si usted lo desea puede usar un archivo propio y no descargar el repositorio)
  ~~~~
  git clone https://github.com/ItaloNovoa/Patrones-Arquitecturales
  ~~~~
- paso 2 : logearse en aws y posteriormente ir a AWS CONSOLE
![image](https://user-images.githubusercontent.com/42522754/65840388-138aee80-e2de-11e9-8281-5c24e623b48c.png)
- paso 3 : dar click en servicios
![image](https://user-images.githubusercontent.com/42522754/65840398-492fd780-e2de-11e9-827e-f76e28188c45.png)

