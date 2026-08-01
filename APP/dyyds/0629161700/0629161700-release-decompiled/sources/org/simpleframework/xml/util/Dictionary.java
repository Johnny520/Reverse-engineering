package org.simpleframework.xml.util;

import org.simpleframework.xml.util.Entry;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class Dictionary<T extends org.simpleframework.xml.util.Entry> extends java.util.AbstractSet<T> {
    protected final org.simpleframework.xml.util.Dictionary.Table<T> map;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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
            boolean r0 = r0.add(r1)
            return r0
    }

    public boolean add(T r2) {
            r1 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r1 = r1.map
            java.lang.String r0 = r2.getName()
            java.lang.Object r1 = r1.put(r0, r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public T get(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r0.map
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.util.Entry r0 = (org.simpleframework.xml.util.Entry) r0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
            r0 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r0.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public T remove(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r0.map
            java.lang.Object r0 = r0.remove(r1)
            org.simpleframework.xml.util.Entry r0 = (org.simpleframework.xml.util.Entry) r0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r0 = this;
            org.simpleframework.xml.util.Dictionary$Table<T extends org.simpleframework.xml.util.Entry> r0 = r0.map
            int r0 = r0.size()
            return r0
    }
}
