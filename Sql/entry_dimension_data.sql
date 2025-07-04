create table if not exists entry_dimension_data(
dimensions Integer not null,
ef_construction varchar(255) null,
entry_blkno varchar(255) null,
entry_offno char null,
entry_level varchar(255) null,
insert_page Integer null,
buildstate char null,
invalid_offset_number Integer null,
hnsw_meta_page_data varchar(255) null,
unlock_release_buffer varchar(255) null,
fork_num varchar(255) null,
constraint entry_dimension_data_pk primary key(dimensions));