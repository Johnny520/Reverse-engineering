package com.google.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3731 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ListIterator f11572;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11572.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11572.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f11572.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11572.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f11572.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11572.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
