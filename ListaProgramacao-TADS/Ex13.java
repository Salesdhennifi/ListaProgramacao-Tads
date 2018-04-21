import javax.swing.JOptionPane;
public class Ex13{
    public static void main(String[] args){
        //Faça um programa que leia dois números inteiros, faça a soma e escreva o resultado
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite mais um numero: "));

        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"O Resultado da soma é: " + soma);

    }
}