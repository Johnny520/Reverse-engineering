package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vs implements Collection {
    public final /* synthetic */ m6 a;

    public vs(m6 r1) {
        this.a = r1;
    }

    @Override // java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        if (this.a.f(r2) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (contains(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.a.d() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ss(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        m6 r0 = this.a;
        int r22 = r0.f(r2);
        if (r22 < 0) goto L6;
        r0.g(r22);
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r7) {
        m6 r0 = this.a;
        int r1 = r0.d();
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r0.b(r2, 1)) == false) goto L7;
        r0.g(r2);
        r2 = r2 - 1;
        r1 = r1 - 1;
        r3 = true;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r7) {
        m6 r0 = this.a;
        int r1 = r0.d();
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r0.b(r2, 1)) == true) goto L7;
        r0.g(r2);
        r2 = r2 - 1;
        r1 = r1 - 1;
        r3 = true;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r3) {
        return this.a.i(r3, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        m6 r0 = this.a;
        int r1 = r0.d();
        Object[] r2 = new Object[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r0.b(r3, 1);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }
}
