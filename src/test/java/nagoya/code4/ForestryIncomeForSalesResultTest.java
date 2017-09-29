package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.forestry.ForestryIncomeForSales;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRequest;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesResult;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesResultData;

public class ForestryIncomeForSalesResultTest {

	@Test
	public void test() throws ParseException, IOException {
		
		
		
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("11362");
		paramValues.add("11");
		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + ForestryIncomeForSalesRequest.url,
				params.toString());

		System.out.println(result);
		ForestryIncomeForSalesResult resultData = om.readValue(result,
				ForestryIncomeForSalesResult.class);

		ForestryIncomeForSales a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());


		System.out.println("label : " + a.getLabel());
		
		for(ForestryIncomeForSalesResultData data : a.getYears()){
			
			System.out.println("year : " + data.getYear());
			System.out.println("value : " + data.getValue());
			
		}
	}
}
