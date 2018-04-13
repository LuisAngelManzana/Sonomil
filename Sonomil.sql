-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Apr 13, 2018 at 09:54 AM
-- Server version: 5.6.38
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `Sonomil`
--

-- --------------------------------------------------------

--
-- Table structure for table `Cliente`
--

CREATE TABLE `Cliente` (
  `id_Cliente` varchar(10) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Domicilio` varchar(200) NOT NULL,
  `Telefono` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Contrato`
--

CREATE TABLE `Contrato` (
  `id_Contrato` varchar(10) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` datetime NOT NULL,
  `Lugar` varchar(200) NOT NULL,
  `Duracion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Equipo`
--

CREATE TABLE `Equipo` (
  `id_Equipo` varchar(10) NOT NULL,
  `Nombre_Equipo` varchar(30) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Num_Existencia` int(5) NOT NULL,
  `Tipo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`id_Cliente`);

--
-- Indexes for table `Contrato`
--
ALTER TABLE `Contrato`
  ADD PRIMARY KEY (`id_Contrato`);

--
-- Indexes for table `Equipo`
--
ALTER TABLE `Equipo`
  ADD PRIMARY KEY (`id_Equipo`);