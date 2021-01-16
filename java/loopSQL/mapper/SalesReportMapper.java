package loopSQL.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import loopSQL.dto.Member;
import loopSQL.dto.Order;
import loopSQL.dto.Price;
import loopSQL.dto.SalesReportLine;

public interface SalesReportMapper {

	List<Member> selectAllMembers();

	List<Order> selectOrders(int memberId);

	Price selectPremiumPrice(int itemId);

	Price selectStandardPrice(int itemId);

	List<SalesReportLine> selectReportData();

	@MapKey("itemId")
	Map<Integer, Price> selectAllPremiumPrices();

	@MapKey("itemId")
	Map<Integer, Price> selectAllStandardPrices();

}
