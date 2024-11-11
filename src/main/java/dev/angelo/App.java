package dev.angelo;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
        public static void main(String[] args) {
            
            Person person1 = new Person("Angelo", "Colmenares", "191453108", 2005, "Venezuela", 'M');
            Person person2 = new Person("Anyela", "Salazar", "14382930", 1978, "venezuela", 'F');
    
            
            System.out.println("Person 1 Details:");
            person1.printDetails();
    
            System.out.println("\nPerson 2 Details:");
            person2.printDetails();
        }
    
}
