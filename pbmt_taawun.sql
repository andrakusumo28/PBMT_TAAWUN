# Host: localhost  (Version 5.5.5-10.1.8-MariaDB)
# Date: 2017-01-10 17:57:12
# Generator: MySQL-Front 5.4  (Build 4.115) - http://www.mysqlfront.de/

/*!40101 SET NAMES utf8 */;

#
# Structure for table "buku_besar"
#

DROP TABLE IF EXISTS `buku_besar`;
CREATE TABLE `buku_besar` (
  `NO_REK` varchar(30) NOT NULL,
  `KETERANGAN` varchar(100) NOT NULL,
  `SALDO` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "buku_besar"
#


#
# Structure for table "data_anggota_bmt"
#

DROP TABLE IF EXISTS `data_anggota_bmt`;
CREATE TABLE `data_anggota_bmt` (
  `NO_KTP` varchar(30) NOT NULL,
  `NAMA` varchar(60) NOT NULL,
  `ALAMAT` varchar(120) NOT NULL,
  `TEMPAT_LAHIR` varchar(30) NOT NULL,
  `TANGGAL_LAHIR` date NOT NULL,
  `LOKASI_USAHA` varchar(60) NOT NULL,
  `JENIS_USAHA` varchar(50) NOT NULL,
  `NIK_BMT` varchar(30) NOT NULL,
  PRIMARY KEY (`NO_KTP`),
  KEY `fk_data_bmt` (`NIK_BMT`),
  KEY `nama` (`NAMA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "data_anggota_bmt"
#


#
# Structure for table "data_bmt"
#

DROP TABLE IF EXISTS `data_bmt`;
CREATE TABLE `data_bmt` (
  `NIK_BMT` varchar(30) NOT NULL,
  `NAMA_BMT` varchar(50) NOT NULL,
  `ALAMAT_BMT` int(120) NOT NULL,
  `NO_ANGGOTA_BMT` int(30) NOT NULL,
  `MPD` varchar(30) NOT NULL,
  `MPW` varchar(30) NOT NULL,
  `NO_TELPON` varchar(30) NOT NULL,
  `NAMA_KONTAK` varchar(60) NOT NULL,
  `NOMOR_KONTAK` varchar(30) NOT NULL,
  PRIMARY KEY (`NIK_BMT`),
  KEY `nm_bmt` (`NAMA_BMT`),
  KEY `nm_kontak` (`NAMA_KONTAK`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "data_bmt"
#


#
# Structure for table "data_peserta"
#

DROP TABLE IF EXISTS `data_peserta`;
CREATE TABLE `data_peserta` (
  `NO_KTP` varchar(20) NOT NULL,
  `TANGGAL` date NOT NULL,
  `NAMA` varchar(60) NOT NULL,
  `ALAMAT` varchar(120) NOT NULL,
  `TEMPAT_LAHIR` varchar(20) NOT NULL,
  `TANGGAL_LAHIR` date NOT NULL,
  `LKS_USAHA` varchar(100) NOT NULL,
  `JENIS_USAHA` varchar(50) NOT NULL,
  `NIK_BMT` varchar(30) NOT NULL,
  `REKENING` varchar(30) NOT NULL,
  `PEMBIAYAAN` int(20) NOT NULL,
  `TGL_AKAD` date NOT NULL,
  `JTH_TEMPO` date NOT NULL,
  `JGK_WAKTU` int(11) NOT NULL,
  `IURAN_JIWA` int(20) NOT NULL,
  `IURAN_KEBAKARAN` int(20) NOT NULL,
  `JML_IURAN` int(20) NOT NULL,
  PRIMARY KEY (`NO_KTP`),
  KEY `fk_data_bmt` (`NIK_BMT`),
  KEY `nama` (`NAMA`),
  KEY `alamat` (`ALAMAT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "data_peserta"
#


#
# Structure for table "jurnal"
#

DROP TABLE IF EXISTS `jurnal`;
CREATE TABLE `jurnal` (
  `TANGGAL` date NOT NULL,
  `NO_REK` varchar(30) NOT NULL,
  `D/K` char(1) NOT NULL,
  `KETERANGAN` varchar(100) NOT NULL,
  `JUMLAH` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "jurnal"
#


#
# Structure for table "santunan_anggota_bmt"
#

DROP TABLE IF EXISTS `santunan_anggota_bmt`;
CREATE TABLE `santunan_anggota_bmt` (
  `NO_KTP` varchar(20) NOT NULL,
  `TANGGAL` date NOT NULL,
  `NAMA` varchar(60) NOT NULL,
  `ALAMAT` varchar(120) NOT NULL,
  `NIK_BMT` varchar(30) NOT NULL,
  `REKENING` varchar(30) NOT NULL,
  `PEMBIAYAAN` int(20) NOT NULL,
  `TGL_AKAD` date NOT NULL,
  `JTH_TEMPO` date NOT NULL,
  `JGK_WAKTU` int(11) NOT NULL,
  `IURAN_JIWA` int(20) NOT NULL,
  `IURAN_KEBAKARAN` int(20) NOT NULL,
  `JML_IURAN` int(20) NOT NULL,
  `PENYEBAB` varchar(100) NOT NULL,
  `SALDO` int(20) NOT NULL,
  `JML_SANTUNAN` int(20) NOT NULL,
  PRIMARY KEY (`NO_KTP`),
  KEY `fk_data_bmt` (`NIK_BMT`),
  KEY `nama` (`NAMA`),
  KEY `alamat` (`ALAMAT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "santunan_anggota_bmt"
#


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `NOMOR` int(11) NOT NULL AUTO_INCREMENT,
  `NAMA` varchar(60) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `KEWENANGAN` varchar(30) NOT NULL,
  `KETERANGAN` varchar(100) NOT NULL,
  PRIMARY KEY (`NOMOR`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

