import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArrecadacaoDetran {
    public static void main(String[] args) {
        int numberOfDrivers = 0;

        List<Person> drivers = new ArrayList<Person>();

        while (true) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da carteira do motorista" + numberOfDrivers));
            if (id == 0) { break; }
            int numberOfTickets = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de multas do motorista" + numberOfDrivers));
            double[] ticketsValues = new double[numberOfTickets];
            for(int ticketCounter = 0; ticketCounter++; ticketCounter < numberOfTickets) {
                double value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da multa número" + ticketCounter));
            }

            Person newPerson = new Person();
            newPerson.age = age;
            newPerson.height = height;
            newPerson.weight = weight;

            people.add(newPerson);
            numberOfPeople++;
        }
    }

    private static class Driver {
        int id;
        int numberOfTickets;
        double[] ticketsPrice;
    }
}