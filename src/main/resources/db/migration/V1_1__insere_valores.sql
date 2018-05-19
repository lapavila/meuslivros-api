INSERT INTO categoria(id, nome) VALUES(1, 'Programação');
INSERT INTO categoria(id, nome) VALUES(2, 'Infraestrutura');
INSERT INTO categoria(id, nome) VALUES(3, 'Gestão');
INSERT INTO categoria(id, nome) VALUES(4, 'Banco de Dados');

INSERT INTO livro (id, titulo, autor, categoria_id) VALUES (1, 'Use a Cabeça Java - 2.a Edição', 'Kathy Sierra , Bert Bates', 1);
INSERT INTO livro (id, titulo, autor, categoria_id) VALUES (2, 'Introdução a Sistemas de Bancos de Dados', 'C . J. Date', 4);
INSERT INTO livro (id, titulo, autor, categoria_id) VALUES (3, 'Linux a Bíblia.', 'Christopher Negus', 2);
INSERT INTO livro (id, titulo, autor, categoria_id) VALUES (4, 'Clean Code: A Handbook of Agile Software Craftsmanship', 'Robert C. Martin', 1);
INSERT INTO livro (id, titulo, autor, categoria_id) VALUES (5, 'Agile Estimating and Planning', 'Mike Cohn', 3);

INSERT INTO permissao (id, nome) VALUES(1, 'ROLE_CADASTRAR_CATEGORIA');
INSERT INTO permissao (id, nome) VALUES(2, 'ROLE_PESQUISAR_CATEGORIA');
INSERT INTO permissao (id, nome) VALUES(3, 'ROLE_REMOVER_CATEGORIA');

INSERT INTO permissao (id, nome) VALUES(4, 'ROLE_CADASTRAR_LIVRO');
INSERT INTO permissao (id, nome) VALUES(5, 'ROLE_PESQUISAR_LIVRO');
INSERT INTO permissao (id, nome) VALUES(6, 'ROLE_REMOVER_LIVRO');

INSERT INTO usuario (id, nome, username, password) VALUES (1, 'Administrador', 'admin', '$2a$10$QJIU3nc3.1O1USTf4AjHaet3ImYVtW9mzuGeQe98jzGRoN8dUW/Y2');

INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 1);
INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 2);
INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 3);
INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 4);
INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 5);
INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (1, 6);

INSERT INTO usuario (id, nome, username, password) VALUES (2, 'Operador', 'operador', '$2a$04$KUILRnDr5xdCSshYm2wK8uzWRV8Wy8z3K3guPBazv82Af5fRgRfye');

INSERT INTO usuario_permissao(usuario_id, permissao_id) VALUES (2, 5);