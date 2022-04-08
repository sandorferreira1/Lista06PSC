import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CalculoAntropometrico {
    public static void main(String[] args) {
        int numberOfPeople = 0;

        List<Person> people = new ArrayList<Person>();

        while (true) {
            int age = Integer.parseInt(JOptionPane.showInputDialog("Idade da Pessoa número " + numberOfPeople));
            if (age == 0) { break; }
            double height = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa número " + numberOfPeople));
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa número " + numberOfPeople));

            Person newPerson = new Person();
            newPerson.age = age;
            newPerson.height = height;
            newPerson.weight = weight;

            people.add(newPerson);
            numberOfPeople++;
        }


        if (numberOfPeople >= 1) {
            int peopleOverFifty = getPeopleOverFifty(people);
            double mediumHeight = getMediumHeight(people);
            double fortyPercentage = getUnderFourtyKilosPercentage(people);

            String message = "Pessoas com idade superior a 50 anos: " + peopleOverFifty + "\n" +
            "Média das alturas de pessoas entre 10 e 20 anos: " + mediumHeight + "\n" +
            "Percentual de pessoas abaixo de 40kg: " + fortyPercentage;

            JOptionPane.showMessageDialog(null, message);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível calcular as médias com " + numberOfPeople + " pessoas.");
        }

    }

    private static int getPeopleOverFifty(List<Person> people) {
        int arrayIndex = people.size() - 1;
        int peopleCounter = 0;

        while(arrayIndex >= 0) {
            if (people.get(arrayIndex).age >= 50) {
                peopleCounter++;
            }
        arrayIndex--;
        }

        return peopleCounter;
    }

    private static double getMediumHeight(List<Person> people) {
        int arrayIndex = people.size() - 1;
        double heightAcumulator = 0;
        int numberOfPeople = 0;

        while(arrayIndex >= 0) {
            if (people.get(arrayIndex).age >= 10 && people.get(arrayIndex).age <= 20) {
                heightAcumulator += people.get(arrayIndex).height;
                numberOfPeople++;
            }
        arrayIndex--;
        }

        return heightAcumulator / numberOfPeople;
    }

    private static double getUnderFourtyKilosPercentage(List<Person> people) {
        int arrayIndex = people.size() - 1;
        double numberOfPeopleUnderFourtyKilos = 0;
        double numberOfTotalPeople = new Double(people.size());

        while(arrayIndex >= 0) {
            if (people.get(arrayIndex).weight < 40.0) {
                numberOfPeopleUnderFourtyKilos++;
            }
        arrayIndex--;
        }

        return numberOfPeopleUnderFourtyKilos / numberOfTotalPeople;
    }

    private static class Person {
        private double height;
        private double weight;
        private int age;
    }
}