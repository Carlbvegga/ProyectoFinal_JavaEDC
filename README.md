## README para el repositorio Carlbvegga/ProyectoFinal_JavaEDC

**Descripción del proyecto:**

Este repositorio contiene el código fuente para un sistema de gestión de empleados desarrollado en Java. El sistema cuenta con las siguientes funcionalidades:

* **Ventana de inicio de sesión:** Permite a los usuarios registrados acceder al sistema.
* **Ventana de registro:** Permite crear nuevos usuarios en el sistema.
* **Ventana CRUD (Crear, Leer, Actualizar, Eliminar):** Permite gestionar la información de los empleados, incluyendo:
    * **Crear:** Agregar nuevos empleados al sistema.
    * **Leer:** Consultar la información de los empleados existentes.
    * **Actualizar:** Modificar la información de los empleados existentes.
    * **Eliminar:** Eliminar empleados del sistema.

**Tecnologías utilizadas:**

* **Java:** Lenguaje de programación principal.
* **MySQL:** Base de datos para almacenar la información de los empleados.

**Requisitos de instalación:**

* **Java Developer Kit (JDK):** Versión 11 o superior.
* **MySQL Server:** Versión 8.0 o superior.

**Instrucciones de uso:**

1. **Clonar el repositorio:**

```bash
git clone https://github.com/Carlbvegga/ProyectoFinal_JavaEDC.git
```

2. **Compilar el proyecto:**

```bash
cd ProyectoFinal_JavaEDC
mvn compile
```

3. **Ejecutar el proyecto:**

```bash
mvn exec
```

4. **Crear una base de datos MySQL:**

* Crea una base de datos llamada `empleados` en MySQL.
* Ejecuta el archivo `sql/create_table.sql` para crear la tabla `empleados` en la base de datos.

5. **Configurar la conexión a la base de datos:**

* Edita el archivo `src/main/resources/application.properties` y configura los parámetros de conexión a la base de datos MySQL.

**Contribuciones:**

Se aceptan contribuciones al proyecto. Por favor, sigue las guías de estilo y buenas prácticas de programación.

**Licencia:**

Este proyecto está licenciado bajo la licencia MIT.

**Agradecimientos:**

A todos los que han contribuido a este proyecto particularmente a la Escuela de Código de PILARES, ya sea con código, comentarios o sugerencias.

**¡Esperamos que este proyecto te sea útil!**
