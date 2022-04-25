package entities;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double custoAdicional;
	
	public FuncionarioTerceirizado() {
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicional * 1.1;
	}
}
