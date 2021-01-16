alter table members add constraint members_PK primary key (member_id);
alter table orders add constraint orders_PK primary key (order_id);
alter table premium_prices add constraint premium_prices_PK primary key (item_id);
alter table standard_prices add constraint standard_prices_PK primary key (item_id);

create index idx_orders_01 on orders(order_member_id);
