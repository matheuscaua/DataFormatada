public class Date {
    private int dia;
    private int mes;
    private int ano;

    public void setDate(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String dataFormatada(){
        return String.format("%d / %d / %d", dia, mes, ano) ;
    }
}


