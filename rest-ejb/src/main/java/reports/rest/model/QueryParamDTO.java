package reports.rest.model;

import java.io.Serializable;

public class QueryParamDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1924234232L;
	
	private String dateFrom;
	private String dateTo;
	private String type;
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nQueryParamDTO \n[\n\tdateFrom=");
		builder.append(dateFrom);
		builder.append(", \n\tdateTo=");
		builder.append(dateTo);
		builder.append(", \n\ttype=");
		builder.append(type);
		builder.append("\n]\n\n");
		return builder.toString();
	}
	
	
	

}
