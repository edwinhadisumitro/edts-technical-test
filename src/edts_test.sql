CREATE SCHEMA `edts_test` ;

CREATE TABLE `edts_test`.`employee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL,
  `salary` BIGINT NULL,
  `grade` INT NULL,
  PRIMARY KEY (`id`));
