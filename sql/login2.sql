drop database if exists login2;
create database login2;
use login2;
create table users(
	username varchar(255),
	password varchar(255)
);
insert into users values("taro","123");
insert into users values("jiro","456");
insert into users values("hanako","789");