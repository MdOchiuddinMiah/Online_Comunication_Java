-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 13, 2015 at 10:33 PM
-- Server version: 5.5.44-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Online_Talk`
--

-- --------------------------------------------------------

--
-- Table structure for table `call_history`
--

CREATE TABLE IF NOT EXISTS `call_history` (
  `u_id` int(11) unsigned NOT NULL,
  `f_id` int(11) unsigned NOT NULL,
  `src_path` varchar(100) NOT NULL,
  `start_time` datetime NOT NULL,
  `duration` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `friend_list`
--

CREATE TABLE IF NOT EXISTS `friend_list` (
  `u_id` int(11) unsigned NOT NULL,
  `f_id` int(11) unsigned NOT NULL,
  `rln_stat` char(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `friend_list`
--

INSERT INTO `friend_list` (`u_id`, `f_id`, `rln_stat`) VALUES
(1, 2, 'F'),
(1, 3, 'F'),
(1, 4, 'F');

-- --------------------------------------------------------

--
-- Table structure for table `msg_history`
--

CREATE TABLE IF NOT EXISTS `msg_history` (
  `u_id` int(11) unsigned NOT NULL,
  `f_id` int(11) unsigned NOT NULL,
  `msg` text NOT NULL,
  `time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE IF NOT EXISTS `notification` (
  `u_id` int(11) unsigned NOT NULL,
  `f_id` int(11) unsigned NOT NULL,
  `nfn_type` char(1) NOT NULL DEFAULT 'M',
  `send_time` datetime NOT NULL,
  `receive_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE IF NOT EXISTS `user_info` (
  `u_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `u_name` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `f_name` varchar(40) NOT NULL,
  `l_name` varchar(40) NOT NULL,
  `nick_name` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `dob` date NOT NULL,
  `sex` char(1) NOT NULL DEFAULT 'M',
  `adress` varchar(200) NOT NULL,
  `zip` smallint(6) NOT NULL,
  `state` varchar(30) NOT NULL,
  `country` varchar(40) NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_name` (`u_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`u_id`, `u_name`, `password`, `f_name`, `l_name`, `nick_name`, `email`, `phone`, `dob`, `sex`, `adress`, `zip`, `state`, `country`) VALUES
(1, 'ashikuzzaman.raju', 'abcd', 'Md.', 'Ashikuzzaman', 'Raju', 'ashik.ar.420@gmail.com', '01766750645', '1991-10-29', 'M', 'abc', 1200, 'Dhaka', 'Bangladesh'),
(3, 'Omi.sayed', 'gahgdaj', 'Omi', 'Sayed', 'Sayed', 'dajhdjhakjhjkhkj', 'dhajhkjdhk', '0000-00-00', 'M', 'dahjdkjah', 0, 'dadkjkajk', 'jkhakhfkja');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
