package action;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import negocio.EstacaoService;
 
public class ScriptInicialAction extends Action {
    
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try{
	 		 FileWriter arquivoJS = new FileWriter(criarArquivoJS(request));
	 		 EstacaoService estacoes = EstacaoService.getInstancia();
	 		 BufferedWriter escrever = new BufferedWriter (arquivoJS);
	 		 escrever.write(this.criarConteudoJS(estacoes.obterTodasEstacoes()));
	 		 escrever.close();
		} catch (Exception e) {
			e.getMessage();
		}
        return(mapping.findForward("success"));
    }
	
	public String criarConteudoJS(Map<String, String>mapEstacoes) {
		StringBuffer conteudoJS = new StringBuffer();
		try {
			conteudoJS.append("var estacoes = {");
			int tamanhoIteracao = mapEstacoes.keySet().size();
			Set<String> chaves = mapEstacoes.keySet();	
			int aux = 1;
			for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();){
				String chave = iterator.next();
				if(chave != null) {
					if(tamanhoIteracao == aux) {
						conteudoJS.append(" \""+ chave +"\": \"" + mapEstacoes.get(chave) + "\"");
					}else {
						conteudoJS.append(" \""+ chave +"\": \"" + mapEstacoes.get(chave) + "\",");
					}
					aux++;
				}
			}
			conteudoJS.append("}");
		} catch (Exception e) {
            e.getMessage();
		}
		return conteudoJS.toString();
	}
	
	
	@SuppressWarnings("deprecation")
	public String criarArquivoJS( HttpServletRequest request) {
		String caminho = null;
		try {
			  caminho = request.getRealPath(request.getContextPath());
		      caminho =  caminho.substring(0, caminho.length() - request.getContextPath().length());
		      caminho = caminho + "\\scripts\\estacoes.js";
		} catch (Exception e) {
			e.getMessage();
		}
	    return caminho;
	}
	
}

   