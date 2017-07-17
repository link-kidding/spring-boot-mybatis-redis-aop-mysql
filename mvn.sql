/*
 Navicat MySQL Data Transfer

 Source Server         : localDB
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : mvn

 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 07/17/2017 09:40:17 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(40) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` char(4) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('2', 'haha', '3', '999'), (null, '王小二 ', '100', '123456'), ('f38c7804a86845d2a9aeefaa105c3f1a', '王小二 ', '100', '123456'), ('e3d34571948843029098a73181823d9d', '王小二 ', '100', '123456'), ('824b9d090231470aaa1ea45feedbc202', '王小二 ', '100', '123456'), ('0ba529d597b54ff49e045681a2536372', '王小二 ', '100', '123456'), ('40c7a82bb42b467fbdcb2fc7e70f9561', '王小二 ', '100', '123456'), ('123', '哈', '1', '123456'), ('sfsfsdfsd', '哈喽', '1', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
