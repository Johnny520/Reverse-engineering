package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: J4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392J4 implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1328a;

    public C0392J4(C0521M4 r1) {
        this.f1328a = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1328a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r2) {
        return this.f1328a.containsKey(r2);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r2) {
        return this.f1328a.m1005k(r2);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r4) {
        C0521M4 r0 = this.f1328a;
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof Set) == false) goto L14;
        Set r42 = (Set) r4;
        if (r0.f8818c != r42.size()) goto L20;
        if (r0.m1005k(r42) == false) goto L21;
        return true;
    L21:
        return false;
    L20:
        return false;
    L22:
        return false;
    L14:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0521M4 r0 = this.f1328a;
        int r1 = r0.f8818c - 1;
        int r3 = 0;
    L3:
        if (r1 < 0) goto L9;
        Object r4 = r0.m5002f(r1);
        if (r4 != null) goto L7;
        int r42 = 0;
    L8:
        r3 = r3 + r42;
        r1 = r1 - 1;
        goto L3
    L7:
        r42 = r4.hashCode();
        goto L8
    L9:
        return r3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1328a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0349I4(this.f1328a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r2) {
        C0521M4 r0 = this.f1328a;
        int r22 = r0.m5000d(r2);
        if (r22 < 0) goto L6;
        r0.mo4h(r22);
        return true;
    L6:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r2) {
        return this.f1328a.m1006l(r2);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r5) {
        C0521M4 r0 = this.f1328a;
        int r1 = r0.f8818c;
        int r2 = r1 - 1;
    L3:
        if (r2 < 0) goto L9;
        if (r5.contains(r0.m5002f(r2)) == true) goto L7;
        r0.mo4h(r2);
    L7:
        r2 = r2 - 1;
        goto L3
    L9:
        if (r1 == r0.f8818c) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1328a.f8818c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0521M4 r0 = this.f1328a;
        int r1 = r0.f8818c;
        Object[] r2 = new Object[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r0.m5002f(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r5) {
        C0521M4 r0 = this.f1328a;
        int r1 = r0.f8818c;
        if (r5.length >= r1) goto L5;
        r5 = (Object[]) Array.newInstance(r5.getClass().getComponentType(), r1);
    L5:
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L9;
        r5[r2] = r0.m5002f(r2);
        r2 = r2 + 1;
        goto L6
    L9:
        if (r5.length <= r1) goto L11;
        r5[r1] = null;
    L11:
        return r5;
    }
}
