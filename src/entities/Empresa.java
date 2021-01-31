package entities;

public class Empresa {
	
	private Integer idEmpresa;
	private String razaoSocial;
	private String Cnpj;
	
	
	
	public Empresa() {
		
	}

	public Empresa(Integer idEmpresa, String razaoSocial, String cnpj) {
		super();
		this.idEmpresa = idEmpresa;
		this.razaoSocial = razaoSocial;
		Cnpj = cnpj;
	}

	
	
	
	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empresa -> IdEmpresa: " + idEmpresa + ", Razão Social: " + razaoSocial + ", CNPJ: " + Cnpj;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Empresa) {
			Empresa empresa = (Empresa) obj;
			return this.idEmpresa.equals(empresa.getIdEmpresa());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.idEmpresa.hashCode();
	}
	
	
	
	

}
