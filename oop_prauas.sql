-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Jun 2020 pada 03.42
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop_prauas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kabupaten`
--

CREATE TABLE `kabupaten` (
  `kabupaten_id` int(11) NOT NULL,
  `kabupaten_nama` varchar(128) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data untuk tabel `kabupaten`
--

INSERT INTO `kabupaten` (`kabupaten_id`, `kabupaten_nama`) VALUES
(1, 'ALOR'),
(2, 'BELU'),
(3, 'ENDE'),
(4, 'FLORES TIMUR'),
(5, 'KOTA KUPANG'),
(6, 'KUPANG'),
(7, 'LEMBATA'),
(8, 'MALAKA'),
(9, 'MANGGARAI'),
(10, 'MANGGARAI BARAT'),
(11, 'MANGGARAI TIMUR'),
(12, 'NAGEKEO'),
(13, 'NGADA'),
(14, 'ROTE NDAO'),
(15, 'SABU RAIJUA'),
(16, 'SIKKA'),
(17, 'SUMBA BARAT'),
(18, 'SUMBA BARAT DAYA'),
(19, 'SUMBA TENGAH'),
(20, 'SUMBA TIMUR'),
(21, 'TIMOR TENGAH SELATAN'),
(22, 'TIMOR TENGAH UTARA'),
(24, 'Provinsi NTT');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasus`
--

CREATE TABLE `kasus` (
  `id` int(11) NOT NULL,
  `nama` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kasus`
--

INSERT INTO `kasus` (`id`, `nama`) VALUES
(1, 'OTG'),
(2, 'ODP'),
(3, 'PDP'),
(4, 'Positif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kecamatan`
--

CREATE TABLE `kecamatan` (
  `kecamatan_id` int(11) NOT NULL,
  `kabupaten_id` int(11) DEFAULT NULL,
  `kecamatan_nama` varchar(256) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data untuk tabel `kecamatan`
--

INSERT INTO `kecamatan` (`kecamatan_id`, `kabupaten_id`, `kecamatan_nama`) VALUES
(1, 1, 'ALOR BARAT DAYA'),
(2, 1, 'ALOR BARAT LAUT'),
(3, 2, 'ALOR SELATAN'),
(4, 2, 'ALOR TENGAH UTARA'),
(5, 2, 'ALOR TIMUR'),
(6, 2, 'ALOR TIMUR LAUT'),
(7, 2, 'KABOLA'),
(8, 2, 'LEMBUR'),
(9, 2, 'MATARU'),
(10, 2, 'PANTAR'),
(11, 2, 'PANTAR BARAT'),
(12, 2, 'PANTAR BARU LAUT'),
(13, 2, 'PANTAR TENGAH'),
(14, 2, 'PANTAR TIMUR'),
(15, 2, 'PULAU PURA'),
(16, 2, 'PUREMAN'),
(17, 2, 'TELUK MUTIARA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelurahan`
--

CREATE TABLE `kelurahan` (
  `kelurahan_id` int(11) NOT NULL,
  `kecamatan_id` int(11) DEFAULT NULL,
  `kelurahan_nama` varchar(256) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data untuk tabel `kelurahan`
--

INSERT INTO `kelurahan` (`kelurahan_id`, `kecamatan_id`, `kelurahan_nama`) VALUES
(1, 1, 'HALERMAN'),
(2, 1, 'KAFELULANG'),
(3, 1, 'KUIFANA'),
(4, 1, 'MANATANG'),
(5, 1, 'MARGETA'),
(6, 1, 'MORAMAM'),
(7, 1, 'MORBA'),
(8, 1, 'MORU'),
(9, 1, 'ORGEN'),
(10, 1, 'PAILELANG'),
(11, 1, 'PINTUMAS'),
(12, 1, 'PROBUR'),
(13, 1, 'PROBUR UTARA'),
(14, 1, 'TRIBUR'),
(15, 1, 'WAKAPSIR'),
(16, 1, 'WAKAPSIR TIMUR'),
(17, 1, 'WOLWAL'),
(18, 1, 'WOLWAL BARAT'),
(19, 1, 'WOLWAL SELATAN'),
(20, 1, 'WOLWAL TENGAH'),
(21, 2, 'ADANG'),
(22, 2, 'AIMOLI'),
(23, 2, 'ALA\"ANG'),
(24, 2, 'ALILA'),
(25, 2, 'ALILA SELATAN'),
(26, 2, 'ALOR BESAR'),
(27, 2, 'ALOR KECIL'),
(28, 2, 'AMPERA'),
(29, 2, 'BAMPALOLA'),
(30, 2, 'DULOLONG'),
(31, 2, 'DULOLONG BARAT'),
(32, 2, 'HULNANI'),
(33, 2, 'LEFOKISU'),
(34, 2, 'LEWALU'),
(35, 2, 'O\'A MATE'),
(36, 2, 'OTVAI'),
(37, 2, 'PULAU BUAYA'),
(38, 2, 'TERNATE'),
(39, 2, 'TERNATE SELATAN'),
(40, 3, 'KELAISI BARAT'),
(41, 3, 'KELAISI TENGAH'),
(42, 3, 'KELAISI TIMUR'),
(43, 3, 'KIRAMAN'),
(44, 3, 'KUNEMAN'),
(45, 3, 'LELLA'),
(46, 3, 'MAIKANG'),
(47, 3, 'MALAIPEA'),
(48, 3, 'MANMAS'),
(49, 3, 'PADANG ALANG'),
(50, 3, 'SIDABUI'),
(51, 3, 'SILAIPUI'),
(52, 3, 'SUBO'),
(53, 3, 'TAMANAPUI'),
(54, 4, 'ALIM MEBUNG'),
(55, 4, 'DAPITAU'),
(56, 4, 'FUISAMA'),
(57, 4, 'FUNGAFENG'),
(58, 4, 'KAFAKBEKA'),
(59, 4, 'LAKWATI'),
(60, 4, 'LEMBUR BARAT'),
(61, 4, 'LEMBUR TENGAH'),
(62, 4, 'LIKWATANG'),
(63, 4, 'MANETWATI'),
(64, 4, 'NUR BENLELANG'),
(65, 4, 'PETLENG'),
(66, 4, 'TOMINUKU'),
(67, 4, 'WELAI SELATAN'),
(68, 5, 'BELEMANA'),
(69, 5, 'ELOK'),
(70, 5, 'KOLANA SELATAN'),
(71, 5, 'KOLANA UTARA'),
(72, 5, 'MARITAING'),
(73, 5, 'MAUKURU'),
(74, 5, 'MAUSAMANG'),
(75, 5, 'PADANG PANJANG'),
(76, 5, 'TANGLAPUI'),
(77, 5, 'TANGLAPUI TIMUR'),
(78, 6, 'AIR MANCUR'),
(79, 6, 'KAMOT'),
(80, 6, 'KENARIMBALA'),
(81, 6, 'LIPPANG'),
(82, 6, 'NAILANG'),
(83, 6, 'PIDO'),
(84, 6, 'TARAMANA'),
(85, 6, 'WAISIKA'),
(86, 7, 'ALILA TIMUR'),
(87, 7, 'KABOLA'),
(88, 7, 'KOPIDIL'),
(89, 7, 'LAWAHING'),
(90, 7, 'PANTE DEERE'),
(91, 8, 'LEMBUR TIMUR'),
(92, 8, 'LUBA'),
(93, 8, 'TALWAI'),
(94, 8, 'TASI'),
(95, 8, 'TULLENG'),
(96, 8, 'WAIMI'),
(97, 9, 'KAMAIFUI'),
(98, 9, 'LAKATULI'),
(99, 9, 'MATARU BARAT'),
(100, 9, 'MATARU SELATAN'),
(101, 9, 'MATARU TIMUR'),
(102, 9, 'MATARU UTARA'),
(103, 9, 'TAMAN MATARU'),
(104, 10, 'BANA'),
(105, 10, 'BANDAR'),
(106, 10, 'BAOLANG'),
(107, 10, 'BOUWELI'),
(108, 10, 'BUKIT MAS'),
(109, 10, 'HELANGDOHI'),
(110, 10, 'KABIR'),
(111, 10, 'MADAR'),
(112, 10, 'MUNASELI'),
(113, 10, 'PANDAI'),
(114, 10, 'WAILAWAR'),
(115, 11, 'BARALER'),
(116, 11, 'BARANUSA'),
(117, 11, 'BLANG MERANG'),
(118, 11, 'ILLU'),
(119, 11, 'KALONDAMA'),
(120, 11, 'LEER'),
(121, 11, 'PIRINGSINA'),
(122, 12, 'ALLUMANG'),
(123, 12, 'BEANGONONG'),
(124, 12, 'KALONDAMA BARAT'),
(125, 12, 'KALONDAMA TENGAH'),
(126, 12, 'KAYANG'),
(127, 12, 'LAMMA'),
(128, 12, 'MARISA'),
(129, 13, 'ARAMABA'),
(130, 13, 'BAGANG'),
(131, 13, 'DELAKI'),
(132, 13, 'EKA JAYA'),
(133, 13, 'MAUTA'),
(134, 13, 'MURIABANG'),
(135, 13, 'TAMAKH'),
(136, 13, 'TOANG'),
(137, 13, 'TUBBE'),
(138, 13, 'TUDE'),
(139, 14, 'BATU'),
(140, 14, 'BUNGABALI'),
(141, 14, 'KAERA'),
(142, 14, 'KALEB'),
(143, 14, 'LALAFANG'),
(144, 14, 'LEKOM'),
(145, 14, 'MAWAR'),
(146, 14, 'MERDEKA'),
(147, 14, 'NULE'),
(148, 14, 'OMBAY'),
(149, 14, 'TEREWENG'),
(150, 15, 'MARU'),
(151, 15, 'PURA'),
(152, 15, 'PURA BARAT'),
(153, 15, 'PURA SELATAN'),
(154, 15, 'PURA TIMUR'),
(155, 15, 'PURA UTARA'),
(156, 16, 'KAILESA'),
(157, 16, 'LANGKURU'),
(158, 16, 'LANGKURU UTARA'),
(159, 16, 'PURNAMA'),
(160, 17, 'ADANG BUOM'),
(161, 17, 'AIR KENARI'),
(162, 17, 'BINONGKO'),
(163, 17, 'FANATING'),
(164, 17, 'KALABAHI BARAT'),
(165, 17, 'KALABAHI KOTA'),
(166, 17, 'KALABAHI TENGAH'),
(167, 17, 'KALABAHI TIMUR'),
(168, 17, 'LENDOLA'),
(169, 17, 'MOTONGBANG'),
(170, 17, 'MUTIARA'),
(171, 17, 'NUSA KENARI'),
(172, 17, 'TELUK KENARI'),
(173, 17, 'WELAI BARAT'),
(174, 17, 'WELAI TIMUR'),
(175, 17, 'WETABUA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `orang_baru`
--

CREATE TABLE `orang_baru` (
  `id` int(11) NOT NULL,
  `kasus_id` int(11) NOT NULL,
  `kelurahan` varchar(128) NOT NULL,
  `kecamatan` varchar(128) NOT NULL,
  `kabupaten` varchar(128) NOT NULL,
  `jumlah` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `orang_baru`
--

INSERT INTO `orang_baru` (`id`, `kasus_id`, `kelurahan`, `kecamatan`, `kabupaten`, `jumlah`) VALUES
(1, 1, 'HALERMAN', 'ALOR BARAT DAYA', 'ALOR', '12'),
(2, 4, 'HALERMAN', 'KABOLA', 'ENDE', '12'),
(3, 4, 'KUIFANA', 'ALOR TIMUR', 'KOTA KUPANG', '20'),
(5, 2, 'HALERMAN', 'ALOR BARAT DAYA', 'ALOR', '13'),
(6, 3, 'HALERMAN', 'ALOR BARAT DAYA', 'ALOR', '13'),
(8, 1, 'HALERMAN', 'ALOR BARAT LAUT', 'BELU', '3'),
(9, 2, 'HALERMAN', 'ALOR BARAT LAUT', 'BELU', '30'),
(10, 3, 'HALERMAN', 'ALOR BARAT LAUT', 'BELU', '3'),
(12, 4, 'HALERMAN', 'ALOR BARAT DAYA', 'ALOR', '12'),
(14, 1, 'HALERMAN', 'ALOR BARAT DAYA', 'ALOR', '17');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kabupaten`
--
ALTER TABLE `kabupaten`
  ADD PRIMARY KEY (`kabupaten_id`);

--
-- Indeks untuk tabel `kasus`
--
ALTER TABLE `kasus`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `kecamatan`
--
ALTER TABLE `kecamatan`
  ADD PRIMARY KEY (`kecamatan_id`);

--
-- Indeks untuk tabel `kelurahan`
--
ALTER TABLE `kelurahan`
  ADD PRIMARY KEY (`kelurahan_id`);

--
-- Indeks untuk tabel `orang_baru`
--
ALTER TABLE `orang_baru`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kabupaten`
--
ALTER TABLE `kabupaten`
  MODIFY `kabupaten_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT untuk tabel `kasus`
--
ALTER TABLE `kasus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `kecamatan`
--
ALTER TABLE `kecamatan`
  MODIFY `kecamatan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT untuk tabel `kelurahan`
--
ALTER TABLE `kelurahan`
  MODIFY `kelurahan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=176;

--
-- AUTO_INCREMENT untuk tabel `orang_baru`
--
ALTER TABLE `orang_baru`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
