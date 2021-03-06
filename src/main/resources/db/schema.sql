CREATE TABLE ITEM_STATUS (
 ITEM_ID INT,
 STATUS_ID INT,
 CREATE_DATE INT(11),
 PRIMARY KEY(ITEM_ID, STATUS_ID, CREATE_DATE),
 FOREIGN KEY(ITEM_ID) REFERENCES ITEM(ITEM_ID) ,
 FOREIGN KEY(STATUS_ID) REFERENCES STATUS(STATUS_ID)
 )

ALTER TABLE WAREHOUSE CHANGE ID WAREHOUSE_ID INT
ALTER TABLE TASK CHANGE ID TASK_ID INT
ALTER TABLE STATUS CHANGE ID STATUS_ID INT
ALTER TABLE ITEM CHANGE ID ITEM_ID INT

CREATE TABLE WAREHOUSE (
 ID INT PRIMARY KEY,
 WAREHOUSE VARCHAR(255),
 ADDRESS VARCHAR(255))

CREATE TABLE TASK (
 ID INT PRIMARY KEY,
 TASK VARCHAR(255),
  DESCRIPTION VARCHAR(255))

CREATE TABLE STATUS (
 ID INT PRIMARY KEY,
 STATUS VARCHAR(255))

CREATE TABLE ITEM (
 ID INT PRIMARY KEY,
 NAME VARCHAR(255),
 DESCRIPTION VARCHAR(255))