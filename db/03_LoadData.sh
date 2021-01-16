#!/bin/sh

userid='test/We1c0meABC@PDB'
extab='external_table=NOT_USED'
path='direct=yes'

for tab in members orders premium_prices standard_prices
do
    sqlldr ${userid} ${extab} ${path} data=${tab}.csv table=${tab}
done
