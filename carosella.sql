DROP DATABASE IF EXISTS Restaurante; 

CREATE DATABASE Restaurante; 

USE Restaurante; 

-- Tabela de Clientes
CREATE TABLE IF NOT EXISTS Clientes( 
	ID_cliente int(100) AUTO_INCREMENT, 
	CPF varchar(11) not null not null, 
	Nome_cliente varchar(255) not null,
	Data_nascimento varchar(15) not null,
    Bairro varchar (255) not null,
	Endereco varchar(255) not null, 
    Complemento varchar(255),
	Email_cliente varchar(255) not null, 
	Telefone varchar(12) not null,
	Data_cadastro datetime not null, 
    Estado varchar (2) not null,
    CEP varchar (9) not null,
    password varchar (255) not null,
	PRIMARY KEY (ID_cliente, Email_cliente) 
);

-- Tabela de Filiais
CREATE TABLE IF NOT EXISTS Filiais( 
	ID_filial int(3) AUTO_INCREMENT, 
	Endereco varchar(255), 
	Email varchar(255), 
	Telefone varchar(12), 
	Quant_mesas int(45), 
	PRIMARY KEY (ID_filial) 
);

-- Tabela de Funcionários
CREATE TABLE IF NOT EXISTS Funcionarios( 
	ID_func int(100) AUTO_INCREMENT, 
	CPF varchar(11) NOT NULL, 
	Nome_funcionario varchar(255),
	Data_nascimento varchar(15),
	Endereco varchar(255), 
	Email varchar(255), 
	Telefone varchar(12), 
	ID_filial int(15),
    Estado varchar(2),
    CEP varchar(9),
	Cargo varchar(255),
	Data_contatacao datetime,
	password varchar(255) NOT NULL,
	PRIMARY KEY (ID_func),
	FOREIGN KEY (ID_filial) REFERENCES Filiais(ID_filial)
);

-- Tabela de Reservas
CREATE TABLE IF NOT EXISTS Reservas(
	ID_reserva int(100) AUTO_INCREMENT not null,
	Data_reserva datetime, 
	ID_cliente int(100), 
	Mesa varchar(11),
	ID_filial int(20),
    Quant_Pessoas varchar(2),
	Capacidade varchar(10),
	PRIMARY KEY (ID_reserva),
	FOREIGN KEY (ID_cliente) REFERENCES Clientes (ID_cliente),
	FOREIGN KEY (ID_filial) REFERENCES Filiais(ID_filial)
); 

-- Tabela de Fornecedores
CREATE TABLE IF NOT EXISTS Fornecedores(
	Nome_fornecedor varchar(255),
	Email varchar (155),
	ID_fornecedor int(5) AUTO_INCREMENT, 
	CNPJ varchar(14),
	Tipo_material varchar(255),
	Telefone varchar(12), 
	Valor_material decimal(8,2), 
	PRIMARY KEY (ID_fornecedor) 
); 

-- Tabela de Estoque
CREATE TABLE IF NOT EXISTS Estoque( 
	ID_fornecedor int(5), 
	ID_materia int(6) AUTO_INCREMENT, 
	Quantidade int(5),
	ID_filial int(3),
	PRIMARY KEY (ID_materia), 
	FOREIGN KEY (ID_fornecedor) REFERENCES Fornecedores (ID_fornecedor),
	FOREIGN KEY (ID_filial) REFERENCES Filiais(ID_filial)
);  

-- Tabela de Pratos
CREATE TABLE IF NOT EXISTS Pratos( 
	ID_prato int(2) AUTO_INCREMENT,
	Nome varchar(255),
	Descricao varchar(255),
	Valor decimal(5,2),
	PRIMARY KEY (ID_prato) 
); 

-- Tabela de Ingredientes
CREATE TABLE IF NOT EXISTS Ingredientes(
	ID_ingrediente int(3) AUTO_INCREMENT,
	Nome varchar(255),
	Unidade_medida Varchar(255),
	ID_prato int(3),
	PRIMARY KEY (ID_ingrediente),
	FOREIGN KEY (ID_prato) REFERENCES Pratos(ID_prato)
);

-- Tabela de Pedidos
CREATE TABLE IF NOT EXISTS Pedidos( 
	ID_pedido int(8) AUTO_INCREMENT, 
	ID_cliente int(8), 
	ID_prato int(2), 
	ID_bebida int(3), 
	Valor decimal(4,2),
	Tipo_pagamento varchar(255),
	Endereco varchar(255),
	Data_pedido datetime,
	PRIMARY KEY (ID_pedido), 
	FOREIGN KEY (ID_cliente) REFERENCES Clientes(ID_cliente), 
	FOREIGN KEY (ID_prato) REFERENCES Pratos (ID_prato)
); 

-- Tabela de Entregas
CREATE TABLE IF NOT EXISTS Entregas( 
	ID_entrega int(5) AUTO_INCREMENT,
	Endereco varchar(255),
	ID_pedido int(8),
	Data_entrega datetime,
	PRIMARY KEY (ID_entrega), 
	FOREIGN KEY (ID_pedido) REFERENCES Pedidos (ID_pedido) 
); 

-- Tabela de Logins
CREATE TABLE IF NOT EXISTS Logins(
   ID_login int(8) AUTO_INCREMENT,
   ID_cliente int(8),
   Email_cliente varchar(255) not null,
   Username varchar(255) not null,
   Password varchar(255) not null,
   PRIMARY KEY (ID_login),
   FOREIGN KEY (ID_cliente, Email_cliente) REFERENCES Clientes(ID_cliente, Email_cliente)
   );

-- Inserir dados na tabela Clientes
INSERT INTO Clientes (CPF, Nome_cliente, Data_nascimento, Endereco, Bairro, Complemento, Email_cliente, Telefone, Data_cadastro, Estado, CEP, password) VALUES 
('12345678901', 'Maria Silva', '10/07/1981', 'Rua A, 123', 'Centro', '','maria.silva@gmail.com', '9876543210', '2023-01-01 10:00:00', 'SP', '01001000', 'senha123'),
('23456789012', 'João Souza', '30/02/1999', 'Rua B, 456', 'Jardim das Flores', 'Apartamento 302','joao.souza@gmail.com', '9876543211', '2023-01-02 11:00:00', 'RJ', '20040030', 'senha1234'),
('34567890123', 'Ana Pereira', '22/08/2001', 'Rua C, 789', 'Vila Nova', 'Bloco B, Casa 5', 'ana.pereira@gmail.com', '9876543212', '2023-01-03 12:00:00', 'MG', '30140071', 'senha1235'),
('45678901234', 'Carlos Santos', '28/05/1974', 'Rua D, 101', 'Alto da Colina', '', 'carlos.santos@gmail.com', '9876543213', '2023-01-04 13:00:00', 'MG', '40010000', 'senha1236'),
('56789012345', 'Julia Oliveira', '26/01/1998', 'Rua E, 202', 'Parque dos Sonhos', 'Cobertura 15', 'julia.oliveira@gmail.com', '9876543214', '2023-01-05 14:00:00', 'SP', '66010000', 'senha123');


-- Inserir dados na tabela Filiais
INSERT INTO Filiais (Endereco, Email, Telefone, Quant_mesas) VALUES 
('Avenida Principal, 100', 'filial1@restaurante.com', '3216549870', '25'),
('Rua das Flores, 200', 'filial2@restaurante.com', '3216549871', '30'),
('Avenida Brasil, 300', 'filial3@restaurante.com', '3216549872', '40'),
('Rua das Árvores, 400', 'filial4@restaurante.com', '3216549873', '25'),
('Avenida Central, 500', 'filial5@restaurante.com', '3216549874', '40'),
('Rua do Comércio, 600', 'filial6@restaurante.com', '3216549875', '35'),
('Praça da Liberdade, 700', 'filial7@restaurante.com', '3216549876', '50'),
('Avenida da Paz, 800', 'filial8@restaurante.com', '3216549877', '20'),
('Rua do Sol, 900', 'filial9@restaurante.com', '3216549878', '30'),
('Avenida do Futuro, 1000', 'filial10@restaurante.com', '3216549879', '45'),
('Rua dos Ventos, 1100', 'filial11@restaurante.com', '3216549880', '25');


-- Inserir dados na tabela Funcionarios
INSERT INTO Funcionarios (CPF, Nome_funcionario, Data_nascimento, Endereco, Email, Telefone, ID_filial, Cargo, Data_contatacao, CEP, Estado, password) VALUES 
('09876543210', 'Fernando Gonçalves', '30/03/2001', 'Rua P, 404', 'fernando.goncalves@restaurante.com', '9876543215', 1, 'Garçom', '2023-02-01 10:00:00', '40440000', 'BA', 'senha1'),
('98765432109', 'Bianca Ferreira', '28/06/1981', 'Rua Q, 505', 'bianca.ferreira@restaurante.com', '9876543216', 2, 'Cozinheira', '2023-02-02 11:00:00', '50550000', 'SP', 'senha2'),
('87654321098', 'Lucas Barbosa', '20/10/2000', 'Rua R, 606', 'lucas.barbosa@restaurante.com', '9876543217', 3, 'Gerente', '2023-02-03 12:00:00', '60660000', 'RJ', 'senha3'),
('76543210987', 'Carla Lima', '01/04/1976', 'Rua S, 707', 'carla.lima@restaurante.com', '9876543218', 4, 'Atendente', '2023-02-04 13:00:00', '70770000', 'MG', 'senha4'),
('65432109876', 'Marcos Silva', '05/09/1992', 'Rua T, 808', 'marcos.silva@restaurante.com', '9876543219', 5, 'Chef de Cozinha', '2023-02-05 14:00:00', '80880000', 'PR', 'senha5'),
('54321098765', 'Renata Souza', '26/11/1981', 'Rua U, 909', 'renata.souza@restaurante.com', '9876543220', 6, 'Garçonete', '2023-02-06 15:00:00', '90990000', 'RS', 'senha6'),
('43210987654', 'João Vieira', '29/11/1989', 'Rua V, 101', 'joao.vieira@restaurante.com', '9876543221', 7, 'Auxiliar de Cozinha', '2023-02-07 16:00:00', '10101000', 'BA', 'senha7'),
('32109876543', 'Mariana Araújo', '25/10/2000', 'Rua W, 202', 'mariana.araujo@restaurante.com', '9876543222', 8, 'Recepcionista', '2023-02-08 17:00:00', '20202000', 'SP', 'senha8'),
('21098765432', 'Rafael Carvalho', '31/01/1995', 'Rua X, 303', 'rafael.carvalho@restaurante.com', '9876543223', 9, 'Gerente de Filial', '2023-02-09 18:00:00', '30303000', 'RJ', 'senha9'),
('10987654321', 'Patrícia Nunes', '03/03/1993', 'Rua Y, 404', 'patricia.nunes@restaurante.com', '9876543224', 10, 'Cozinheira', '2023-02-10 19:00:00', '40404000', 'MG', 'senha10'),
('09876543211', 'Ricardo Silva', '30/11/2003', 'Rua Z, 505', 'ricardo.silva@restaurante.com', '9876543225', 11, 'Garçom', '2023-02-11 20:00:00', '50505000', 'PR', 'senha11');




-- Inserir dados na tabela Reservas
INSERT INTO Reservas (Data_reserva, ID_cliente, Quant_Pessoas, Mesa, ID_filial, Capacidade) VALUES 
('2023-03-01 19:00:00', 1,'2', 'A1', 1, '3'),
('2023-03-02 20:00:00', 2,'1','B2', 2, '5'),
('2023-03-03 18:00:00', 3,'2', 'C3', 3, '1'),
('2023-03-04 21:00:00', 4,'3', 'D4', 4, '4'),
('2023-03-06 20:30:00', 5,'4', 'F6', 6, '2');


-- Inserir dados na tabela Fornecedores
INSERT INTO Fornecedores (Nome_fornecedor, CNPJ, Tipo_material, Email, Telefone, Valor_material) VALUES 
('Fornecedor A', '12345678000101', 'Legumes', 'fornecedora@gmail.com', '3216549870', 500.00),
('Fornecedor B', '23456789000112', 'Carnes', 'fornecedorb@gmail.com', '3216549871', 800.00),
('Fornecedor C', '34567890000123', 'Bebidas', 'fornecedorc@gmail.com', '3216549872', 300.00),
('Fornecedor D', '45678901000134', 'Laticínios', 'fornecedord@gmail.com', '3216549873', 400.00),
('Fornecedor E', '67890123000156', 'Especiarias', 'fornecedore@gmail.com', '3216549875', 150.00),
('Fornecedor F', '89012345000178', 'Massas', 'fornecedorf@gmail.com', '3216549877', 350.00),
('Fornecedor G', '90123456000189', 'Frutas', 'fornecedorg@gmail.com', '3216549878', 600.00),
('Fornecedor H', '01234567000190', 'Pães', 'fornecedorh@gmail.com', '3216549879', 250.00),
('Fornecedor I', '12345678000191', 'Bebidas', 'fornecedori@gmail.com', '3216549880', 700.00),
('Fornecedor J', '23456789000192', 'Condimentos', 'fornecedorj@gmail.com', '3216549881', 450.00),
('Fornecedor K', '34567890000193', 'Carnes', 'fornecedork@gmail.com', '3216549882', 200.00);

-- Inserir dados na tabela Estoque
INSERT INTO Estoque (ID_fornecedor, Quantidade, ID_filial) VALUES 
(1, 100, 1),
(2, 50, 2),
(3, 200, 3),
(4, 150, 4),
(5, 80, 5),
(6, 60, 6),
(7, 120, 7),
(8, 90, 8),
(9, 110, 9),
(10, 70, 10),
(11, 130, 11);

-- Inserir dados na tabela Pratos
INSERT INTO Pratos (Nome, Descricao, Valor) VALUES 
('Tagliatelle ao sugo', 'Spaghetti com molho de tomate', 25.90),
('Ravioli com camarões', 'Massa com camarões', 64.50),
('Macarrão Carbonara', 'Macarrão com molho à base de ovos e bacon', 78.90),
('Popetonni', 'Filé de salmão grelhado com ervas', 30.90),
('Lasanha de Carne', 'Massa de lasanha, molho de tomate e frios e carne', 54.90);

-- Inserir dados na tabela Ingredientes
INSERT INTO Ingredientes (Nome, Unidade_medida, ID_prato) VALUES 
('Tomate', 'Kg', 1),
('Camarão', 'Kg', 1),
('Carne Bovina', 'Kg', 1),
('Peixe', 'Kg', 2),
('Farinha', 'Kg', 2),
('Picanha', 'Kg', 2),
('Camarão', 'Kg', 3),
('Molho de Tomate', 'L', 5),
('Laranja', 'Unidade', 4),
('Água', 'L', 3),
('Leite', 'L', 4),
('Ovos', 'g', 2),
('Limão', 'Unidade', 5);

-- Inserir dados na tabela Pedidos
INSERT INTO Pedidos (ID_cliente, ID_prato, ID_bebida, Valor, Tipo_pagamento, Endereco, Data_pedido) VALUES 
(1, 1, 1, 30.90, 'Cartão de Crédito', 'Rua A, 123', '2023-04-01 19:00:00'),
(2, 2, 2, 29.50, 'Dinheiro', 'Rua B, 456', '2023-04-02 20:00:00'),
(3, 3, 3, 23.00, 'Cartão de Débito', 'Rua C, 789', '2023-04-03 18:00:00');

-- Inserir dados na tabela Entregas
INSERT INTO Entregas (Endereco, ID_pedido, Data_entrega) VALUES 
('Rua A, 123', 1, '2023-05-01 20:00:00'),
('Rua B, 456', 2, '2023-05-02 21:00:00'),
('Rua C, 789', 3, '2023-05-03 19:00:00');

-- Inserir dados na tabela Logins
INSERT INTO Logins (ID_cliente, Username, Password, Email_cliente) VALUES
(1, 'maria.silva', 'senha123','maria.silva@gmail.com'),
(2, 'joao.souza', 'senha1234', 'joao.souza@gmail.com'),
(3, 'ana.pereira', 'senha1235', 'ana.pereira@gmail.com'),
(4, 'carlos.santos', 'senha1236', 'carlos.santos@gmail.com'),
(5, 'julia.oloveira', 'senha1237', 'julia.oliveira@gmail.com');

select * from clientes;
select * from filiais;
select * from funcionarios;
select * from reservas;
select * from fornecedores;
select * from estoque;
select * from pratos ;
select * from ingredientes;
select * from pedidos;
select * from entregas;
select * from logins;

