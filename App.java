public class App {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");

        System.out.println(hashTable.get(2));
    }    
}