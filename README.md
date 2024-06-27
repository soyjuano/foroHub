# ForoHub API

## Explorando los Misterios del Desafío Tecnológico
En Alura Latam, el foro se erige como un santuario digital donde los estudiantes desentrañan sus dudas y comparten conocimiento sobre diversos cursos y proyectos. Este espacio virtual, vibrante de interacciones, no solo facilita el aprendizaje, sino que también fomenta una comunidad de colaboración entre alumnos, instructores y moderadores.

La funcionalidad de un foro puede parecer sencilla a primera vista, pero ¿qué ocurre en las entrañas de este sistema? ¿Dónde se almacenan y gestionan los datos? ¿Cómo se vinculan los temas con sus respuestas correspondientes y cómo se mantiene la relación entre usuarios y discusiones?

Aquí surge nuestro reto, denominado ForoHub. Nos proponemos replicar este mecanismo en un nivel backend, creando para ello una API REST con Spring. Esta API se centrará en la gestión de temas y permitirá a los usuarios realizar las siguientes acciones:

Publicar un nuevo tema.
Visualizar todos los temas existentes.
Consultar detalles de un tema específico.
Actualizar el contenido de un tema.
Eliminar un tema de la base de datos.

Este conjunto de operaciones, conocido como CRUD (Crear, Leer, Actualizar, Eliminar), refleja las tareas básicas que desarrollamos previamente en LiterAlura. Sin embargo, en este proyecto, añadiremos una capa de complejidad adicional, integrando por completo las funcionalidades de actualización y eliminación, y utilizando un framework que agilizará nuestro proceso de desarrollo.

Para llevar a cabo este desafío, nuestro objetivo es implementar una API REST robusta con las siguientes características:

Rutas implementadas según las mejores prácticas del modelo REST: Esto asegurará una arquitectura limpia y eficiente para la interacción con los datos.
Validaciones de datos conforme a las reglas de negocio: Se establecerán criterios estrictos para la entrada y manipulación de información, garantizando la integridad de los datos.
Persistencia de datos en una base de datos relacional: Utilizaremos una base de datos que facilite el almacenamiento y la recuperación de información de manera estructurada.
Servicio de autenticación y autorización: Este sistema restringirá el acceso a la información sensible, asegurando que solo los usuarios autorizados puedan realizar ciertas operaciones.
Al enfrentar este desafío, no solo desarrollaremos habilidades técnicas avanzadas, sino que también profundizaremos en la comprensión del funcionamiento interno de las plataformas de discusión y colaboración, preparando así el terreno para futuros proyectos de mayor envergadura.

## Autorización

La API requiere autorización mediante tokens JWT para acceder a ciertos endpoints. Consulta la sección de Autenticación para más detalles.

## Tecnologías Implementadas

- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Spring Data JPA**
- **MySql**
- **Swagger/OpenAPI**
- **Maven**
- **Java 17**

## Autenticación y Seguridad

La API utiliza Spring Security para manejar la autenticación y autorización. Los endpoints protegidos requieren un token JWT válido en el header de autorización.