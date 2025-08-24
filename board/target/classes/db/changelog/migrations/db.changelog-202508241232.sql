--liquibase formatted sql
--changeset junior:202508241232
--comment: boards table create

create table BOARDS(
    id bigint auto_increment primary key,
    name varchar(255) not null
) engine=InnoDB;

--rollback DROP TABLE BOARDS