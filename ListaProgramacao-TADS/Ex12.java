import javax.swing.JOptionPane;
public class Ex12{
    public static void main(String[] args){
        //Faça um programa que leia um número inteiro que representa
        // uma quantidade de tempo em horas e mostre o tempo correspondente em segundos.
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null,"informe os Horas: "));
        int segundos = (horas * 60) * 60;
        JOptionPane.showMessageDialog(null,"As Horas são no total:  " + segundos + " Segundos");
    }

    }
