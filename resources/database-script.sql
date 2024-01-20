create table cliente (
	id SERIAL PRIMARY KEY,
	nome varchar,
	rg varchar,
	cpf varchar,
	email varchar,
	telefone varchar,
	celular varchar,
	cep varchar,
	endereco varchar,
	numero int,
	complemento varchar,
	bairro varchar,
	cidade varchar,
	uf varchar,
);

create table tb_funcionarios (
	id SERIAL PRIMARY KEY,
	nome varchar,
	rg varchar,
	cpf varchar,
	email varchar,
	telefone varchar,
	celular varchar,
	cep varchar,
	endereco varchar,
	numero int,
	complemento varchar,
	bairro varchar,
	cidade varchar,
	estado varchar,
	cargo varchar,
	senha varchar,
	nivel_acesso varchar
);

