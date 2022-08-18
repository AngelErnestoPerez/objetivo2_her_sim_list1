package model;

public class GerenteDesenvolvedor extends Gerente{
    public GerenteDesenvolvedor() {
        super();
    }

    public GerenteDesenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvedor{Bonus= " + getBonus()
                + ", Nome= " + getNome()
                + ", Salario= " + getSalario()
                + "}";
    }
}
