package reports.rest.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

import org.jboss.logging.Logger;

import reports.rest.model.DataPiece;
import reports.rest.model.QueryParamDTO;

@Stateless
public class DataPieceRetrieverEJBImpl implements DataPieceRetrieverEJBI {
	
	private Logger logger = Logger.getLogger(getClass());

	@Override
	public List<DataPiece> fetch(QueryParamDTO dto) {
		logger.info(" ********* At the EJB ********* ");
		List<DataPiece> items = new ArrayList<DataPiece>();
		
		String typeStr = dto.getType();
		
		List<String> types = new ArrayList<String>();
		if(typeStr!=null && !typeStr.isEmpty() && !typeStr.equalsIgnoreCase("null") )
			types = Arrays.asList( typeStr.split("[,]") );
		
		logger.info("--> types --> "+types);
		
		DataPiece dp = new DataPiece();
		dp.setType("import");
		dp.setAmount(BigDecimal.valueOf(100));
		
		if(types.contains("import"))
			items.add( dp );
		
		dp = new DataPiece();
		dp.setType("export");
		dp.setAmount(BigDecimal.valueOf(150));
		
		if(types.contains("export"))
			items.add( dp );
		
		dp = new DataPiece();
		dp.setType("domestic");
		dp.setAmount(BigDecimal.valueOf(75));
		
		if(types.contains("domestic"))
			items.add( dp );
		
		return items;
	}

}
