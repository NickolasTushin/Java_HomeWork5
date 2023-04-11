
    import java.util.*;

    public class Task2 {
        public static void main(String[] args) {
            List<String> employees = new ArrayList<>();
            employees.add("Иван Иванов");
            employees.add("Светлана Петрова");
            employees.add("Кристина Белова");
            employees.add("Анна Мусина");
            employees.add("Анна Крутова");
            employees.add("Иван Юрин");
            employees.add("Петр Лыков");
            employees.add("Павел Чернов");
            employees.add("Петр Чернышов");
            employees.add("Мария Федорова");
            employees.add("Марина Светлова");
            employees.add("Мария Савина");
            employees.add("Мария Рыкова");
            employees.add("Марина Лугова");
            employees.add("Анна Владимирова");
            employees.add("Иван Мечников");
            employees.add("Петр Петин");
            employees.add("Иван Ежов");
    
            Map<String, Integer> nameCount = new HashMap<>();
    
            for (String employee : employees) {
                String firstName = employee.split(" ")[0];
                nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
            }
    
            List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
            sortedNames.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    
            System.out.println("Повторяющиеся имена с количеством повторений:");
            for (Map.Entry<String, Integer> entry : sortedNames) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }
    
