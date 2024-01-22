# ANM - CRUD [![NPM](https://img.shields.io/npm/l/react)](https://github.com/HenriqueSenaDev/anm-crud/blob/master/LICENSE) 
![Java](https://img.shields.io/badge/Java-CA4245?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

Aplicação desktop construída a partir da linguagem Java e sua biblioteca de renderização gráfica Swing.
Oferece operações CRUD (create, read, update, delete) para clientes e funcionários com campos de entrada de diferentes tipos. Cada entidade tem seu próprio painel, executado separadamente.
Projeto acadêmico da EEEP Alfredo Nunes de Melo - Acopiara, CE.

Persistência no Banco de Dados PostgreSQL. O projeto pode facilmente optar por outro banco de dados adicionando um driver **JDBC** alternativo nas pasta libs.

## Tecnologias
- Java +17
- Swing
- Data Access Object pattern (DAO)
- PostgreSQL
- Ferramenta de build Apache Ant +10

## Layout
![Form](https://github.com/HenriqueSenaDev/assets/blob/main/anm-crud/form.png)
![List](https://github.com/HenriqueSenaDev/assets/blob/main/anm-crud/list.png)

## Execute o projeto
**Requisitos:**
- JDK LTS +17
- Executar o database-script.sql na pasta **resources** para criar as tabelas do banco de dados
- Variáveis de Ambiente:
    - DB_USER (usuário do banco de dados),
    - DB_PASS (senha do banco de dados),
    - DB_URL (url do banco de dados).

[Baixe o Jar](https://github.com/HenriqueSenaDev/assets/blob/main/anm-crud/anm-crud-20240119.jar)

Ou clone o projeto (necessário Apache Ant +10):

```bash
git clone https://github.com/HenriqueSenaDev/anm-crud.git
cd anm-crud
# cria um jar na pasta dist/lib
ant
```

E execute o Jar em seu diretório:
```bash
# painel de clientes
java -jar anm-crud-[timestamp].jar
# painel de funcionários
java -cp amn-crud-[timestamp].jar br.com.ferias.view.frmFuncionarios
```
