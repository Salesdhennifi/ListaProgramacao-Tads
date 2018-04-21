import javax.swing.JOptionPane;
public class Ex2{
    public static void main(String[] args){

        //Faça um programa que leia a idade de uma pessoa em anos e mostre a idade da pessoa em dias. 
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua Idade: "));

        int idadeDias = idadeAnos * 365;

        JOptionPane.showMessageDialog(null,"A sua idade em dias é " + idadeDias);
    

    }
}