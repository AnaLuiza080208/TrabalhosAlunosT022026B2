package Principal;

public class Refrigerante {

    private int estoque = 10;
    private double preco = 4.50;
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

	public void comprar() {
		if (estoque > 0) {
			estoque--;
			dinheiro += preco;
			System.out.println("Compra realizada com sucesso!");
		} else {
			System.out.println("Estoque esgotado!");
		}
	}
}
