drop table if exists test;

create table test (
	id int primary key auto_increment,
	name varchar(30) not null,
	sex enum('MALE', 'FEMALE') not null,
	birth date,
	vip bit default false,
	price decimal(8, 2) not null default 0,
	createTime timestamp not null
) engine=InnoDB default charset=utf8;

insert into test
	(name, sex, birth, vip, price, createTime)
values
	('tom', 'MALE', '1994-06-21', true, 534.63, '2018-03-07 15:31:24'),
	('jerry', 'MALE', '1996-08-09', true, 756.05, '2018-03-09 10:44:13'),
	('canary', 'FEMALE', '1997-05-15', false, 217.46, '2018-03-09 13:24:50');
