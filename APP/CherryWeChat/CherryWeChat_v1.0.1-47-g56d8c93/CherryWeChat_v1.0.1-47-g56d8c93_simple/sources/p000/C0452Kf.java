package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: Kf */
/* JADX INFO: loaded from: classes.dex */
public final class C0452Kf implements List, Serializable, RandomAccess, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public static final C0452Kf f1484a = null;

    static {
        f1484a = new C0452Kf();
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
    public final /* bridge */ boolean contains(Object r1) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return r1.isEmpty();
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
    public final /* bridge */ int indexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0409Jf.f1372a;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object r1) {
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0409Jf.f1372a;
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
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return ClassUtils.ARRAY_SUFFIX;
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
    public final ListIterator listIterator(int r3) {
        if (r3 != 0) goto L6;
        return C0409Jf.f1372a;
    L6:
        throw new IndexOutOfBoundsException(AbstractC2374ph.m4812i(r3, "Index: "));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
