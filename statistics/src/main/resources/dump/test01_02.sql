-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: statistics
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accessinternetbankingstatistics`
--

DROP TABLE IF EXISTS `accessinternetbankingstatistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accessinternetbankingstatistics` (
  `year` int NOT NULL,
  `desktop` double NOT NULL,
  `etc` double NOT NULL,
  `notebook` double NOT NULL,
  `smartpad` double NOT NULL,
  `smartphone` double NOT NULL,
  `useratio` double NOT NULL,
  PRIMARY KEY (`year`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accessinternetbankingstatistics`
--

LOCK TABLES `accessinternetbankingstatistics` WRITE;
/*!40000 ALTER TABLE `accessinternetbankingstatistics` DISABLE KEYS */;
INSERT INTO `accessinternetbankingstatistics` VALUES (2011,95.1,9.5,14.3,0,26.3,52.9),(2012,93.9,1.9,13.1,0,33.5,53.3),(2013,67.1,4.4,14.7,0,64.3,53.4),(2014,61.5,0.1,14.1,0.9,64.2,57.2),(2015,61.9,0.2,13.9,2.3,73.2,60.3),(2016,58.5,0.2,19.3,2.1,85.1,63.2),(2017,51.2,0.3,17.3,3.3,90.5,68.7),(2018,16.4,33.3,34.2,12.1,30.2,40.2),(2019,20.2,1.1,10.2,2.2,50.2,50.2);
/*!40000 ALTER TABLE `accessinternetbankingstatistics` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-19  3:33:35
