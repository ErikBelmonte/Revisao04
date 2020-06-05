package revisao04;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Revisao04 {
    public static void main(String[] args) {
        /* Elabore um algoritmo que calcule o que deve ser pago por um produto, 
        considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
        Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
        Código Condição de pagamento - Código: 1 -> À vista em dinheiro ou cheque, recebe 10% de desconto;
        -Código: 2 -> À vista no cartão de crédito, recebe 15% de desconto; - 
        Código: 3 -> Em duas vezes, preço normal de etiqueta sem juros; - 
        Código: 4 -> Em duas vezes, preço normal de etiqueta mais juros de 10% - */
        String name; 
        int codigo;
        DecimalFormat f = new DecimalFormat("0.00");
        
        name = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Boa tarde, "+name+"!");
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Códigos de condição de pagamento: \n---------------------------------\n"+
                "Código 1- À vista em dinheiro ou cheque, 10% desc; \n---------------------------------\n"+
                "Código 2- À vista no cartão de crédito, 15% desc; \n---------------------------------\n"+
                "Código 3- Em duas vezes, preço normal de etiqueta sem juros; \n---------------------------------\n"+
                "Código 4- Em duas vezes, preço normal de etiqueta, juros de 10%; \n---------------------------------\n"));
        switch (codigo){
                case 1:
                    double price1, priceDiscount;
                    price1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));
                    priceDiscount = ((price1 * 10)/100);
                    price1 = price1 - priceDiscount;
                    JOptionPane.showMessageDialog(null, "Você deverá pagar: R$"+f.format(price1));
                    break;
                case 2:
                    double price2, priceDiscount2;
                    price2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));
                    priceDiscount2 = ((price2 * 15)/100);
                    price2 = price2 - priceDiscount2;
                    JOptionPane.showMessageDialog(null, "Você deverá pagar: R$"+f.format(price2));
                    break;
                case 3:
                    double price3, priceDiscount3;
                    price3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));
                    priceDiscount3 = price3/2;
                    price3 = price3 - priceDiscount3;
                    JOptionPane.showMessageDialog(null, "Você deverá pagar dois meses de: R$"+f.format(price3));
                    break;
                case 4:
                    double price4, tax, taxF;
                    int x;
                    price4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));
                    x = 2;
                    tax = ((price4 * 10)/100)* x;
                    taxF = tax + price4;
                    JOptionPane.showMessageDialog(null, "Você pagará no total de: R$"+f.format(taxF));
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Apenas de 1 até 4, Sr."+name);
                break;
        }
    }   
}
