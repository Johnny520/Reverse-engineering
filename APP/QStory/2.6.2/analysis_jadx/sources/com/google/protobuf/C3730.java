package com.google.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3730 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ListIterator f11567;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11567.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11567.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f11567.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11567.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f11567.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11567.previousIndex();
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
