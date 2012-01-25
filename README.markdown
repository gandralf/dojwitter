Twitter Dojo
============

Básicamente, el objetivo es crear una aplicación similar al Twitter. Esta aplicación seguiría las siguientes etapas de desarrollo:

- Análisis y modelado inicial. Que es twitter? ¿Cuales serían las principales clases (dominio), sus responsabilidades y cómo ellas colaborarían entre si?
- Clone de github
- Setup: web app + vraptor 3 + jpa + ftl

0.1: fake login
---------------

Login: haga un login simples solamente para identificar el usuario. Dos user/contraseña son aceptables: java/sun y ruby/rails. Use la forma más simples para identificar el usuario (cookie).

- Si el usuario no está identificado, la home (/) exhibe un formulario de login. Teste! (junit + webdriver).
- Envío (POST) del login/seña para /login. OK: redirect (/) sin el formulario y el texto "Bienvenido, ${user}". Error: mensaje de error y el formulario.
- Link logout (/logout) solamente está visible se el usuario está logueado y lleva a la home (/) con el formulario.

0.2: posts (login hecho)
------------------------

- Home (/): "Bien venido", un text area y un botón Shout!. Prueba: la home retorna esta página.
- Recuperación y exhibición del listado de mensajes (GET) de /shouts (html). Use fakes.
- Envío (POST) del texto para (/shouts). Prueba: post retorna 200 OK.
- /shouts exhibe el nuevo post.

0.3: follow
-----------

- /users/find/xxx retorna todos los usuarios con login y botón "follow"
- "follow/unfollow": Un click en "follow" y un refresh en /users/find/xxx trae el mismo listado, pero con el bontón "unfollow". Un click en el "unfollow" y un refresh retorna un "follow"
- /shouts retorna el "timeline" de shouts del usuario actual y de quien él sigue

0.4: alpha
----------

Belezura, navegación.