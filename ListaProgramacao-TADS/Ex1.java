import javax.swing.JOptionPane;
public class Ex1{
    public static void main(String[] args){
        //Faça um programa que leia a idade de uma pessoa em anos e mostre a idade da pessoa em meses. 

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade: "));
         
        int idademeses = idade * 12;

        JOptionPane.showMessageDialog(null,"A sua idade em Meses é " + idademeses);
    


    }
}