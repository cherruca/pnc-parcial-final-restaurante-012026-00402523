# ¿Qué partes generó bien la IA sin necesidad de corrección?

Podría decir que nada, pero en parte fue mi culpa por que no fui lo suficientemente especifico a la hora de redactar el primer prompt para detallar las tenologías que necesitaba ocupar.

Dejando de lado lo anterior, creo que lo básico lo entregó de manera satisfactoria: el código de las entidades, los repositorios, algunos dto básicos...

# ¿Qué errores o decisiones incorrectas tomó la IA, especialmente en temas de seguridad?

En un principio solo entregó una plantilla básica, y brindó recomendaciones de como seguir.

# ¿Cómo detectaron esos errores y cómo los corrigieron?

Primero leí todo el código que entregó y las recomendaciones textuales que dio, pero tocó seguir profundizando el tema con otras IA más potentes y reescribiendo código.

Por ejemplo:  solo entrego incompletos las clases del JWT service y la estructura de "cómo debería quedar el proyecto" y tocó seguir agregando prompts para completar el resto del código.

# Si tuvieran que explicarle a un compañero cómo funciona el mecanismo de autorización por sucursal (o la regla de negocio que eligieron), ¿qué le dirían?

1. En la entidad de usuario se define un ENUM para su rol.
2. A la hora de hacer login con el ```LoginRequest``` se trae el rol del usuario.
3. Se crea el token de la sesión del usario y se devuelve con el ```LoginResponse```. 
   4. 
