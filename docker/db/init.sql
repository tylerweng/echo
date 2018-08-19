CREATE DATABASE IF NOT EXISTS `main`;
USE `main`;
CREATE TABLE IF NOT EXISTS `pets` (
    `name` VARCHAR(20),
    `owner` VARCHAR(20),
    `species` VARCHAR(20),
    `sex` CHAR(1),
    `birth` DATE,
    `death` DATE
);