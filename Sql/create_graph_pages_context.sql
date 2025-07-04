create table if not exists create_graph_pages_context(
fork_number varchar(255) not null,
hnsw_element_tuple varchar(255) null,
hnsw_neighbor_tuple varchar(255) null,
hnsw_element varchar(255) null,
hnsw_element_ptr varchar(255) null,
hnsw_new_buffer Integer null,
hnsw_init_page Integer null,
value_ptr varchar(255) null,
combined_size varchar(255) null,
ntup_size varchar(255) null,
etup_size varchar(255) null,
constraint create_graph_pages_context_pk primary key(fork_number));