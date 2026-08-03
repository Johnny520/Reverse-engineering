package org.simpleframework.xml.util;

import org.simpleframework.xml.util.Entry;

/* JADX INFO: loaded from: classes2.dex */
public class Dictionary<T extends org.simpleframework.xml.util.Entry> extends java.util.AbstractSet<T> {
    protected final org.simpleframework.xml.util.Dictionary.Table<T> map;

    public static class Table<T> extends java.util.HashMap<java.lang.String, T> {
        public Table() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public Dictionary() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.Dictionary$Table r0 = new org.simpleframework.xml.util.Dictionary$Table
            r0.<init>()
            r1.map = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.util.Entry r1 = (org.simpleframework.xml.util.Entry) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(T r3) {
            r2 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r2.map
            java.lang.String r1 = r3.getName()
            java.lang.Object r3 = r0.put(r1, r3)
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public T get(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.util.Entry r2 = (org.simpleframework.xml.util.Entry) r2
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
            r1 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r1.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public T remove(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            org.simpleframework.xml.util.Entry r2 = (org.simpleframework.xml.util.Entry) r2
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
