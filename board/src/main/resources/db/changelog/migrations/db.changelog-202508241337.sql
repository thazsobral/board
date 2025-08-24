--liquibase formatted sql
--changeset junior:202508241337
--comment: cards table create

create table CARDS (
    id bigint auto_increment primary key,
    title varchar(255) not null,
    description varchar(255) not null,
    `order` int not null,
    kind varchar(7) not null,
    board_column_id bigint not null,
    constraint boards_columns__cards_fk foreign key (board_column_id) references BOARDS_COLUMNS(id) on delete cascade
) engine=InnoDB;

--rollback DROP TABLE CARDS