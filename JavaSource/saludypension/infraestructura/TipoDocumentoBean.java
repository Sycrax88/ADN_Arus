package saludypension.infraestructura;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import saludypension.dominio.modelo.TipoDocumento;

@ManagedBean(name="tipoDocumentoBean")
@RequestScoped
public class TipoDocumentoBean {
	
	private List<TipoDocumento> tiposDocumentos;

	@PostConstruct
	public void init() {
		tiposDocumentos = Arrays.asList(TipoDocumento.values());
		System.out.println(tiposDocumentos);
	}
	
	public List<TipoDocumento> getTiposDocumentos() {
		return tiposDocumentos;
	}

	public void setTiposDocumentos(List<TipoDocumento> tiposDocumentos) {
		this.tiposDocumentos = tiposDocumentos;
	}


}
