package banco;

import java.util.Hashtable;
import java.util.Map;

public class EstacaoDAO {
	
	public Map<String, String> obterTodasEstacoes(){
		
		//ESSES DADOS PODE PASSAR PORA UMA TABELA EM UM BANCO DE DADOS,
		//NÃO FOI FEITO POR QUE ESSE NÃO ERA O OBJETIVO
		//ESSA TABELA TERIA 2 COLUNAS CHAVE(ID) E DESCRICAO DA ESTACAO
		Map<String, String> mapEstacoes = new Hashtable<String, String>();
		mapEstacoes.put("1", "DARTFORD");
		mapEstacoes.put("2", "DARTMOUTH");
		mapEstacoes.put("3", "TOWER HILL");
		mapEstacoes.put("4", "DERBY");
		mapEstacoes.put("5", "LIVERPOOL");
		mapEstacoes.put("6", "LIVERPOOL LIME STREET");
		mapEstacoes.put("7", "LIVERPOOL LIME STREET 2");
		mapEstacoes.put("8", "PADDINGTON");
		mapEstacoes.put("9", "EUSTON");
		mapEstacoes.put("10", "LONDON BRIDGE");
		mapEstacoes.put("11", "Corithians-Itaquera");
		mapEstacoes.put("12", "Artur Alvim");
		mapEstacoes.put("13", "Patriarca");
		mapEstacoes.put("14", "Guilhermina-Esperança");
		mapEstacoes.put("15", "Vila Matilde");
		mapEstacoes.put("16", "Penha");
		mapEstacoes.put("17", "Carrão");
		mapEstacoes.put("18", "Tatuapé");
		mapEstacoes.put("19", "Belém");
		mapEstacoes.put("20", "Bresser-Mooca");
		mapEstacoes.put("21", "Brás");
		mapEstacoes.put("22", "Pedro II");
		mapEstacoes.put("23", "Sé");
		mapEstacoes.put("24", "Anhangabaú");
		mapEstacoes.put("25", "República");
		mapEstacoes.put("26", "Santa Cecília");
		mapEstacoes.put("27", "Marechal Deodoro");
		mapEstacoes.put("28", "Palmeiras-Barra Funda");
		mapEstacoes.put("29", "Vila Prudente");
		mapEstacoes.put("30", "Tamanduateí");
		mapEstacoes.put("31", "Sacomã");
		mapEstacoes.put("32", "Alto do Ipiranga");
		mapEstacoes.put("33", "Santos-Imigrantes");
		mapEstacoes.put("34", "Chácara Klabin");
		mapEstacoes.put("35", "Ana Rosa");
		mapEstacoes.put("36", "Paraíso");
		mapEstacoes.put("37", "Brigadeiro");
		mapEstacoes.put("38", "Trianon-Masp");
		mapEstacoes.put("39", "Consolação");
		mapEstacoes.put("40", "Clínicas");
		mapEstacoes.put("41", "S.N. Sra. de Fátima - Sumaré");
		mapEstacoes.put("42", "Vila Madalena");
		mapEstacoes.put("43", "Jabaquara");
		mapEstacoes.put("44", "Conceição");
		mapEstacoes.put("45", "São Judas");
		mapEstacoes.put("46", "Saúde");
		mapEstacoes.put("47", "Praça da Árvore");
		mapEstacoes.put("48", "Santa Cruz");
		mapEstacoes.put("49", "Vila Mariana");
		mapEstacoes.put("50", "Ana Rosa");
		mapEstacoes.put("51", "Paraíso");
		mapEstacoes.put("52", "Vergueiro");
		mapEstacoes.put("53", "São Joaquim");
		mapEstacoes.put("54", "Liberdade");
		mapEstacoes.put("55", "São Bento");
		mapEstacoes.put("56", "Luz");
		mapEstacoes.put("57", "Tiradentes");
		mapEstacoes.put("58", "Armênia");
		mapEstacoes.put("59", "Portuguesa-Tiête");
		mapEstacoes.put("60", "Carandiru");
		mapEstacoes.put("61", "Santana");
		mapEstacoes.put("62", "Jardim São Paulo- Ayrton Senna");
		mapEstacoes.put("63", "Parada Inglesa");
		mapEstacoes.put("64", "Tucurivi");
		return mapEstacoes;
	}
	

}
