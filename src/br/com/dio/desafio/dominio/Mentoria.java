package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudo {

    private java.util.Date data;
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
        public Mentoria(){

    }
    public java.util.Date getData() {
        return data;
    }
    public void setData(java.util.Date data) {
        this.data = data;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
