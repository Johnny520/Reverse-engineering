package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class yi implements List, Serializable, RandomAccess {
    public static final yi a = null;

    static {
        a = new yi();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r1) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r2) {
        ip.o("elements", r2);
        return r2.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof List) == true) goto L5;
        return false;
    L5:
        if (((List) r2).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + r4 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return xi.a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return xi.a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int r4, int r5) {
        if (r4 != 0) goto L6;
        if (r5 != 0) goto L6;
        return this;
    L6:
        throw new IndexOutOfBoundsException("fromIndex: " + r4 + ", toIndex: " + r5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ip.Y(this);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r4) {
        if (r4 != 0) goto L6;
        return xi.a;
    L6:
        throw new IndexOutOfBoundsException("Index: " + r4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r2) {
        ip.o("array", r2);
        return ip.Z(this, r2);
    }
}
