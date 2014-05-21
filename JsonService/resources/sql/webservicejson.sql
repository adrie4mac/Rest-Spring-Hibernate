/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50144
 Source Host           : localhost
 Source Database       : webservicejson

 Target Server Type    : MySQL
 Target Server Version : 50144
 File Encoding         : utf-8

 Date: 05/21/2014 08:39:07 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_employee`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE `tbl_employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `birthday` date DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `tbl_employee`
-- ----------------------------
BEGIN;
INSERT INTO `tbl_employee` VALUES ('1', '2014-01-15', '4234', 'adriyadi savana'), ('2', '2014-01-22', '324', 'Rani'), ('3', '2014-01-24', null, 'adrie savana'), ('4', '2014-01-23', null, 'budi'), ('5', '2014-01-14', '4234', 'Fia'), ('6', '2014-02-19', null, 'savana'), ('7', '2014-02-26', '3424', 'adri'), ('8', '2014-02-11', null, 'pak awi'), ('9', '2014-02-04', null, 'ipul'), ('10', '2014-02-04', '42342', 'satria baja hitam'), ('11', '2014-03-08', null, 'yudha');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
