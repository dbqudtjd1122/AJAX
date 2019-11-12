select * from nov11_menu;

drop table nov11_menu;
desc nov11_menu;

create table nov11_menu(
	m_name varchar2(10 char),
	m_price NUMBER(10)
);


insert into NOV11_MENU values('등심', 10000);