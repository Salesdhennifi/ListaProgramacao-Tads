import javax.swing.JOptionPane;
public class Ex5{
    public static void main(String[] args){
        //Faça um programa que leia a idade de uma pessoa em dias e mostre a idade da pessoa em anos. 
        int idadeDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade em Dias: "));
        int idadeAnos = idadeDias /365;
        JOptionPane.showMessageDialog(null,"A sua idade em Anos é " + idadeAnos);


    }
}