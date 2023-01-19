-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-01-2023 a las 04:30:56
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sofftek`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

DROP TABLE IF EXISTS `estado`;
CREATE TABLE IF NOT EXISTS `estado` (
  `idestado` int(11) NOT NULL,
  `nombreEstado` varchar(45) NOT NULL,
  PRIMARY KEY (`idestado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`idestado`, `nombreEstado`) VALUES
(1, 'activo'),
(2, 'inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operaciones`
--

DROP TABLE IF EXISTS `operaciones`;
CREATE TABLE IF NOT EXISTS `operaciones` (
  `identificacionConducto` int(11) NOT NULL,
  `nombreConducto` varchar(45) NOT NULL,
  `placaVehiculo` varchar(45) NOT NULL,
  `marcaVehiculo` varchar(45) DEFAULT NULL,
  `modeloVehiculo` varchar(45) DEFAULT NULL,
  `operacionescol` varchar(45) DEFAULT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  `estado_idestado` int(11) NOT NULL,
  PRIMARY KEY (`identificacionConducto`),
  KEY `fk_operaciones_usuario1_idx` (`usuario_idusuario`),
  KEY `fk_operaciones_estado1_idx` (`estado_idestado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `operaciones`
--

INSERT INTO `operaciones` (`identificacionConducto`, `nombreConducto`, `placaVehiculo`, `marcaVehiculo`, `modeloVehiculo`, `operacionescol`, `usuario_idusuario`, `estado_idestado`) VALUES
(1022924323, 'hernando loaiza', 'ic145d', 'twingo', '2018', '3', 2, 1),
(65586123, 'maria ducuara', 'ac145k', 'mazda', '2022', '6', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE IF NOT EXISTS `proveedores` (
  `identificacionProveedor` int(11) NOT NULL,
  `nombreProveedor` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `disponibilidadVehiculos` int(11) NOT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  PRIMARY KEY (`identificacionProveedor`),
  KEY `fk_proveedores_usuario_idx` (`usuario_idusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`identificacionProveedor`, `nombreProveedor`, `direccion`, `correo`, `disponibilidadVehiculos`, `usuario_idusuario`) VALUES
(101047586, 'logic tech', 'cra14m71f05sur', 'ducuara@gmail.com', 6, 1),
(1022934710, 'orion7', 'crea14m71f05sr', 'yloaiza@gmai.com', 8, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` int(11) NOT NULL,
  `nombreUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nombreUsuario`) VALUES
(1, 'gerente'),
(2, 'operador');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
