# 💱 Conversor de Monedas en Java

Aplicación de consola desarrollada en **Java 17** que permite convertir valores entre distintas monedas utilizando datos en tiempo real obtenidos desde la **ExchangeRate API**.

---

## 📌 Funcionalidades

- Menú interactivo en consola
- Conversión entre:
    - USD ⇄ ARS
    - USD ⇄ BRL
    - USD ⇄ COP
- Consumo de API REST externa
- Validación de entradas del usuario
- Uso de `record` para modelar respuestas JSON
- Manejo de errores básicos

---

## 🛠️ Tecnologías utilizadas

- **Java 17**
- **HttpClient (java.net.http)**
- **Gson** para deserialización JSON
- **ExchangeRate API**

---

## 🌐 API utilizada

Los datos de conversión se obtienen desde:

👉 https://app.exchangerate-api.com/
