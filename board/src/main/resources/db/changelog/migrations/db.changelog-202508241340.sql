--liquibase formatted sql
--changeset junior:202508241337
--comment: blocks table create

create table BLOCKS (
    id bigint auto_increment primary key,
    description varchar(255) not null,
    created_at timestamp default current_timestamp,
    finished_at timestamp null,
    card_id bigint not null,
    constraint cards__blocks_fk foreign key (cards_id) references CARDS(id) on delete cascade
) engine=InnoDB;

--rollback DROP TABLE BLOCKS