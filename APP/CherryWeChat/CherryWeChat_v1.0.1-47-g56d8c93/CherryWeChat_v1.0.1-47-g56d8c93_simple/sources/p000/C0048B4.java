package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0048B4 implements Collection, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final Object[] f98a;

    public C0048B4(Object[] r1) {
        this.f98a = r1;
    }

    @Override // java.util.Collection
    public final boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        if (AbstractC0650P4.m1312G(r2, this.f98a) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r3) {
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f98a.length != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2694x(1, this.f98a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f98a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] r1 = this.f98a;
        return Arrays.copyOf(r1, r1.length, Object[].class);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
