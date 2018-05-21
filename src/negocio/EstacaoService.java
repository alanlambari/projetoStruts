package negocio;

import java.util.Hashtable;
import java.util.Map;

import banco.EstacaoDAO;

public class EstacaoService {
	
	private static EstacaoService instancia;
	
	private EstacaoService() {}
	
	public static synchronized EstacaoService getInstancia() {
		if(instancia == null) {
			instancia = new EstacaoService();
		}return instancia;
		
	}
	
	public Map<String, String> obterTodasEstacoes() {
		Map<String, String> mapEstacoes = new Hashtable<String, String>();
		try {
			EstacaoDAO estacaoDAO = new EstacaoDAO();
			mapEstacoes = estacaoDAO.obterTodasEstacoes();
		} catch (Exception e) {
			e.getMessage();
		}
		return mapEstacoes;
	}
}
