-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 02 avr. 2021 à 14:47
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `crajeefinal`
--

-- --------------------------------------------------------

--
-- Structure de la table `collaborateur`
--

DROP TABLE IF EXISTS `collaborateur`;
CREATE TABLE IF NOT EXISTS `collaborateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(300) COLLATE utf8_bin NOT NULL,
  `mail` varchar(300) COLLATE utf8_bin NOT NULL,
  `mdp` varchar(300) COLLATE utf8_bin NOT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `collaborateur`
--

INSERT INTO `collaborateur` (`id`, `nom`, `mail`, `mdp`, `type`) VALUES
(1, 'SHAKIBAEI', 'Mohashakibaei@outlook.fr', 'mdp', 0),
(2, 'MOBINI', 'sshakibaei@outlook.fr', 'mdp', 1),
(3, 'shakibaei', 'mohashakibaei', 'pdp', 0),
(4, 'test', 'test', 'test', 0),
(6, 'pk', 'pk', 'pk', 0);

-- --------------------------------------------------------

--
-- Structure de la table `notedefrais`
--

DROP TABLE IF EXISTS `notedefrais`;
CREATE TABLE IF NOT EXISTS `notedefrais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `raison` varchar(300) COLLATE utf8_bin NOT NULL,
  `prix` double NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `notedefrais`
--

INSERT INTO `notedefrais` (`id`, `raison`, `prix`, `date`) VALUES
(1, 'deplacement', 55.5, '2021-04-13');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
