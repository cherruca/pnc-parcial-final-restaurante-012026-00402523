# Evidencia de buen uso de herramientas IA

Con Chat GPT, ejecuté el siguiente prompt para obtener una plantilla básica para el proyecto:

````
usando java, springboot y posgresql genera el codigo basico para las siguientes indicaciones: 

Desarrollar un proyecto backend de un sistema donde distintos usuarios interactúan con las mesas y los pedidos de una cadena de restaurantes con varias sucursales.

Entidades mínimas:

Restaurante/Sucursal (el sistema maneja más de una sucursal)

Mesa (pertenece a una sucursal, tiene capacidad y estado)

Pedido/Orden (asociado a un cliente, una mesa y una lista de productos)

Usuario (con rol asignado)

Quiero que la arquitectura respete el enfoque N-Capas que hemos visto en clase (Presentación / Lógica de Negocio / Acceso a Datos, como mínimo).

Autenticación

Login con usuario y contraseña, que devuelva un Access Token (JWT) y un Refresh Token.

El Access Token debe expirar en un tiempo corto (por ejemplo, 15 minutos) y el Refresh Token en un tiempo mayor (por ejemplo, 7 días).

Endpoint para renovar el Access Token usando el Refresh Token.

Mínimo estos tres roles, con permisos claramente diferenciados:

| Rol | Permisos |
|---|---|
| Administrador | Acceso total: gestiona restaurantes, mesas, usuarios y pedidos de todas las sucursales |
| Encargado de turno | Gestiona pedidos y mesas, pero **únicamente de la sucursal a la que pertenece** |
| Cliente | Solo puede crear, ver y cancelar sus propios pedidos |



````

Luego corregí el para que adapte la configuración a gradle

````
adapta el código a gradle
````

Al ver que la IA entregó el código parcial, tuve que solicitar que desarrollara lo que faltaba

``` 
que debe contener la clase AuthService?
```
