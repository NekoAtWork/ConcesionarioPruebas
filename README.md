# ConcesionarioPruebas

Simulación concurrente en Java que modela el funcionamiento de un concesionario con un número limitado de vehículos de prueba.  
El sistema gestiona el acceso de múltiples clientes mediante semáforos, garantizando exclusión mutua y evitando condiciones de carrera.

---

## Objetivo del proyecto

El propósito de este proyecto es demostrar el uso correcto de **concurrencia en Java**, aplicando:

- Semáforos (`java.util.concurrent.Semaphore`)
- Hilos (`Thread`)
- Secciones críticas
- Control de acceso a recursos limitados
- Simulación de tiempos de uso y espera

El escenario representa un concesionario donde varios clientes intentan acceder a un número limitado de coches disponibles para pruebas.

---

## Tecnologías utilizadas

- **Java 17**
- **Maven**
- **IntelliJ IDEA**
- Programación concurrente con semáforos

---

## Arquitectura del proyecto
src/ 
└── main/ 
    └── java/ 
        └── Concesionario/ 
        ├── Main.java 
        ├── Cliente.java 
        ├── Concesionario.java 
        └── (otras clases según implementación)

- `Concesionario` gestiona los recursos (coches disponibles).
- `Cliente` representa un hilo que solicita un coche, lo usa y lo devuelve.
- `Main` inicializa el sistema y lanza los hilos.

---

## Funcionamiento resumido

1. Se crea un semáforo con un número limitado de permisos (coches).
2. Cada cliente (hilo):
- Solicita un coche (`acquire`)
- Realiza la prueba durante un tiempo aleatorio
- Devuelve el coche (`release`)
3. El sistema garantiza que nunca haya más clientes usando coches que vehículos disponibles.

---
