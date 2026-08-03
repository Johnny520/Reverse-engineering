package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends Yue.C0573<K, V> {
    private int hashCode;

    public CachedHashCodeArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C5787, java.util.Map
    public void clear() {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            super.clear()
            return
    }

    @Override // Yue.C5787, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            if (r0 != 0) goto La
            int r0 = super.hashCode()
            r1.hashCode = r0
        La:
            int r0 = r1.hashCode
            return r0
    }

    @Override // Yue.C5787, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }

    @Override // Yue.C5787
    public void putAll(Yue.C5787<? extends K, ? extends V> r2) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            super.putAll(r2)
            return
    }

    @Override // Yue.C5787
    public V removeAt(int r2) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.removeAt(r2)
            return r2
    }

    @Override // Yue.C5787
    public V setValueAt(int r2, V r3) {
            r1 = this;
            r0 = 0
            r1.hashCode = r0
            java.lang.Object r2 = super.setValueAt(r2, r3)
            return r2
    }
}
