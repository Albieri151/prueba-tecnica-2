# Prueba Tecnica 2

# API de Autenticación con Spring Boot y DummyJSON

## 📋 Requisitos del sistema

- **Java 21** (Requisito obligatorio)
- **PostgreSQL 15+** (Instalado localmente)
- **Maven 3.9+** (Gestor de dependencias)

## 🚀 Instalación y ejecución

### 1. Clonar el repositorio
```bash
git clone git clone https://github.com/Albieri151/prueba-tecnica-2.git
```


### 2. Agrega/modifica las siguientes propiedades del archivo .properties dentro del proyecto:

```properties
# Configuración básica de PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/su_base_de_datos
spring.datasource.username=su_usuario
spring.datasource.password=su_contraseña
```
### 3. Correr el proyecto
Posteriormente a desplegar el proyecto en local, debe abrir la documentacion del swagger

```bash
http://localhost:8080/solver/swagger-ui/index.html#/
