CREATE TABLE categoria (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(200) NOT NULL,
);

CREATE TABLE livro (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  titulo VARCHAR(200) NOT NULL,
  autor VARCHAR(200) NOT NULL,
	categoria_id bigint NOT NULL,
	CONSTRAINT livro_categoria_fk FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);

CREATE TABLE usuario (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(200) NOT NULL,
  username VARCHAR(20) NOT NULL,
  password VARCHAR(200) NOT NULL
);

CREATE TABLE permissao (
	id BIGINT(20) PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	descricao VARCHAR(50)
);

CREATE TABLE usuario_permissao (
	usuario_id BIGINT(20) NOT NULL,
	permissao_id BIGINT(20) NOT NULL,
	CONSTRAINT usuario_permissao_fk FOREIGN KEY (usuario_id) REFERENCES usuario(id),
	CONSTRAINT permissao_usuario_fk FOREIGN KEY (permissao_id) REFERENCES permissao(id)
);