DROP DATABASE IF EXISTS exemplo_banco_dados_01;
CREATE DATABASE IF NOT EXISTS exemplo_banco_dados_01;

USE exemplo_banco_dados_01;

/*
  private String id, nome, data, cpf;
    privaetr boolean ativo;
*/

CREATE TABLE clientes(
    id                 INT AUTO_INCREMENT PRIMARY KEY,
    nome               VARCHAR(100) NOT NULL,
    data_nascimento    DATE,
    cpf                VARCHAR(11),
    ativo              BOOLEAN DEFAULT true
);
