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

        System.out.println("result of sum: " + sumOfInt(numberInt,7));

        System.out.println("Character: " + charPrint(character));;

        System.out.println("result of sum: " + sumOfInteger(objectInt,9));

        System.out.println("Character: " + objectCharPrint(objectChar));

    }
    public static int sumOfInt(int n1, int n2){
        return  n1+n2;
    }
    public static char charPrint(char character){
        return character;
    }
    public static Integer sumOfInteger(Integer number1, Integer number2){
        return number1+number2;
    }
    public static Character objectCharPrint(Character characterObj){
        return characterObj;
    }
}