import javax.swing.JOptionPane;
public class Ex6{
    public static void main(String[] args){
        //Faça um programa que leia a idade de uma pessoa em dias e mostre a idade da pessoa em meses. 
        int idadeDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade em Dias: "));
        int idadeMeses = idadeDias / 30;
        JOptionPane.showMessageDialog(null,"Sua idade em meses é " + idadeMeses);
        
    }
}