<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $cliente = trim($_POST["cliente"]);
    $mensaje = trim($_POST["mensaje"]);

    if (empty($cliente) || empty($mensaje)) {
        echo "Error: Todos los campos son obligatorios.";
    } else {
        echo "Ticket creado correctamente.<br>";
        echo "Cliente: " . htmlspecialchars($cliente) . "<br>";
        echo "Mensaje: " . htmlspecialchars($mensaje);
    }
} else {
    echo "Acceso no permitido.";
}
?>
