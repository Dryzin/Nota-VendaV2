package view;
import model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        sale.getCp().addProduct("Carne Patinho", 30);
        sale.getCp().addProduct("Extrato de Tomate", 20);

        sale.addSaleItem(sale.getCp().getProducts().get(0), 2);
        sale.addSaleItem(sale.getCp().getProducts().get(1), 1);

        sale.printSaleItens();

        System.out.println(String.format("Total: %.2f", sale.getTotal()));

    }
}
