package com.kbstar.frame;

import java.util.List;

public interface MyDao<K, V> {
    public void insert(V v);
    public void delete(K K);
    public void update(V v);
    public V select (K k);
    public List<V> select();

}
