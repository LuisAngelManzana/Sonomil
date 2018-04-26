-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 26, 2018 at 01:44 AM
-- Server version: 5.6.38-log
-- PHP Version: 7.2.1

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

--
-- Dumping data for table `Cliente`
--

INSERT INTO `Cliente` (`id_Cliente`, `Nombre`, `Domicilio`, `Telefono`) VALUES
('003', 'Manuel Ramiro', 'Nieves', '4981231234'),
('1', 'Luis', 'Negrete 2', '4981160120'),
('2', 'Manuel Ramiro Cowgirl', 'Leandro Valle #19B', '4981040368');

-- --------------------------------------------------------

--
-- Table structure for table `Contrato`
--

CREATE TABLE `Contrato` (
  `id_Contrato` varchar(10) NOT NULL,
  `Fecha` varchar(50) NOT NULL,
  `Hora` varchar(10) NOT NULL,
  `Lugar` varchar(200) NOT NULL,
  `Duracion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Contrato`
--

INSERT INTO `Contrato` (`id_Contrato`, `Fecha`, `Hora`, `Lugar`, `Duracion`) VALUES
('0001', 'Thu Apr 26 09:33:14 CDT 2018', '8', 'Plaza Civica', '5');

-- --------------------------------------------------------

--
-- Table structure for table `Equipo`
--

CREATE TABLE `Equipo` (
  `id_Equipo` varchar(10) NOT NULL,
  `Nombre_Equipo` varchar(30) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Num_Existencia` int(5) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Precio` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Equipo`
--

INSERT INTO `Equipo` (`id_Equipo`, `Nombre_Equipo`, `Descripcion`, `Num_Existencia`, `Tipo`, `Precio`) VALUES
('00001', 'Medios Exterior', 'Medios para eventos en el exterior', 36, 'Audio', 0),
('00002', '', 'Bajos para eventos en el exterior', 0, 'Audio', 0),
('00003', 'Monitor Audio', 'Monitores para los musicos', 14, 'Audio', 0),
('00004', 'Monitor Bajo', 'Bajos de Monitor', 8, 'Audio', 0),
('00005', 'Microfono Voz', 'Microfonos de Voz', 35, 'Audio', 0),
('00006', 'Microfono Bateria', 'Set de microfonos para bateria', 4, 'Audio', 0),
('00007', 'Cables XLR 1', 'Cables XLR de 1 metro', 50, 'Audio', 0),
('00008', 'Cables XLR 3', 'Cables XLR de 3 metros', 50, 'Audio', 0),
('00009', 'Cables XLR 5', 'Cables XLR de 5 metros', 50, 'Audio', 0),
('00010', 'Cables XLR 10', 'Cables XLR de 10 metros', 50, 'Audio', 0),
('00011', 'XLR a TRS', 'Cables XLR a TRS para instrumentos', 50, 'Audio', 0),
('00012', 'Speakon Bajo', 'Cables para los bajos', 50, 'Audio', 0),
('00013', 'Speakon Medios', 'Cables para los medios', 70, 'Audio', 0),
('00014', 'Medusa', 'Medusa de 32 canales', 4, 'Audio', 0),
('00015', 'Medusa Chica', 'Medusa de 24 canales', 2, 'Audio', 0),
('00016', 'Microfono Inalambrico', 'Microfono SHURE inalambrico 80m', 15, 'Audio', 0),
('00017', 'Estructura Gigante', 'Escenario de 30x80x20M', 1, 'Audio', 0),
('00018', 'Estructura Grande', 'Escenario de 25x50x20M', 1, 'Audio', 0),
('00019', 'Estructura Mediana', 'Escenario de 20x30x15M', 1, 'Audio', 0),
('00020', 'Estructura Chica', 'Escenario de 15x20x10M', 1, 'Audio', 0);

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