package loopSQL.logic;

import java.util.List;

import loopSQL.dto.SalesReportLine;
import loopSQL.mapper.SalesReportMapper;
import loopSQL.util.SessionBuilder;

public class SalesReport02 {

    public List<SalesReportLine> getReportData() throws Exception {

        var session = SessionBuilder.getInstance().getSession();
        var mapper = session.getMapper(SalesReportMapper.class);

        return mapper.selectReportData();
    }

    public static void main(String[] args) throws Exception {
        var report = new SalesReport02();

        long startTime = System.nanoTime();
        var result = report.getReportData();
        long endTime = System.nanoTime();

        System.out.println(result.size());
        System.out.println(((endTime - startTime) / 1000000) + " ms");
    }
}
