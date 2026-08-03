package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public interface IntSet {
    void add(int r1);

    int elements();

    boolean has(int r1);

    com.android.dx.util.IntIterator iterator();

    void merge(com.android.dx.util.IntSet r1);

    void remove(int r1);
}
