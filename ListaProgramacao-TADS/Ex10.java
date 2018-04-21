import javax.swing.JOptionPane;
public class Ex10{
    public static void main(String[] args){
        //Faça um programa que leia um número inteiro que representa
        // uma quantidade de tempo em minutos e mostre o tempo correspondente em segundos. 
        int minutos = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os minutos: "));
        int segundos = minutos * 60;

        JOptionPane.showMessageDialog(null,"Os minutos no total são: " + segundos + " Segundos");
    }
}