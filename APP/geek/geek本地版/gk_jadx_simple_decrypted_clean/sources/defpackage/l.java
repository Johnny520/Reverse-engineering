package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements List, Collection {
    public abstract int a();

    @Override // java.util.List
    public final void add(int r1, Object r2) {
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
    public boolean contains(Object r4) {
        if (isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator<E> r0 = iterator();
    L7:
        if (r0.hasNext() == false) goto L12;
        if (ip.i(r0.next(), r4) == false) goto L7;
        return true;
    L12:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r3) {
        ip.o("elements", r3);
        if (r3.isEmpty() == false) goto L5;
        return true;
    L5:
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L12;
        if (contains(r32.next()) == true) goto L7;
        return false;
    L12:
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof List) == true) goto L8;
        return false;
    L8:
        Collection r62 = (Collection) r6;
        if (size() != r62.size()) goto L16;
        Iterator r63 = r62.iterator();
        Iterator<E> r1 = iterator();
    L13:
        if (r1.hasNext() == false) goto L17;
        if (ip.i(r1.next(), r63.next()) == true) goto L13;
    L17:
        return true;
    L16:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        Iterator<E> r0 = iterator();
        int r1 = 1;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        int r12 = r1 * 31;
        if (r2 == null) goto L8;
        int r22 = r2.hashCode();
    L9:
        r1 = r12 + r22;
        goto L4
    L8:
        r22 = 0;
        goto L9
    L10:
        return r1;
    }

    @Override // java.util.List
    public int indexOf(Object r4) {
        Iterator r0 = iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L9;
        if (ip.i(r0.next(), r4) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (a() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object r3) {
        ListIterator r0 = listIterator(size());
    L4:
        if (r0.hasPrevious() == false) goto L9;
        if (ip.i(r0.previous(), r3) == false) goto L4;
        return r0.nextIndex();
    L9:
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new j(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int r2) {
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
    public final Object set(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        return new k(this, r2, r3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ip.Y(this);
    }

    public final String toString() {
        return ab.j0(this, ", ", new f(0, this), 24);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        return new j(this, r2);
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
