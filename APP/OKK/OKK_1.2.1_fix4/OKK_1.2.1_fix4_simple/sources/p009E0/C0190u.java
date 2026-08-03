package p009E0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0190u implements List, Serializable, RandomAccess, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public static final C0190u f401a = null;

    static {
        f401a = new C0190u();
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
    public final boolean contains(Object r3) {
        if ((r3 instanceof Void) == true) goto L5;
        return false;
    L5:
        AbstractC0307g.m703e((Void) r3, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r2) {
        AbstractC0307g.m703e(r2, "elements");
        return r2.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof List) == true) goto L5;
    L7:
        return false;
    L5:
        if (((List) r2).isEmpty() == false) goto L7;
        return true;
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
    public final int indexOf(Object r3) {
        if ((r3 instanceof Void) == true) goto L5;
        return -1;
    L5:
        AbstractC0307g.m703e((Void) r3, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0189t.f400a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r3) {
        if ((r3 instanceof Void) == true) goto L5;
        return -1;
    L5:
        AbstractC0307g.m703e((Void) r3, "element");
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0189t.f400a;
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
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("fromIndex: ", r4, ", toIndex: ", r5));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0307g.m706h(this);
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
    public final ListIterator listIterator(int r3) {
        if (r3 != 0) goto L6;
        return C0189t.f400a;
    L6:
        throw new IndexOutOfBoundsException(AbstractC0324d.m720c("Index: ", r3));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r2) {
        AbstractC0307g.m703e(r2, "array");
        return AbstractC0307g.m707i(this, r2);
    }
}
