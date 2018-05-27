public class HashTable {
    private HashItem[] hashArray;

    public HashTable() {
        hashArray = new HashItem[Constants.TABLE_SIZE];
    }

    public int hash(int key) {
        return key % Constants.TABLE_SIZE;
    }

    public void put(int key, String value) {
        int hashArrayIndex = hash(key);

        while (hashArray[hashArrayIndex] != null) {
            hashArrayIndex = (hashArrayIndex + 1) % Constants.TABLE_SIZE;
        }

        hashArray[hashArrayIndex] = new HashItem(key, value);
    }

    public String get(int key) {
        int hashArrayIndex = hash(key);

        while (hashArray[hashArrayIndex] != null && hashArray[hashArrayIndex].getKey() != key) {
            hashArrayIndex = (hashArrayIndex + 1) % Constants.TABLE_SIZE;
        }

        return (hashArray[hashArrayIndex] == null) ? null : hashArray[hashArrayIndex].getValue();
    }
}
