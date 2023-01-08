create schema reporting;

create table reporting.users(
    ID int not null auto_increment,
    user_name varchar(128)
);

create table reporting.reports(
    ID int not null auto_increment,
    report_name varchar(128)
);

create table reporting.scheduling (
    ID int not null auto_increment,
    report_id int not null,
    schedule varchar(32)
);