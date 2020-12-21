-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 21 déc. 2020 à 16:19
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionustensiles`
--

-- --------------------------------------------------------

--
-- Structure de la table `assiettecarreé`
--

CREATE TABLE `assiettecarreé` (
  `id` int(11) NOT NULL,
  `anneéFabrication` int(11) NOT NULL,
  `cote` double NOT NULL,
  `surface` double NOT NULL,
  `valeur` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `assiettecarreé`
--

INSERT INTO `assiettecarreé` (`id`, `anneéFabrication`, `cote`, `surface`, `valeur`) VALUES
(1, 1983, 9.9, 0, 0),
(2, 1967, 13, 169, 15),
(3, 1956, 10, 100, 70),
(4, 1977, 14, 196, 0),
(5, 1944, 11.9, 141.61, 130);

-- --------------------------------------------------------

--
-- Structure de la table `assietteronde`
--

CREATE TABLE `assietteronde` (
  `id` int(11) NOT NULL,
  `anneéFabrication` int(11) NOT NULL,
  `rayon` double NOT NULL,
  `surface` double NOT NULL,
  `valeur` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `assietteronde`
--

INSERT INTO `assietteronde` (`id`, `anneéFabrication`, `rayon`, `surface`, `valeur`) VALUES
(1, 1960, 5.5, 0, 0),
(2, 1983, 2.9, 0, 0),
(3, 1990, 12, 12, 0),
(4, 1990, 12, 452.16, 0),
(5, 1930, 8.9, 248.71940000000004, 40);

-- --------------------------------------------------------

--
-- Structure de la table `cuillère`
--

CREATE TABLE `cuillère` (
  `id` int(11) NOT NULL,
  `anneéFabrication` int(11) NOT NULL,
  `langure` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `cuillère`
--

INSERT INTO `cuillère` (`id`, `anneéFabrication`, `langure`) VALUES
(1, 1990, 2.4),
(2, 1990, 2.4),
(3, 1993, 5),
(4, 1990, 5),
(5, 2000, 7.3),
(6, 1990, 10.3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `assiettecarreé`
--
ALTER TABLE `assiettecarreé`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `assietteronde`
--
ALTER TABLE `assietteronde`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `cuillère`
--
ALTER TABLE `cuillère`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `assiettecarreé`
--
ALTER TABLE `assiettecarreé`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `assietteronde`
--
ALTER TABLE `assietteronde`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `cuillère`
--
ALTER TABLE `cuillère`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
