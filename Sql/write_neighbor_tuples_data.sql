create table if not exists write_neighbor_tuples_data(
req_id Integer not null,
dimensions Integer null,
lw_lock_acquire varchar(255) null,
hnsw_add_heap_tid char null,
hnsw_neighbor_array varchar(255) null,
hnsw_candidate varchar(255) null,
hnsw_element varchar(255) null,
add_duplicate_in_memory Integer null,
add_element_in_memory varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint write_neighbor_tuples_data_pk primary key(req_id));