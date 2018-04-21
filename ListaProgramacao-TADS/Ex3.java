import javax.swing.JOptionPane;
public class Ex3{
    public static void main(String[] args){
        //Faça um programa que leia a idade de uma pessoa em meses e mostre a idade da pessoa em anos. 

        int idadeMeses = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade em Meses: "));
        int idadeAnos = idadeMeses / 12;
        JOptionPane.showMessageDialog(null,"Sua idade é " + idadeAnos + "  Anos!");


    }
}
