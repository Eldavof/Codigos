/* 
   1. CREACIÓN Y SELECCIÓN DE LA BASE DE DATOS
   - CREATE DATABASE: Construye el contenedor principal de nuestro proyecto.
   - USE: Le dice al sistema que todo lo que hagamos a partir de ahora se 
     guardará dentro de esta base de datos.
*/
CREATE DATABASE universidad;
USE universidad;


/* 
   2. CREACIÓN DE LA TABLA PRINCIPAL
   - CREATE TABLE: Construye la estructura donde se guardará la información 
     (las columnas y el tipo de dato que aceptan, como texto o fechas).
   - SELECT *: Muestra la tabla completa (que ahora estará vacía).
*/
CREATE TABLE uvmalumnos (
    Id INT,
    Firstname NVARCHAR(50),
    Lastname NVARCHAR(50),
    Birthdate DATE
);

SELECT * FROM uvmalumnos;


/*
   3. MODIFICACIÓN DE LA ESTRUCTURA (ALTER TABLE)
   - ALTER TABLE ... ADD: Agrega una nueva columna a una tabla que ya existe 
     sin necesidad de borrarla y crearla desde cero.
*/
ALTER TABLE uvmalumnos
ADD Address NVARCHAR(250);


/*
   4. INSERCIÓN DE DATOS INICIALES (INSERT)
   - INSERT INTO ... VALUES: Llena la tabla con registros (filas). 
     El primer registro especifica en qué columna va cada dato. Los siguientes
     usan la forma corta, asumiendo el orden exacto de las columnas.
*/
INSERT INTO uvmalumnos (Id, Firstname, Lastname, Birthdate, Address)
VALUES (1, 'Jim', 'Morrison', '1943-12-08', '2100 Vernon Place');

INSERT INTO uvmalumnos VALUES (2, 'John', 'Lennon', '1980-12-08', '2450 Moon Palace');
INSERT INTO uvmalumnos VALUES (3, 'Boy', 'George', '2000-07-01','777 Ermita Avenue');
INSERT INTO uvmalumnos VALUES (4, 'George', 'Harrison', '2000-07-01', '4850 Tlalpan Avenue');
INSERT INTO uvmalumnos VALUES (5, 'Veronica', 'Chicone', '2000-07-01', '9876 Rojo Gomez Street');


/*
   5. ACTUALIZACIÓN DE INFORMACIÓN (UPDATE)
   - SET SQL_SAFE_UPDATES = 0: Desactiva un seguro de MySQL temporalmente.
   - UPDATE ... SET ... WHERE: Cambia un dato existente. El 'WHERE' es vital 
     para indicarle a la base de datos que SOLO modifique al alumno con el 
     Id 5, y no a todos los de la tabla.
*/
SET SQL_SAFE_UPDATES = 0;

UPDATE uvmalumnos
SET Address = 'Insurgentes Sur 3456' 
WHERE Id = 5;

-- Valida el cambio de la PARTE 5
SELECT * FROM uvmalumnos;


/*
   6. y 7. CONSULTAS Y FILTROS (SELECT Y WHERE)
   - Filtramos para traer solo ciertas columnas (nombres, apellidos y dirección).
   - Filtramos por condición para traer un registro específico (Id = 2) o varios
     (Id > 2).
*/
-- PARTE 6. Consultar columnas específicas
SELECT Firstname, Lastname, Address FROM uvmalumnos;

-- PARTE 7. Buscar un registro exacto
SELECT * FROM uvmalumnos WHERE Id = 2;

-- PARTE 8. Consultar varios registros con condición (mayor a 2)
SELECT * FROM uvmalumnos WHERE Id > 2;


/*
   ELIMINACIÓN DE REGISTROS (DELETE)
   - DELETE FROM ... WHERE: Borra por completo una fila de la tabla. 
     Nuevamente, el WHERE evita borrar toda la información por accidente.
*/
DELETE FROM uvmalumnos WHERE Id = 5;

SELECT * FROM uvmalumnos;


/*
   EJERCICIO DE LA TAREA: AGREGANDO TUS DATOS
   - Esta sección realiza la secuencia solicitada: insertar nuevos alumnos, 
     consultarlos, actualizarlos y eliminar un registro de prueba.
*/
-- Agregar tus datos y los de 2 compañeros nuevos
INSERT INTO uvmalumnos VALUES (6, 'Angel David', 'Rodríguez González', '2007-03-20', 'Ciudad Nezahualcóyotl');
INSERT INTO uvmalumnos VALUES (7, 'Diego', 'Lozano Flores', '2006-05-15', 'Ciudad de México');
INSERT INTO uvmalumnos VALUES (8, 'Andi', 'Lopez', '2006-08-20', 'Tepoztlán');

-- 1. Mostrar todos los alumnos
SELECT * FROM uvmalumnos;

-- 2. Mostrar únicamente nombres y apellidos
SELECT Firstname, Lastname FROM uvmalumnos;

-- 3. Buscar un alumno por su ID (buscando tus datos)
SELECT * FROM uvmalumnos WHERE Id = 6;

-- 4. Cambiar la dirección de uno de los alumnos
UPDATE uvmalumnos SET Address = 'Autódromo Hermanos Rodríguez' WHERE Id = 7;

-- 5. Eliminar uno de los registros creados por usted
DELETE FROM uvmalumnos WHERE Id = 8;

-- 6. Verificar nuevamente la información almacenada tras los cambios
SELECT * FROM uvmalumnos;


/*
   ELIMINACIÓN DE LA TABLA (DROP)
   - DROP TABLE: Destruye por completo la estructura de la tabla (como tirar
     el archivo a la basura, no solo borrar su contenido). Ideal para limpiar 
     al terminar un ejercicio.
*/
DROP TABLE uvmalumnos;