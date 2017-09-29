package nagoya.code4.resas.forestry;

import java.util.List;

public class AbstractForestryIncome<T> {

	private String prefCode;
	private String prefName;
	private String cityCode;
	private String cityName;
	private List<T> years;

	public AbstractForestryIncome() {
		super();
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<T> getYears() {
		return years;
	}

	public void setYears(List<T> years) {
		this.years = years;
	}

}