# Cadastro de Pessoas

Este projeto é uma aplicação web simples para cadastro de pessoas, utilizando **Spring Boot** com **Thymeleaf** para renderização de páginas HTML.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Thymeleaf**
- **H2 Database (banco de dados em memória)**
- **Bootstrap 5**
- **jQuery + Inputmask** (para formatação de telefone)

## 📌 Funcionalidades
- Criar, listar, editar e excluir pessoas
- Validação dos campos no backend
- Máscara automática para o campo de telefone
- Estilização com Bootstrap

## 🎯 Como Executar o Projeto
1. **Clone o repositório**
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```
2. **Configure o projeto no IntelliJ ou Eclipse**
3. **Execute a aplicação**
   ```sh
   mvn spring-boot:run
   ```
4. **Acesse no navegador:**
   ```sh
   http://localhost:8080/pessoas
   ```

## 🛠 Estrutura do Projeto
```
📂 src/main/java/com/seuapp
 ├── 📂 controller   # Controladores da aplicação
 ├── 📂 model        # Classes de modelo
 ├── 📂 repository   # Interfaces de repositório
 ├── 📂 service      # Regras de negócio
 ├── 📂 resources
 │   ├── 📂 templates   # Páginas Thymeleaf (HTML)
 │   ├── 📂 static      # Arquivos CSS e JS
 │   ├── application.properties # Configurações do projeto
```

## 📄 Licença
Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e melhorá-lo! 🚀

