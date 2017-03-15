-- MySQL Script generated by MySQL Workbench
-- Thu Mar 16 00:14:46 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema univesity
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema univesity
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `univesity` DEFAULT CHARACTER SET latin1 ;
USE `univesity` ;

-- -----------------------------------------------------
-- Table `univesity`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `univesity`.`course` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `teacher` VARCHAR(45) NULL DEFAULT NULL,
  `studyYear` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `univesity`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `univesity`.`student` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `birthdate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `univesity`.`enrollment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `univesity`.`enrollment` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `idStudent` INT(11) NOT NULL,
  `idCourse` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idStudent_idx` (`idStudent` ASC),
  INDEX `idCourse_idx` (`idCourse` ASC),
  CONSTRAINT `idCourse`
    FOREIGN KEY (`idCourse`)
    REFERENCES `univesity`.`course` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idStudent`
    FOREIGN KEY (`idStudent`)
    REFERENCES `univesity`.`student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;