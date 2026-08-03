package com.bumptech.glide.util;

import Yue.C3394;
import Yue.C7467;

/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends C3394<K, V> {
    private int hashCode;

    @Override // Yue.C7467, java.util.Map
    public void clear() {
        this.hashCode = 0;
        super.clear();
    }

    @Override // Yue.C7467, java.util.Map
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    @Override // Yue.C7467, java.util.Map
    public V put(K k, V v) {
        this.hashCode = 0;
        return (V) super.put(k, v);
    }

    @Override // Yue.C7467
    public void putAll(C7467<? extends K, ? extends V> c7467) {
        this.hashCode = 0;
        super.putAll(c7467);
    }

    @Override // Yue.C7467
    public V removeAt(int i) {
        this.hashCode = 0;
        return (V) super.removeAt(i);
    }

    @Override // Yue.C7467
    public V setValueAt(int i, V v) {
        this.hashCode = 0;
        return (V) super.setValueAt(i, v);
    }
}
