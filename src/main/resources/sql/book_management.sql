DROP DATABASE IF EXISTS `book_management`;
CREATE DATABASE `book_management DEFAULT` CHARACTER SET utf8;

USE `book_management`;

CREATE TABLE `t_user`(
	`pk_id` INT UNSIGNED AUTO_INCREMENT COMMENT '序号',
	`uk_username` VARCHAR(30) UNIQUE COMMENT '用户名',
	`shadow` VARCHAR(40) COMMENT '密码md5',
	`flag` TINYINT UNSIGNED DEFAULT 0 COMMENT '是否为管理员',
	PRIMARY KEY(`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_book`(
	`pk_id` INT UNSIGNED AUTO_INCREMENT COMMENT '书本序号',
	`uk_isbn` VARCHAR(50) UNIQUE COMMENT '书ISBN',
	`title` VARCHAR(30) NOT NULL COMMENT '书名',
	`publication_house` VARCHAR(30) COMMENT '出版社',
	`publication_date` DATETIME COMMENT '出版时间',
	`price` DECIMAL(6, 2) COMMENT '价格',
	`introduction` TEXT COMMENT '简略介绍',
	`status` INT UNSIGNED DEFAULT 0  COMMENT '状态',
	PRIMARY KEY(`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

