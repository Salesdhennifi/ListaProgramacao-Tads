import javax.swing.JOptionPane;
public class Ex4{
    public static void main(String[] args){
        //Faça um programa que leia a idade de uma pessoa em meses mostre a idade da pessoa em dias. 
        int idadeMeses = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade em Meses: "));

        int idadeDias = idadeMeses * 30;
        JOptionPane.showMessageDialog(null,"Você tem " +idadeDias + " Dias até hoje!");


    }
}