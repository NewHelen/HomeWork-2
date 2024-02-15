public class MyHashMap <K,V>{
    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V> [] entries = new Entry[DEFAULT_SIZE];
    private int size;

    public void put(K key, V value) {
        int index = getBucketIndex(key); // getIndex
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (entries[index] == null) {
            entries[index] = newEntry;
        } else {
            Entry<K, V>  current = entries[index];
            Entry<K, V>  prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }

            prev.next = newEntry;
        }
        size++;
    }

    public V get(K key) {
        int index = getBucketIndex(key);

            while (entries[index] != null) {
                if (entries[index].key.equals(key)) {
                    return entries[index].value;
                }
                entries[index] = entries[index].next;
            }
        return null;
    }

    public int size (){
        return size;
    }


    public void remove (K key){
        int index = getBucketIndex(key);
        Entry<K, V> current = entries[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    entries[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        entries = new Entry[DEFAULT_SIZE];
        size = 0;
    }

    // getIndex
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }

    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
