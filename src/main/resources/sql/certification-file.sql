create table tbl_certification_file(
    id bigint unsigned auto_increment primary key ,
    position_id bigint unsigned not null,
    constraint fk_certification_file_file foreign key (id)
                                   references tbl_file(id),
    constraint fk_certification_file_position foreign key (position_id)
                                   references  tbl_position(id)
);
