import javax.swing.*;

public class imc {

    public static void main(String[] args) {

        String nome;
        int age;
        double height, peso, imc, pesoIdeal = 55;


        JOptionPane.showInputDialog("Como voce se identifica?"
                + "\n 1 - Homem"
                + "\n 2 - Mulher"
                + "\n 3 - Pizza");


        nome = JOptionPane.showInputDialog("Qual é o seu nome?");

        age = Integer.parseInt(JOptionPane.showInputDialog("Olá, " + nome + ", quantos anos você tem?"));

        if (age >= 60) {
            JOptionPane.showMessageDialog(null, "Nossa como você é velho(a) hein!");
        } else {
            JOptionPane.showMessageDialog(null, "hummm... ta novinho(a) ainda");
        }


        String profissao = JOptionPane.showInputDialog("Qual é a sua profissão: ");

        switch (profissao) {
            case "desempregado":
            case "desempregada":
                JOptionPane.showMessageDialog(null, "Sinto muito... :(");
                break;
            case "estudante":
            case "Estudante":
                JOptionPane.showMessageDialog(null, "Que lindo(a), continue assim!");
                break;
            case "artista":
            case "desenhista":
                JOptionPane.showMessageDialog(null, "Me desenha aí");
                break;
            case "maqueadora":
            case "maquiadora":
                JOptionPane.showMessageDialog(null, "Você é uma maquiadora TOP!");
                break;
            case "policial":
                JOptionPane.showMessageDialog(null, "legal");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você é um(a) " + profissao + " Incrível");
                break;
        }

        height = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"
                + "\n Utilize (.) no lugar de (,)"));

        peso = Double.parseDouble(JOptionPane.showInputDialog("E o seu peso? não seja tímido(a), fale a verdade!"
                + "\n Utilize (.) no lugar de (,)"));

        imc = peso / (height * height);

        if (imc <= 18.5) {
            JOptionPane.showMessageDialog(null, "Atenção!!! "
                    + "\n BAIXO PESO, vá se alimentar, vá! "
                    + "\n Ainda falta " + (pesoIdeal - peso) + "Kg pra você atingir o valor do imc considerado normal!!!");
        } else if (imc > 18.5 && imc <= 24.99) {
            JOptionPane.showMessageDialog(null, "Peso considerado saudável, Parabéns!");
        } else if (imc >= 25 && imc <= 29.99) {
            JOptionPane.showMessageDialog(null, "ATENNÇÃÃÃOO!!! "
                    + "\n EXCESSO DE PESO! Você se encontra perto da classe de obsidade nível I "
                    + "\n Você precisa perder " + (peso - pesoIdeal) + "Kg para estar no peso ideal!");
        } else if (imc >= 30 && imc <= 34.99) {
            JOptionPane.showMessageDialog(null, "ATENÇÃOO!! "
                    + "\n Obsidade nível I "
                    + "\n Você precisa perder " + (peso - pesoIdeal) + " Kg para estar no peso ideal!");
        } else if (imc >= 35 && imc <= 39.99) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO!!! "
                    + "\n Obsidade nível II "
                    + "\n Você precisa perder " + (peso - pesoIdeal) + " Kg para estar no peso ideal!");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "ATENÇÃOO!!! "
                    + "\n Obsidade Extrema Grau III "
                    + "\n Você precisa perder " + (peso - pesoIdeal) + " Kg para estar no peso ideal!");
        }
    }
}
