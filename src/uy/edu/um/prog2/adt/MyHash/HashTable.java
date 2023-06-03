package uy.edu.um.prog2.adt.MyHash;

public interface HashTable<K, V> {
    void put (K key, V value);
    boolean contains (K key);
    void remove (K key);
}
