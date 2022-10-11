CREATE TABLE IF NOT EXISTS `categoria_do_cardapio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cardapio_id` bigint(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (cardapio_id) REFERENCES `cardapio`(id)
);