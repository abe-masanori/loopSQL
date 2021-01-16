package loopSQL.dto;

public class SalesReportLine {

    public SalesReportLine(int userId, int totalAmount) {
        this.memberId = userId;
        this.totalAmount = totalAmount;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    int memberId;

    int totalAmount;
}
