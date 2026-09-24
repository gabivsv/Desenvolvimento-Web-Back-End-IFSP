# 💻 Desenvolvimento Web Back-End — IFSP

Repositório acadêmico desenvolvido durante a disciplina de **Desenvolvimento Web Back-End** do IFSP.

O projeto reúne exercícios e aplicações desenvolvidas com **Java, Spring Boot, API REST, GraphQL, JPA e Maven**, explorando conceitos de desenvolvimento de aplicações back-end.

> ⚠️ **Nota:** os projetos possuem finalidade educacional e não foram desenvolvidos com foco em produção. Aspectos como autenticação, autorização, persistência e segurança podem exigir ajustes antes de um uso real.

---

## 🚀 Projetos

### 📝 IFgram — API REST

Aplicação desenvolvida com **Spring Boot**, simulando uma API para gerenciamento de postagens.

**Principais operações:**

`GET /postagens` · `POST /postagens` · `GET /postagens/{id}` · `PUT /postagens/{id}` · `DELETE /postagens/{id}`

**Tecnologias:**

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2
- Maven

### 🌌 Star Wars — API GraphQL

API desenvolvida com **Spring for GraphQL**, utilizando entidades inspiradas no universo de Star Wars.

**Consultas disponíveis:**

`humans` · `droids` · `starships` · `character(id)` · `heroes`

**Mutações disponíveis:**

`createHuman` · `createDroid` · `createStarship` · `addFriend`

**Endpoint local:**

```text
http://localhost:8080/graphql
```

**Tecnologias:**

- Java 17
- Spring Boot
- Spring Web
- Spring for GraphQL
- Lombok
- JUnit e Spring Boot Test
- Maven

---

## 🧠 Tecnologias e conceitos

| Tecnologia | Aplicação |
|---|---|
| ☕ **Java** | Desenvolvimento back-end |
| 🌱 **Spring Boot** | Estrutura das aplicações |
| 🔗 **REST** | Desenvolvimento de APIs |
| ◈ **GraphQL** | Consultas e mutações |
| 🗄️ **JPA / H2** | Persistência e banco de dados no IFgram |
| 📦 **Maven** | Gerenciamento de dependências e build |
| 🧪 **JUnit** | Testes automatizados |
| 🐙 **Git** | Controle de versão |

---

## ▶️ Como executar

### IFgram

```bash
cd "Aula 3/ex2ifgram-api"
mvn spring-boot:run
```

A API ficará disponível em:

```text
http://localhost:8080/postagens
```

### Star Wars — GraphQL

No Linux ou macOS:

```bash
cd Projeto-StarWars/graphql_spring
./mvnw spring-boot:run
```

No Windows:

```powershell
cd Projeto-StarWars\graphql_spring
mvnw.cmd spring-boot:run
```

O endpoint GraphQL ficará disponível em:

```text
http://localhost:8080/graphql
```

> Os dois projetos utilizam a porta `8080` por padrão. Execute apenas um projeto por vez ou altere a porta de uma das aplicações no arquivo `application.properties`.

---

## 📁 Estrutura do projeto

```text
DESENVOLVIMENTO-WEB-BACK-END-IFSP/
├── Aula 3/
│   ├── Exercicio1_IFgram.pdf
│   └── ex2ifgram-api/
│       ├── pom.xml
│       └── src/
├── Projeto-StarWars/
│   └── graphql_spring/
│       ├── pom.xml
│       ├── src/
│       ├── mvnw
│       └── mvnw.cmd
├── Thread_Group_Analise.pdf
└── README.md
```

## 🎓 Contexto acadêmico

Este repositório foi desenvolvido como parte das atividades da disciplina de **Desenvolvimento Web Back-End** do curso de **Análise e Desenvolvimento de Sistemas do IFSP**.

