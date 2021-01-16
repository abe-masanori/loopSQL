package loopSQL.logic;

import java.util.ArrayList;
import java.util.List;

import loopSQL.dto.Order;
import loopSQL.dto.SalesReportLine;
import loopSQL.mapper.SalesReportMapper;
import loopSQL.util.SessionBuilder;

public class SalesReport01 {

    public List<SalesReportLine> getReportData() throws Exception {

        var list = new ArrayList<SalesReportLine>();

        var session = SessionBuilder.getInstance().getSession();
        var mapper = session.getMapper(SalesReportMapper.class);

        var members = mapper.selectAllMembers();

        for (var member : members) {
            int totalAmount = 0;

            var orders = mapper.selectOrders(member.getMemberId());

            for (Order order : orders) {
                if (member.getPremiumMemberFlag().equals("Y")) {
                    var price = mapper.selectPremiumPrice(order.getOrderItemId());

                    if (price != null) {
                        totalAmount += order.getOrderQuantity() * price.getItemPrice();
                        continue;
                    }
                }

                var price = mapper.selectStandardPrice(order.getOrderItemId());
                totalAmount += order.getOrderQuantity() * price.getItemPrice();
            }

            list.add(new SalesReportLine(member.getMemberId(), totalAmount));
        }

        return list;
    }

    public static void main(String[] args) throws Exception {
        var report = new SalesReport01();

        long startTime = System.nanoTime();
        var result = report.getReportData();
        long endTime = System.nanoTime();

        System.out.println(result.size());
        System.out.println(((endTime - startTime) / 1000000) + " ms");
    }

}
