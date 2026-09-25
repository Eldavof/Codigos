CREATE DATABASE universidad;
USE universidad;

Create table uvmalumnos(
 Id int,
 Firstname nvarchar(50),
 Lastname nvarchar(50),
 Birthdate date);
 
 SELECT * FROM uvmalumnos;
 
ALTER TABLE uvmalumnos
ADD Address NVARCHAR(250);

INSERT INTO uvmalumnos
(Id, Firstname, Lastname, Birthdate, Address)
VALUES (1, 'Jim', 'Morrison', '1943-12-08', '2100 Vernon Place');

INSERT INTO uvmalumnos
VALUES (2, 'John', 'Lennon', '1980-12-08', '2450 Moon Palace');

INSERT INTO uvmalumnos
VALUES (3, 'Boy', 'George', '2000-07-01','777 Ermita Avenue');

INSERT INTO uvmalumnos
VALUES (4, 'George', 'Harrison', '2000-07-01', '4850 Tlalpan Avenue');

INSERT INTO uvmalumnos
VALUES (5, 'Veronica', 'Chicone', '2000-07-01', '9876 Rojo Gomez Street');


-- PARTE 5. Actualizar información
SET SQL_SAFE_UPDATES = 0;

UPDATE uvmalumnos
SET Address='Insurgentes Sur 3456' WHERE Id=5;

-- Valida el cambio de la PARTE 5
SELECT * FROM uvmalumnos;

-- PARTE 6. Consultar columnas específicas
SELECT Firstname, Lastname, Address FROM uvmalumnos;

-- PARTE 7. Buscar un registro
SELECT * FROM uvmalumnos WHERE Id = 2;

-- PARTE 8. Consultar varios registros
SELECT * FROM uvmalumnos WHERE Id > 2;

DELETE FROM uvmalumnos WHERE Id=5;

SELECT * FROM uvmalumnos;

-- Agregar tus datos y los de 2 compañeros nuevos
INSERT INTO uvmalumnos VALUES (6, 'Angel David', 'Rodríguez González', '2007-03-20', 'Ciudad Nezahualcóyotl');
INSERT INTO uvmalumnos VALUES (7, 'Diego', 'Martinez', '2006-05-15', 'Ciudad de México');
INSERT INTO uvmalumnos VALUES (8, 'Andi', 'Lopez', '2006-08-20', 'Tepoztlán');

-- 1. Mostrar todos los alumnos
SELECT * FROM uvmalumnos;

-- 2. Mostrar únicamente nombres y apellidos
SELECT Firstname, Lastname FROM uvmalumnos;

-- 3. Buscar un alumno por su ID (buscando tus datos)
SELECT * FROM uvmalumnos WHERE Id = 6;

-- 4. Cambiar la dirección de uno de los alumnos
UPDATE uvmalumnos SET Address='Autódromo Hermanos Rodríguez' WHERE Id=7;

-- 5. Eliminar uno de los registros creados por usted
DELETE FROM uvmalumnos WHERE Id=8;

-- 6. Verificar nuevamente la información almacenada
SELECT * FROM uvmalumnos;

DROP TABLE uvmalumnos;