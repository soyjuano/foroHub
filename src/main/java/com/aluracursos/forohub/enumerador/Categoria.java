package com.aluracursos.forohub.enumerador;

public enum Categoria {

    LENGUAJES_DE_PROGRAMACION("Lenguajes de Programacion", new String[]{
        "Java",
        "PHP",
        "C#",
        "C++",
        "Python",
        "JavaScript",
        "Ruby",
        "Swift",
        "Kotlin",
        "TypeScript",
        "Go",        
        "HTML/CSS"
    }),
    FRAMEWORKS_Y_BIBLIOTECAS("Frameworks y Bibliotecas", new String[]{
        "React.js",
        "Angular",
        "Vue.js",
        "Express.js",
        "Flutter",
        "Spring Framework",
        "Django",
        ".NET Core",
        "Ruby on Rails",
        "Laravel"
    }),
    DESARROLLO_WEB("Desarrollo Web", new String[]{
        "Seguridad Web",
        "Experiencia de Usuario (UX)",
        "Diseño Web"
        "Frontend Development",
        "Backend Development",
        "Desarrollo Full Stack",
        "Arquitectura Web",
        
    }),
    DESARROLLO_DE_APLICACIONES_MOVILES("Desarrollo de Aplicaciones Moviles", new String[]{
        "Desarrollo Cross-Platform",
        "Diseño de Interfaz de Usuario Móvil (UI)",
        "Desarrollo de Juegos Móviles"
        "iOS Development",
        "Android Development",
        
    }),
    DEVOPS_Y_DESPLIEGUE("DevOps y Despliegue", new String[]{
        "Gestión de Configuración (Ansible, Chef, Puppet)",
        "Monitoreo y Registro"
        "Integración Continua / Entrega Continua (CI/CD)",
        "Administración de Sistemas",
        "Contenedores (Docker, Kubernetes)",
        
    }),
    BASES_DE_DATOS_Y_ALMACENAMIENTO_DE_DATOS("Bases de Datos y Almacenamiento de Datos", new String[]{
        "Bases de Datos Relacionales",
        "Bases de Datos No Relacionales",
        "Modelado de Datos",
        "SQL",
        "NoSQL",        
        "Big Data"
    }),
    INTELIGENCIA_ARTIFICIAL_Y_CIENCIA_DE_DATOS("Inteligencia Artificial y Ciencia de Datos", new String[]{
        "Visión por Computadora",
        "Análisis de Datos",
        "Minería de Datos"
        "Machine Learning",
        "Deep Learning",
        "Procesamiento del Lenguaje Natural (NLP)",
        
    }),
    SEGURIDAD_INFORMATICA("Seguridad Informatica", new String[]{
        "Auditoría de Seguridad",
        "Protección de Datos",
        "Criptografía"
        "Ciberseguridad",
        "Ethical Hacking",
        
    }),
    OTROS("Otros", new String[]{
        "Metodologías de Desarrollo Ágil",
        "Tutoriales y Recursos de Aprendizaje",
        "Carrera y Desarrollo Profesional"
        "Desarrollo de Videojuegos",
        "Desarrollo de Software Empresarial",
        
    });

    private final String descripcion;
    private final String[] subcategorias;

    Categoria(String descripcion, String[] subcategorias) {
        this.descripcion = descripcion;
        this.subcategorias = subcategorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String[] getSubcategorias() {
        return subcategorias;
    }
}
