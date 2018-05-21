package banco;

import java.util.Hashtable;
import java.util.Map;

public class EstacaoDAO {
	
	public Map<String, String> obterTodasEstacoes(){
		
		//ESSES DADOS PODE PASSAR PORA UMA TABELA EM UM BANCO DE DADOS,
		//N�O FOI FEITO POR QUE ESSE N�O ERA O OBJETIVO
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
		mapEstacoes.put("14", "Guilhermina-Esperan�a");
		mapEstacoes.put("15", "Vila Matilde");
		mapEstacoes.put("16", "Penha");
		mapEstacoes.put("17", "Carr�o");
		mapEstacoes.put("18", "Tatuap�");
		mapEstacoes.put("19", "Bel�m");
		mapEstacoes.put("20", "Bresser-Mooca");
		mapEstacoes.put("21", "Br�s");
		mapEstacoes.put("22", "Pedro II");
		mapEstacoes.put("23", "S�");
		mapEstacoes.put("24", "Anhangaba�");
		mapEstacoes.put("25", "Rep�blica");
		mapEstacoes.put("26", "Santa Cec�lia");
		mapEstacoes.put("27", "Marechal Deodoro");
		mapEstacoes.put("28", "Palmeiras-Barra Funda");
		mapEstacoes.put("29", "Vila Prudente");
		mapEstacoes.put("30", "Tamanduate�");
		mapEstacoes.put("31", "Sacom�");
		mapEstacoes.put("32", "Alto do Ipiranga");
		mapEstacoes.put("33", "Santos-Imigrantes");
		mapEstacoes.put("34", "Ch�cara Klabin");
		mapEstacoes.put("35", "Ana Rosa");
		mapEstacoes.put("36", "Para�so");
		mapEstacoes.put("37", "Brigadeiro");
		mapEstacoes.put("38", "Trianon-Masp");
		mapEstacoes.put("39", "Consola��o");
		mapEstacoes.put("40", "Cl�nicas");
		mapEstacoes.put("41", "S.N. Sra. de F�tima - Sumar�");
		mapEstacoes.put("42", "Vila Madalena");
		mapEstacoes.put("43", "Jabaquara");
		mapEstacoes.put("44", "Concei��o");
		mapEstacoes.put("45", "S�o Judas");
		mapEstacoes.put("46", "Sa�de");
		mapEstacoes.put("47", "Pra�a da �rvore");
		mapEstacoes.put("48", "Santa Cruz");
		mapEstacoes.put("49", "Vila Mariana");
		mapEstacoes.put("50", "Ana Rosa");
		mapEstacoes.put("51", "Para�so");
		mapEstacoes.put("52", "Vergueiro");
		mapEstacoes.put("53", "S�o Joaquim");
		mapEstacoes.put("54", "Liberdade");
		mapEstacoes.put("55", "S�o Bento");
		mapEstacoes.put("56", "Luz");
		mapEstacoes.put("57", "Tiradentes");
		mapEstacoes.put("58", "Arm�nia");
		mapEstacoes.put("59", "Portuguesa-Ti�te");
		mapEstacoes.put("60", "Carandiru");
		mapEstacoes.put("61", "Santana");
		mapEstacoes.put("62", "Jardim S�o Paulo- Ayrton Senna");
		mapEstacoes.put("63", "Parada Inglesa");
		mapEstacoes.put("64", "Tucurivi");
		return mapEstacoes;
	}
	

}
