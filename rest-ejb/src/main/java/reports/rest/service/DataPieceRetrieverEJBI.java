package reports.rest.service;

import java.util.List;

import reports.rest.model.DataPiece;
import reports.rest.model.QueryParamDTO;


public interface DataPieceRetrieverEJBI {

	List<DataPiece> fetch(QueryParamDTO dto);

}
