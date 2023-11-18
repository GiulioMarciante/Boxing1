//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati
public class Main {
    public static void main(String[] args) {
        int numberInt = 16;
        Integer objectInt = numberInt;

        double numberDouble = 3.5;
        Double objectDouble = numberDouble;

        char character = '&';
        Character objectChar = character;

        sumOfInt(numberInt,7);

        charPrint(character);

        sumOfInteger(objectInt,9);

        objectCharPrint(objectChar);

    }
    public static void sumOfInt(int n1, int n2){
        int sum = n1+n2;
        System.out.println("result of sum: " + sum);
    }
    public static void charPrint(char character){
        System.out.println("Character: " + character);
    }
    public static void sumOfInteger(Integer number1, Integer number2){
        int sum =number1+number2;
        System.out.println("result of sum: " + sum);
    }
    public static void objectCharPrint(Character characterObj){
        System.out.println("Character: " + characterObj);
    }
}