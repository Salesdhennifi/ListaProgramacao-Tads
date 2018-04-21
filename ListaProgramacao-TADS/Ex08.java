import javax.swing.JOptionPane;
public class Ex08{
    public static void main(String[] args){
        //Faça um programa que leia um número inteiro 
        //que representa uma quantidade de tempo em segundos e mostre o tempo correspondente em minutos. 
        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os segundos: "));
        int minutos = segundos / 60;
        JOptionPane.showMessageDialog(null,"Os Segundos no total são: " + minutos + " Minutos!");

    }
}