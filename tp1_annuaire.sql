-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : Dim 13 mars 2022 à 14:31
-- Version du serveur :  8.0.21
-- Version de PHP : 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tp1_annuaire`
--
CREATE DATABASE IF NOT EXISTS `tp1_annuaire` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `tp1_annuaire`;

-- --------------------------------------------------------

--
-- Structure de la table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `number` int NOT NULL,
  `street` varchar(255) NOT NULL,
  `idcity` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idcity` (`idcity`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `address`
--

INSERT INTO `address` (`id`, `number`, `street`, `idcity`) VALUES
(1, 10, 'rue de la forêt', 1),
(2, 17, 'rue du port', 2),
(3, 22, 'rue des près', 3),
(4, 17, 'rue de la gare', 2);

-- --------------------------------------------------------

--
-- Structure de la table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE IF NOT EXISTS `city` (
  `id` int NOT NULL AUTO_INCREMENT,
  `postcode` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `city`
--

INSERT INTO `city` (`id`, `postcode`, `name`, `country`) VALUES
(1, 57000, 'Metz', 'France'),
(2, 75000, 'Paris', 'France');

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lastname` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `birthdate` date NOT NULL,
  `phoneNumber` varchar(20) NOT NULL,
  `gender` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `person`
--

INSERT INTO `person` (`id`, `lastname`, `firstname`, `birthdate`, `phoneNumber`, `gender`) VALUES
(1, 'Doe', 'John', '1990-12-12', '0601020304', 'male'),
(2, 'Jane', 'John', '1990-10-01', '0601020305', 'male'),
(3, 'Coilin', 'Marguerite', '1958-08-01', '0678954621', 'female'),
(4, 'Newton', 'Carole', '1978-08-10', '0678954621', 'female'),
(5, 'Newton', 'Isaac', '1974-08-07', '0688954621', 'male');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
