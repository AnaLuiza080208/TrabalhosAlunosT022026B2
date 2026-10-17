package Principal;

public class Refrigerante {

    private int estoque;
    private double preco;
    private double dinheiro;
    
    public Refrigerante() {
    
    }

    public Refrigerante(int estoque, double preco, double dinheiro) {
    	setEstoque(estoque);
    	setPreco(preco);
    	setDinheiro(dinheiro);
    	
    }

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
