# ¿Qué partes generó bien la IA sin necesidad de corrección?

Podría decir que nada, pero en parte fue mi culpa por que no fui lo suficientemente especifico a la hora de redactar el primer prompt para detallar las tenologías que necesitaba ocupar.

Dejando de lado lo anterior, creo que lo básico lo entregó de manera satisfactoria: el código de las entidades, los repositorios, algunos dto básicos...

Creo que también hubiera sido más estrategico limitar los prompts a funciones en especifico, para no "confundir" a la IA.

# ¿Qué errores o decisiones incorrectas tomó la IA, especialmente en temas de seguridad?

En un principio solo entregó una plantilla básica, y brindó recomendaciones de como seguir.

Entregó el código incompleto y tuve que seguir añadiendo prompts para completarlo.

Para ser más exactos, no entregó por completo la implementación de las reglas de negocio ni de seguridad, entonces el flujo de programación se estancó.

# ¿Cómo detectaron esos errores y cómo los corrigieron?

Primero leí todo el código que entregó y las recomendaciones textuales que dio, pero tocó seguir profundizando el tema con otras IA más potentes y reescribiendo código.

Por ejemplo:  solo entrego incompletos las clases del JWT service y la estructura de "cómo debería quedar el proyecto" y tocó seguir agregando prompts para completar el resto del código.

# Si tuvieran que explicarle a un compañero cómo funciona el mecanismo de autorización por sucursal (o la regla de negocio que eligieron), ¿qué le dirían?

1. En la entidad de usuario se define su rol.
2. También en la entidad de mesa se define su rol.
3. Se hace el login con usuario y contraseña
4. Se genera el JWT.
5. Se verifica autentica el usuario con su rol y sucursal
6. En cualquiera de los modulos que requieran verificación de rol y sucursal se vincula el JWT.
7. Se valida el rol por el service que corresponde. 
8. El admin tiene acceso total.
9. AL encargado se le verifica que sea su sucursal asignada.
10. y al usuario se verifica que el pedido sea suyo
