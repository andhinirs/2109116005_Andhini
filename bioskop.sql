-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2022 at 07:13 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bioskop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Id_user` char(5) NOT NULL,
  `Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Id_user`, `Password`) VALUES
('00001', 'admin1'),
('00002', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `data_film`
--

CREATE TABLE `data_film` (
  `Id_film` char(3) NOT NULL,
  `Judul` varchar(50) NOT NULL,
  `Jadwal` varchar(20) NOT NULL,
  `Durasi` char(5) NOT NULL,
  `Harga` int(6) NOT NULL,
  `Keterangan` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_film`
--

INSERT INTO `data_film` (`Id_film`, `Judul`, `Jadwal`, `Durasi`, `Harga`, `Keterangan`) VALUES
('001', 'Qodrat', '21.00, 23.00', '3 Jam', 55000, 'Coming Soon!'),
('002', 'Miracle in Cell No. 7', '17.00, 20.00, 23.00', '2 Jam', 50000, '13+'),
('003', 'Mencuri Raden Saleh', '13.00, 16.00', '2 Jam', 35000, '17+'),
('004', 'Qorin', '10.00, 15.00, 22.00', '3 Jam', 60000, '18+'),
('005', 'Top Gun: Maverick', '22.00', '2 Jam', 50000, '18+'),
('006', 'Black Adam', '10.00, 15.00', '2 Jam', 35000, 'Coming Soon!'),
('007', 'Snow White', '22.00', '3 Jam', 40000, '13+');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id_user`);

--
-- Indexes for table `data_film`
--
ALTER TABLE `data_film`
  ADD PRIMARY KEY (`Id_film`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
