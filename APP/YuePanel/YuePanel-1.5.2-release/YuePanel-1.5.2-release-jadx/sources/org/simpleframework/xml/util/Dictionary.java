package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import org.simpleframework.xml.util.Entry;

/* JADX INFO: loaded from: classes2.dex */
public class Dictionary<T extends Entry> extends AbstractSet<T> {
    protected final Table<T> map = new Table<>();

    public static class Table<T> extends HashMap<String, T> {
    }

    public T get(String str) {
        return this.map.get(str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return this.map.values().iterator();
    }

    public T remove(String str) {
        return this.map.remove(str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        return this.map.put(t.getName(), t) != null;
    }
}
