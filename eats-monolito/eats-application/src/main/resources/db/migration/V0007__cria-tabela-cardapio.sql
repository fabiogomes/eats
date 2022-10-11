CREATE TABLE IF NOT EXISTS `cardapio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `restaurante_id` bigint(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (restaurante_id) REFERENCES `restaurante`(id)
);