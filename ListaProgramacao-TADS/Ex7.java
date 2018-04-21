import javax.swing.JOptionPane;
public class Ex7{
    public static void main(String[] args){
        //Faça um programa que leia um número inteiro 
        //que representa uma quantidade de tempo em segundos e mostre o tempo correspondente em horas

        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null,"informe os Segundos: "));
        int horas = segundos / 60;
        JOptionPane.showMessageDialog(null,"Os Segundos são no total:  " + horas + " Hrs!");
    }
}