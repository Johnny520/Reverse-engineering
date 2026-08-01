package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    androidx.collection.MapCollections<K, V> mCollections;


    public ArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public ArrayMap(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ArrayMap(androidx.collection.SimpleArrayMap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private androidx.collection.MapCollections<K, V> getCollection() {
            r1 = this;
            androidx.collection.MapCollections<K, V> r0 = r1.mCollections
            if (r0 != 0) goto Lb
            androidx.collection.ArrayMap$1 r0 = new androidx.collection.ArrayMap$1
            r0.<init>(r1)
            r1.mCollections = r0
        Lb:
            androidx.collection.MapCollections<K, V> r0 = r1.mCollections
            return r0
    }

    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = androidx.collection.MapCollections.containsAllHelper(r1, r2)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getEntrySet()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getKeySet()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r5) {
            r4 = this;
            int r0 = r4.mSize
            int r1 = r5.size()
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r3 = r1.getValue()
            r4.put(r2, r3)
            goto L12
        L2a:
            return
    }

    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = androidx.collection.MapCollections.removeAllHelper(r1, r2)
            return r0
    }

    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = androidx.collection.MapCollections.retainAllHelper(r1, r2)
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Collection r0 = r0.getValues()
            return r0
    }
}
