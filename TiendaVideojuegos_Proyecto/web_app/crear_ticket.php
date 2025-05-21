<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    echo "Ticket creado por " . $_POST["cliente"] . ": " . $_POST["mensaje"];
}
?>