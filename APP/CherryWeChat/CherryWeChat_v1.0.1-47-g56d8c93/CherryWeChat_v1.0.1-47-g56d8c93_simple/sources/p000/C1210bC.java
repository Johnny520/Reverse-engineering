package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: bC */
/* JADX INFO: loaded from: classes.dex */
public final class C1210bC implements Collection, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final byte[] f4141a;

    public /* synthetic */ C1210bC(byte[] r1) {
        this.f4141a = r1;
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
    public final boolean contains(Object r6) {
        if ((r6 instanceof C1130aC) == true) goto L5;
        return false;
    L5:
        byte r62 = ((C1130aC) r6).f3580a;
        byte[] r0 = this.f4141a;
        int r2 = r0.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L11;
        if (r62 == r0[r3]) goto L12;
        r3 = r3 + 1;
    L12:
        if (r3 < 0) goto L15;
        return true;
    L15:
        return false;
    L11:
        r3 = -1;
        goto L12
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r8) {
        if (r8.isEmpty() == true) goto L23;
        Iterator r82 = r8.iterator();
    L7:
        if (r82.hasNext() == false) goto L23;
        Object r0 = r82.next();
        if ((r0 instanceof C1130aC) == false) goto L22;
        byte r02 = ((C1130aC) r0).f3580a;
        byte[] r2 = this.f4141a;
        int r4 = r2.length;
        int r5 = 0;
    L11:
        if (r5 >= r4) goto L16;
        if (r02 == r2[r5]) goto L17;
        r5 = r5 + 1;
    L17:
        if (r5 < 0) goto L19;
        boolean r03 = true;
    L20:
        if (r03 == false) goto L22;
    L19:
        r03 = false;
        goto L20
    L16:
        r5 = -1;
    L22:
        return false;
    L23:
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof C1210bC) == false) goto L11;
        byte[] r22 = ((C1210bC) r2).f4141a;
        if (AbstractC0585Nj.m1134a(this.f4141a, r22) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4141a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f4141a.length != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2694x(3, this.f4141a);
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
        return this.f4141a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f4141a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
