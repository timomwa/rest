package reports.rest.rest;

import java.util.List;
import java.util.logging.Logger;

//import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import reports.rest.model.DataPiece;
import reports.rest.model.QueryParamDTO;
import reports.rest.service.DataPieceRetrieverEJBI;

@Path("/report")
@RequestScoped
public class MarketDataREST {
	
	 @Inject
	 private Logger logger;
	
	@Inject
	private DataPieceRetrieverEJBI dataPieceRetrieverEJB;
	
	@Path("/get")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.TEXT_XML})
	public List<DataPiece> get(
			@QueryParam("dateFrom") String dateFrom,
			@QueryParam("dateTo") String dateTo,
			@QueryParam("type") String type){
		
		QueryParamDTO dto = new QueryParamDTO();
		dto.setDateFrom(dateFrom);
		dto.setDateTo(dateTo);
		dto.setType(type);
		
		logger.info("--> dto --> "+dto);
		
		
		List<DataPiece> items = dataPieceRetrieverEJB.fetch(dto);
		
		return items;
		
	}
	

}
