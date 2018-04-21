import javax.swing.JOptionPane;
public class Ex11{
    public static void main(String[] args){
        //Faça um programa que leia um número inteiro que representa 
        //uma quantidade de tempo em horas e mostre o tempo correspondente em minutos. 
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe as Horas: "));
        int minutos = horas * 60;

        JOptionPane.showMessageDialog(null,"As Horas no total são: " + minutos + " Minutos");

    }
}