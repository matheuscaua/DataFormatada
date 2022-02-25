import javax.swing.*;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args){
        Date data01 = new Date();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para mês: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para ano: "));

        data01.setDate(dia, mes, ano);

        System.out.print(data01.dataFormatada());

    }
}
