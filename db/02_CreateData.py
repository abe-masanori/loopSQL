import random

# MEMBERS
with open('members.csv', mode = 'w') as f:
  for i in range(100000):
    member_id = str(i + 1)
    flag = 'Y' if (i % 10) < 4 else 'N'
    
    f.write(','.join([member_id, flag]) + '\n')

# STANDARD_PRICES
random.seed(20210111)
with open('standard_prices.csv', mode = 'w') as f:
  for i in range(1000000):
    item_id = str(i + 1)
    price = str(random.randrange(100, 200))
    
    f.write(','.join([item_id, price]) + '\n')

# PREMIUM_PRICES
random.seed(20210111)
with open('premium_prices.csv', mode = 'w') as f:
  for i in range(1000000):
    item_id = str(i + 1)
    price = str(random.randrange(100, 200) * 80 / 100)
    
    if (i % 10) == 0:
      f.write(','.join([item_id, price]) + '\n')

# ORDERS
with open('orders.csv', mode = 'w') as f:
  for i in range(100000):
    for j in range(10):
      order_id = str(i * 10 + j + 1)
      member_id = str(i + 1)
      order_date = '2021-01-11'
      item_id = str(random.randrange(0, 1000000) + 1)
      quantity = str(random.randrange(5) + 1)
      
      f.write(','.join([order_id, member_id, order_date, item_id, quantity]) + '\n')
