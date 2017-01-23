USE [master]
GO

/****** Object:  Database [pbmt_taawun]    Script Date: 1/24/2017 3:46:41 AM ******/
CREATE DATABASE [pbmt_taawun]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'pbmt_taawun', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLSERVERDEV\MSSQL\DATA\pbmt_taawun.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'pbmt_taawun_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLSERVERDEV\MSSQL\DATA\pbmt_taawun_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [pbmt_taawun] SET COMPATIBILITY_LEVEL = 120
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [pbmt_taawun].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [pbmt_taawun] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [pbmt_taawun] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [pbmt_taawun] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [pbmt_taawun] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [pbmt_taawun] SET ARITHABORT OFF 
GO

ALTER DATABASE [pbmt_taawun] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [pbmt_taawun] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [pbmt_taawun] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [pbmt_taawun] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [pbmt_taawun] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [pbmt_taawun] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [pbmt_taawun] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [pbmt_taawun] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [pbmt_taawun] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [pbmt_taawun] SET  DISABLE_BROKER 
GO

ALTER DATABASE [pbmt_taawun] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [pbmt_taawun] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [pbmt_taawun] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [pbmt_taawun] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [pbmt_taawun] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [pbmt_taawun] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [pbmt_taawun] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [pbmt_taawun] SET RECOVERY FULL 
GO

ALTER DATABASE [pbmt_taawun] SET  MULTI_USER 
GO

ALTER DATABASE [pbmt_taawun] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [pbmt_taawun] SET DB_CHAINING OFF 
GO

ALTER DATABASE [pbmt_taawun] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [pbmt_taawun] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO

ALTER DATABASE [pbmt_taawun] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [pbmt_taawun] SET  READ_WRITE 
GO




/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[Administrasi]    Script Date: 1/24/2017 3:40:25 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Administrasi](
	[JENIS_IURAN] [varchar](80) NOT NULL,
	[NILAI_IURAN] [int] NOT NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[buku_besar]    Script Date: 1/24/2017 3:41:22 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[buku_besar](
	[REKENING] [char](7) NOT NULL,
	[KETERANGAN] [varchar](100) NOT NULL,
	[SALDO] [int] NOT NULL,
 CONSTRAINT [PK_buku_besar] PRIMARY KEY CLUSTERED 
(
	[REKENING] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[data_anggota_bmt]    Script Date: 1/24/2017 3:42:17 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[data_anggota_bmt](
	[NO_KTP] [varchar](30) NOT NULL,
	[NAMA] [varchar](60) NOT NULL,
	[ALAMAT] [varchar](150) NOT NULL,
	[TEMPAT_LAHIR] [varchar](30) NOT NULL,
	[TANGGAL_LAHIR] [datetime] NOT NULL,
	[LOKASI_USAHA] [varchar](60) NOT NULL,
	[JENIS_USAHA] [varchar](50) NOT NULL,
	[NIK_BMT] [varchar](30) NOT NULL,
 CONSTRAINT [PK_data_anggota_bmt] PRIMARY KEY CLUSTERED 
(
	[NO_KTP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[data_bmt]    Script Date: 1/24/2017 3:44:31 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[data_bmt](
	[NIK_BMT] [varchar](30) NOT NULL,
	[NAMA_BMT] [varchar](50) NOT NULL,
	[ALAMAT_BMT] [varchar](120) NOT NULL,
	[NO_ANGGOTA_BMT] [varchar](30) NOT NULL,
	[MPD] [varchar](30) NOT NULL,
	[MPW] [varchar](30) NOT NULL,
	[NO_TELPON] [varchar](30) NOT NULL,
	[NAMA_KONTAK] [varchar](60) NOT NULL,
	[NOMOR_KONTAK] [varchar](30) NOT NULL,
 CONSTRAINT [PK_data_bmt] PRIMARY KEY CLUSTERED 
(
	[NIK_BMT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[data_peserta]    Script Date: 1/24/2017 3:44:53 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[data_peserta](
	[NO_KTP] [varchar](30) NOT NULL,
	[TANGGAL] [datetime] NOT NULL,
	[NAMA] [varchar](60) NOT NULL,
	[ALAMAT] [varchar](150) NOT NULL,
	[TEMPAT_LAHIR] [varchar](30) NOT NULL,
	[TANGGAL_LAHIR] [datetime] NOT NULL,
	[LKS_USAHA] [varchar](100) NOT NULL,
	[JENIS_USAHA] [varchar](50) NOT NULL,
	[NIK_BMT] [varchar](30) NOT NULL,
	[REKENINNG] [char](15) NOT NULL,
	[PEMBIAYAAN] [int] NOT NULL,
	[TGL_AKAD] [datetime] NOT NULL,
	[JTH_TEMPO] [datetime] NOT NULL,
	[JGK_WAKTU] [int] NOT NULL,
	[IURAN_JIWA] [int] NOT NULL,
	[IURAN_KEBAKARAN] [int] NOT NULL,
	[JML_IURAN] [int] NOT NULL,
 CONSTRAINT [PK_data_peserta] PRIMARY KEY CLUSTERED 
(
	[NO_KTP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[jurnal]    Script Date: 1/24/2017 3:45:14 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[jurnal](
	[TANGGAL] [datetime] NULL,
	[REKENING] [char](15) NULL,
	[TRANSAKSI] [char](1) NULL,
	[KETERANGAN] [varchar](100) NULL,
	[JUMLAH] [int] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[santunan_anggota_bmt]    Script Date: 1/24/2017 3:45:42 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[santunan_anggota_bmt](
	[NO_KTP] [varchar](30) NOT NULL,
	[TANGGAL] [datetime] NOT NULL,
	[NAMA] [varchar](60) NOT NULL,
	[ALAMAT] [varchar](150) NOT NULL,
	[NIK_BMT] [varchar](30) NOT NULL,
	[REKENINNG] [char](15) NOT NULL,
	[PEMBIAYAAN] [int] NOT NULL,
	[TGL_AKAD] [datetime] NOT NULL,
	[JTH_TEMPO] [datetime] NOT NULL,
	[JGK_WAKTU] [int] NOT NULL,
	[IURAN_JIWA] [int] NOT NULL,
	[IURAN_KEBAKARAN] [int] NOT NULL,
	[JML_IURAN] [int] NOT NULL,
	[PENYEBAB] [varchar](100) NOT NULL,
	[SALDO] [int] NOT NULL,
	[JML_SANTUNAN] [int] NOT NULL,
 CONSTRAINT [PK_santunan_anggota_bmt] PRIMARY KEY CLUSTERED 
(
	[NO_KTP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/***************************************************************************************************************************************/

USE [pbmt_taawun]
GO

/****** Object:  Table [dbo].[user]    Script Date: 1/24/2017 3:46:03 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[user](
	[NOMOR] [int] NOT NULL,
	[NAMA] [varchar](60) NOT NULL,
	[PASSWORD] [varchar](20) NOT NULL,
	[PASSLAMA] [varchar](20) NOT NULL,
	[KONFIRMPASS] [varchar](20) NOT NULL,
	[ROLE] [varchar](30) NOT NULL,
	[KETERANGAN] [varchar](100) NOT NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO










