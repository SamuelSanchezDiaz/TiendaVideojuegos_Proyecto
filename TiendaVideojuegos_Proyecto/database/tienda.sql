CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    contraseña VARCHAR(50),
    rol ENUM('admin', 'empleado', 'cliente')
);

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    stock INT,
    precio DECIMAL(6,2)
);

CREATE TABLE tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(100),
    mensaje TEXT,
    estado ENUM('abierto', 'en_proceso', 'cerrado')
);