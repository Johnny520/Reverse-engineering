package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lC */
/* JADX INFO: loaded from: classes.dex */
public final class C2183lC implements Collection, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final long[] f7613a;

    public /* synthetic */ C2183lC(long[] r1) {
        this.f7613a = r1;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r2) {
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
    public final boolean contains(Object r8) {
        if ((r8 instanceof C2135kC) == true) goto L5;
        return false;
    L5:
        long r2 = ((C2135kC) r8).f7478a;
        long[] r82 = this.f7613a;
        int r0 = r82.length;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L11;
        if (r2 == r82[r4]) goto L12;
        r4 = r4 + 1;
    L12:
        if (r4 < 0) goto L15;
        return true;
    L15:
        return false;
    L11:
        r4 = -1;
        goto L12
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r10) {
        if (r10.isEmpty() == true) goto L23;
        Iterator r102 = r10.iterator();
    L7:
        if (r102.hasNext() == false) goto L23;
        Object r0 = r102.next();
        if ((r0 instanceof C2135kC) == false) goto L22;
        long r4 = ((C2135kC) r0).f7478a;
        long[] r02 = this.f7613a;
        int r2 = r02.length;
        int r6 = 0;
    L11:
        if (r6 >= r2) goto L16;
        if (r4 == r02[r6]) goto L17;
        r6 = r6 + 1;
    L17:
        if (r6 < 0) goto L19;
        boolean r03 = true;
    L20:
        if (r03 == false) goto L22;
    L19:
        r03 = false;
        goto L20
    L16:
        r6 = -1;
    L22:
        return false;
    L23:
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof C2183lC) == false) goto L11;
        long[] r22 = ((C2183lC) r2).f7613a;
        if (AbstractC0585Nj.m1134a(this.f7613a, r22) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f7613a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f7613a.length != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2694x(5, this.f7613a);
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
        return this.f7613a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f7613a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
