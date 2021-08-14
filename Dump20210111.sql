-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: airlinedata
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `AdminId` varchar(45) NOT NULL,
  PRIMARY KEY (`AdminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','admin','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_has_customer`
--

DROP TABLE IF EXISTS `admin_has_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_has_customer` (
  `Admin_AdminId` varchar(45) NOT NULL,
  `Customer_CustomerId` varchar(20) NOT NULL,
  PRIMARY KEY (`Admin_AdminId`,`Customer_CustomerId`),
  KEY `fk_Admin_has_Customer_Customer1_idx` (`Customer_CustomerId`),
  KEY `fk_Admin_has_Customer_Admin1_idx` (`Admin_AdminId`),
  CONSTRAINT `fk_Admin_has_Customer_Admin1` FOREIGN KEY (`Admin_AdminId`) REFERENCES `admin` (`AdminId`),
  CONSTRAINT `fk_Admin_has_Customer_Customer1` FOREIGN KEY (`Customer_CustomerId`) REFERENCES `customer` (`CustomerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_has_customer`
--

LOCK TABLES `admin_has_customer` WRITE;
/*!40000 ALTER TABLE `admin_has_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_has_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_has_employee`
--

DROP TABLE IF EXISTS `admin_has_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_has_employee` (
  `Admin_AdminId` varchar(45) NOT NULL,
  `Employee_EmployeeId` varchar(20) NOT NULL,
  PRIMARY KEY (`Admin_AdminId`,`Employee_EmployeeId`),
  KEY `fk_Admin_has_Employee_Employee1_idx` (`Employee_EmployeeId`),
  KEY `fk_Admin_has_Employee_Admin1_idx` (`Admin_AdminId`),
  CONSTRAINT `fk_Admin_has_Employee_Admin1` FOREIGN KEY (`Admin_AdminId`) REFERENCES `admin` (`AdminId`),
  CONSTRAINT `fk_Admin_has_Employee_Employee1` FOREIGN KEY (`Employee_EmployeeId`) REFERENCES `employee` (`EmployeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_has_employee`
--

LOCK TABLES `admin_has_employee` WRITE;
/*!40000 ALTER TABLE `admin_has_employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_has_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_has_flight`
--

DROP TABLE IF EXISTS `admin_has_flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_has_flight` (
  `Admin_AdminId` varchar(45) NOT NULL,
  `Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`Admin_AdminId`,`Flight_FlightId`),
  KEY `fk_Admin_has_Flight_Flight1_idx` (`Flight_FlightId`),
  KEY `fk_Admin_has_Flight_Admin1_idx` (`Admin_AdminId`),
  CONSTRAINT `fk_Admin_has_Flight_Admin1` FOREIGN KEY (`Admin_AdminId`) REFERENCES `admin` (`AdminId`),
  CONSTRAINT `fk_Admin_has_Flight_Flight1` FOREIGN KEY (`Flight_FlightId`) REFERENCES `flight` (`FlightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_has_flight`
--

LOCK TABLES `admin_has_flight` WRITE;
/*!40000 ALTER TABLE `admin_has_flight` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_has_flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_has_user`
--

DROP TABLE IF EXISTS `admin_has_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_has_user` (
  `Admin_AdminId` varchar(45) NOT NULL,
  `User_UserId` varchar(20) NOT NULL,
  PRIMARY KEY (`Admin_AdminId`,`User_UserId`),
  KEY `fk_Admin_has_User_User1_idx` (`User_UserId`),
  KEY `fk_Admin_has_User_Admin1_idx` (`Admin_AdminId`),
  CONSTRAINT `fk_Admin_has_User_Admin1` FOREIGN KEY (`Admin_AdminId`) REFERENCES `admin` (`AdminId`),
  CONSTRAINT `fk_Admin_has_User_User1` FOREIGN KEY (`User_UserId`) REFERENCES `user` (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_has_user`
--

LOCK TABLES `admin_has_user` WRITE;
/*!40000 ALTER TABLE `admin_has_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_has_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cancellation`
--

DROP TABLE IF EXISTS `cancellation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cancellation` (
  `CancellationNo` int NOT NULL AUTO_INCREMENT,
  `CancellationDate` varchar(45) NOT NULL,
  `Ticket_TicketId` varchar(20) NOT NULL,
  `Ticket_Customer_CustomerId` varchar(20) NOT NULL,
  `Ticket_Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`CancellationNo`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancellation`
--

LOCK TABLES `cancellation` WRITE;
/*!40000 ALTER TABLE `cancellation` DISABLE KEYS */;
INSERT INTO `cancellation` VALUES (2,'2020-12-20T19:11:34.263363400Z','TO003','cs005','FO004'),(3,'2020-12-20T19:14:01.907900900Z','TO003','cs005','FO004'),(6,'2020-12-20T19:19:53.640055100Z','TO001','cs002','FO002'),(7,'2020-12-20T19:26:40.423857300Z','TO003','cs005','FO004'),(8,'2020-12-20T19:26:40.423857300Z','TO003','cs005','FO004'),(9,'2020-12-20T19:27:42.638550400Z','TO003','cs005','FO004'),(10,'2020-12-20T19:27:42.638550400Z','TO003','cs005','FO004'),(11,'2020-12-20T19:28:53.976006700Z','TO003','cs005','FO004'),(12,'2020-12-20T19:35:08.329381700Z','TO003','cs005','FO004'),(13,'2020-12-20T19:36:35.757908Z','TO003','cs005','FO004'),(14,'2020-12-20T19:37:16.280294500Z','TO003','cs005','FO004'),(15,'2020-12-20T19:38:30.322774100Z','TO003','cs005','FO004'),(16,'2020-12-20T19:39:17.609327400Z','TO003','cs005','FO004'),(17,'2020-12-20T19:42:56.268584700Z','TO003','cs005','FO004'),(18,'2020-12-20T19:45:36.760583500Z','TO003','cs005','FO004'),(19,'2020-12-20T20:02:22.253380Z','TO003','cs005','FO004'),(20,'2020-12-20T20:06:47.565962200Z','TO003','cs005','FO004'),(21,'2020-12-20T20:11:27.729786400Z','TO003','cs006','FO002'),(22,'2020-12-20T20:25:41.211166400Z','TO003','cs006','FO002'),(23,'2020-12-20T20:26:32.859263Z','TO003','cs006','FO002'),(24,'2020-12-20T20:28:12.838412200Z','TO003','cs006','FO002'),(25,'2020-12-20T20:30:52.230929300Z','TO003','cs006','FO002'),(26,'2020-12-20T20:36:03.898077200Z','TO002','cs003','FO003'),(27,'2021-01-11T14:57:16.233756500Z','TO001','cs002','FO002');
/*!40000 ALTER TABLE `cancellation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `CustomerId` varchar(20) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `NIC` varchar(45) NOT NULL,
  `PassportNo` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `DOB` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Contact` varchar(45) NOT NULL,
  PRIMARY KEY (`CustomerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('CS001','Sobia','Zulfiqar','92863','672920','Islamabad','1999-07-31','FeMale','34556'),('CS002','Urooj','Murtaza','837390','83290','Lahore','2020-12-05','FeMale','44567'),('CS003','Sohaib','Zulfiqar','83629101','2738292','Islamabad','1996-11-02','Male','3456'),('CS004','tehreem','fatima','563','433363','Lahire','2020-12-05','FeMale','6585'),('CS005','Amna','Bukhari','36877564','4245346','Karachi','2020-12-05','FeMale','663'),('CS006','Ali','Ahmed','32892','32298','Peshawar','2020-12-03','Male','22388'),('CS007','Ahmed','Faiz','63829','26278','Quetta','2020-12-01','Male','55'),('CS008','Sahil','Nasir','252719','2277','Sialkot','2020-05-14','Male','1234'),('CS009','Amna','Parvez','5456','43545','Karachi','2020-12-01','FeMale','996544'),('CS010','selena','waqar','5456','323453','Islamabad	','2020-12-04','FeMale','6585'),('CS011','Alex','Roger','53892','108364','Islamabad','2021-01-02','Male','65433');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmployeeId` varchar(20) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  PRIMARY KEY (`EmployeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('EO001','nas004','2536','Naseer','Ahmed'),('EO002','bt20','6383','Bajwa','Tufeeq');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `FlightId` varchar(20) NOT NULL,
  `FlightName` varchar(45) NOT NULL,
  `Source` varchar(45) NOT NULL,
  `Departure` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `DepartTime` varchar(45) NOT NULL,
  `ArrivalTime` varchar(45) NOT NULL,
  `FlightCharge` varchar(45) NOT NULL,
  PRIMARY KEY (`FlightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES ('FO001','PIA001','Karachi','Islamabad','2020-12-26','09-00','12-00','30000'),('FO002','PIA-0001','Lahore','Islamabad','2020-12-31','12-00','2-00','9000'),('FO003','PIA004','Quetta','Peshawar','2020-12-31','18-00','22-00','11000'),('FO004','PIA4657','Karachi','Peshawar','2020-12-31','6-00','9-00','11000'),('FO005','PIA-0019','Islamabad','Quetta','2021-01-03','09-00','10-00','9000'),('FO006','Shaheen-045','Peshawar','Karachi','2021-01-06','10-00','12-00','10000');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `PayID` int NOT NULL AUTO_INCREMENT,
  `ChequeNo` varchar(45) DEFAULT NULL,
  `CardNo` varchar(45) DEFAULT NULL,
  `PaidAmount` varchar(45) NOT NULL,
  `PayDate` varchar(45) NOT NULL,
  `Ticket_TicketId` varchar(20) NOT NULL,
  `Ticket_Customer_CustomerId` varchar(20) NOT NULL,
  `Ticket_Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`PayID`,`Ticket_TicketId`,`Ticket_Customer_CustomerId`,`Ticket_Flight_FlightId`),
  KEY `ticketId_idx` (`Ticket_TicketId`,`Ticket_Customer_CustomerId`,`Ticket_Flight_FlightId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'','','9000','2020-12-20T17:32:18.636230900Z','TO001','CS002','FO002'),(2,'','','11000','2020-12-20T17:38:26.551480600Z','TO002','CS003','FO003'),(3,NULL,NULL,'11000','2020-12-20T17:46:32.977906300Z','to002','CS003','FO003'),(4,'','','11000','2020-12-20T17:48:28.183795300Z','to002','CS003','FO003'),(5,'','','9000','2020-12-20T17:50:29.078023Z','to001','CS002','FO002'),(6,'34','535','9000','2020-12-20T17:50:35.145010700Z','to001','CS002','FO002'),(7,'32235','12343','11000','2020-12-20T17:57:43.954629300Z','to002','CS003','FO003'),(8,'5467','365','9000','2020-12-20T20:10:52.395746100Z','to003','cs006','FO002'),(9,'5644','23253','11000','2020-12-20T20:35:14.263351900Z','to003','cs003','FO004'),(10,'234','22','9000','2020-12-25T22:56:48.092593800Z','to001','CS002','FO002'),(11,'36567','54657','30000','2020-12-25T23:06:31.505617200Z','TO004','CS009','FO001'),(12,'3456','3345667','9000','2021-01-11T14:56:57.230717300Z','to005','cs011','FO005');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pilot`
--

DROP TABLE IF EXISTS `pilot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pilot` (
  `PilotId` varchar(20) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `NIC` varchar(45) NOT NULL,
  `Contact` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`PilotId`,`Flight_FlightId`),
  KEY `fk_Pilot_Flight1_idx` (`Flight_FlightId`),
  CONSTRAINT `fk_Pilot_Flight1` FOREIGN KEY (`Flight_FlightId`) REFERENCES `flight` (`FlightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pilot`
--

LOCK TABLES `pilot` WRITE;
/*!40000 ALTER TABLE `pilot` DISABLE KEYS */;
INSERT INTO `pilot` VALUES ('P001','Sonia','Riaz','281902','22344','FeMale','FO002');
/*!40000 ALTER TABLE `pilot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planedetail`
--

DROP TABLE IF EXISTS `planedetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planedetail` (
  `Capacity` varchar(20) NOT NULL,
  `ClassName` varchar(45) NOT NULL,
  `Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`Flight_FlightId`),
  CONSTRAINT `fk_PlaneDetail_Flight1` FOREIGN KEY (`Flight_FlightId`) REFERENCES `flight` (`FlightId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planedetail`
--

LOCK TABLES `planedetail` WRITE;
/*!40000 ALTER TABLE `planedetail` DISABLE KEYS */;
INSERT INTO `planedetail` VALUES ('5000','B,E','fo001'),('9000','B,e','FO002'),('4309','Business','FO003'),('5000','Business','FO004'),('9000','Economy and Business','FO005');
/*!40000 ALTER TABLE `planedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `JourneyDate` varchar(20) NOT NULL,
  `JourneyTime` varchar(45) NOT NULL,
  `Source` varchar(45) NOT NULL,
  `Destination` varchar(45) NOT NULL,
  `Ticket_TicketId` varchar(20) NOT NULL,
  `Ticket_Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`Ticket_TicketId`,`Ticket_Flight_FlightId`),
  KEY `fk_Reservation_Ticket1_idx` (`Ticket_TicketId`,`Ticket_Flight_FlightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `TicketId` varchar(20) NOT NULL,
  `Class` varchar(45) NOT NULL,
  `Price` varchar(45) NOT NULL,
  `Seat` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Customer_CustomerId` varchar(20) NOT NULL,
  `Flight_FlightId` varchar(20) NOT NULL,
  PRIMARY KEY (`TicketId`,`Customer_CustomerId`,`Flight_FlightId`),
  KEY `fk_Ticket_Customer1_idx` (`Customer_CustomerId`),
  KEY `fk_Ticket_Flight1_idx` (`Flight_FlightId`),
  CONSTRAINT `fk_Ticket_Customer1` FOREIGN KEY (`Customer_CustomerId`) REFERENCES `customer` (`CustomerId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Ticket_Flight1` FOREIGN KEY (`Flight_FlightId`) REFERENCES `flight` (`FlightId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES ('TO002','Economy','30000','1','2020-12-02','cs001','FO001'),('TO003','Economy','11000','1','2020-12-31','cs006','FO004'),('TO004','Economy','30000','1','2020-12-31','CS009','FO001'),('TO005','Economy','9000','2','2021-01-03','cs011','FO005'),('TO006','Economy','9000','1','2021-01-04','cs001','FO002');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `UserId` varchar(20) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('UO001','bjq','123','bajwa','qamar'),('UO002','LEOF12','321','Leo','Franco'),('UO003','f','1','a','a');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-11 18:22:57
