CREATE DATABASE `target` ;

USE `target`;

CREATE TABLE `accounts` (
  `username` VARCHAR(20) NOT NULL COMMENT '',
  `password` VARCHAR(45) NULL COMMENT '',
  `email` VARCHAR(45) NULL COMMENT '',
  `zip_code` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`username`)  COMMENT '');
  
