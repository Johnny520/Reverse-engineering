package p009E0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0175f implements List, Collection, InterfaceC0319a {
    public AbstractC0175f() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo516a();

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
        if (isEmpty() == true) goto L15;
        Iterator<E> r02 = iterator();
    L7:
        if (r02.hasNext() == false) goto L16;
        if (AbstractC0307g.m699a(r02.next(), r4) == false) goto L7;
        return true;
    L16:
        return false;
    L15:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r3) {
        AbstractC0307g.m703e(r3, "elements");
        if (r3.isEmpty() == true) goto L15;
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L16;
        if (contains(r32.next()) == true) goto L7;
        return false;
    L16:
        return true;
    L15:
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
        AbstractC0307g.m703e(r62, "other");
        if (size() != r62.size()) goto L17;
        Iterator r63 = r62.iterator();
        Iterator<E> r1 = iterator();
    L13:
        if (r1.hasNext() == false) goto L21;
        if (AbstractC0307g.m699a(r1.next(), r63.next()) == true) goto L13;
    L21:
        return true;
    L17:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        Iterator<E> r02 = iterator();
        int r1 = 1;
    L4:
        if (r02.hasNext() == false) goto L10;
        Object r2 = r02.next();
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
        Iterator r02 = iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L9;
        if (AbstractC0307g.m699a(r02.next(), r4) == true) goto L13;
        r1 = r1 + 1;
        goto L4
    L13:
        return r1;
    L9:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (mo516a() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0172c(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object r3) {
        ListIterator r02 = listIterator(size());
    L4:
        if (r02.hasPrevious() == false) goto L8;
        if (AbstractC0307g.m699a(r02.previous(), r3) == false) goto L4;
        return r02.nextIndex();
    L8:
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C0173d(this, 0);
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
        return mo516a();
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        return new C0174e(this, r2, r3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC0307g.m706h(this);
    }

    public final String toString() {
        return AbstractC0181l.m546r0(this, ", ", "[", "]", new C0170a(0, this), 24);
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
    public ListIterator listIterator(int r2) {
        return new C0173d(this, r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] r2) {
        AbstractC0307g.m703e(r2, "array");
        return AbstractC0307g.m707i(this, r2);
    }
}
