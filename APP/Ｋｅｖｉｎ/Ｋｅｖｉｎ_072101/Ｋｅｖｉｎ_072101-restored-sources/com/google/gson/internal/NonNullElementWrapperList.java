package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public class NonNullElementWrapperList<E> extends java.util.AbstractList<E> implements java.util.RandomAccess {
    private final java.util.ArrayList<E> delegate;

    public NonNullElementWrapperList(java.util.ArrayList<E> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1.delegate = r0
            return
    }

    private E nonNull(E r3) {
            r2 = this;
            if (r3 == 0) goto L3
            return r3
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Element must be non-null"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            java.util.ArrayList<E> r0 = r2.delegate
            java.lang.Object r1 = r2.nonNull(r4)
            r0.add(r3, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            boolean r0 = r0.contains(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            boolean r0 = r0.equals(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            int r0 = r0.indexOf(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            int r0 = r0.lastIndexOf(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            java.lang.Object r0 = r0.remove(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            boolean r0 = r0.remove(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            boolean r0 = r0.removeAll(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            boolean r0 = r0.retainAll(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            java.util.ArrayList<E> r0 = r2.delegate
            java.lang.Object r1 = r2.nonNull(r4)
            java.lang.Object r0 = r0.set(r3, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.ArrayList<E> r0 = r1.delegate
            java.lang.Object[] r0 = r0.toArray(r2)
            return r0
    }
}
