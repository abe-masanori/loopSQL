create table members (
  member_id NUMBER(10) not null
  , premium_member_flag VARCHAR2(1) not null
);

create table orders (
  order_id NUMBER(10) not null
  , order_member_id NUMBER(10) not null
  , order_date DATE not null
  , order_item_id NUMBER(10) not null
  , order_quantity NUMBER(3) not null
);

create table premium_prices (
  item_id NUMBER(10) not null
  , item_price NUMBER(10) not null
);

create table standard_prices (
  item_id NUMBER(10) not null
  , item_price NUMBER(10) not null
);
