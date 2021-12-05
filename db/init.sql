create database canary;
use canary;
create user 'canary'@'%' identified by 'canary';
grant all on canary.* to 'canary'@'%';

DROP TABLE IF EXISTS name_day;

CREATE TABLE name_day (
    id INT AUTO_INCREMENT,
    name CHAR(32),
    date DATE,

    PRIMARY KEY (id),
    UNIQUE (name)
);

create table hibernate_sequence (next_val BIGINT);
insert into hibernate_sequence (next_val) values (1);
