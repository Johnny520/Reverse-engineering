package p063j;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0965j implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0956a f3425a;

    public C0965j(C0956a r1) {
        this.f3425a = r1;
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
        this.f3425a.m2289a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        if (this.f3425a.m2294f(r2) < 0) goto L5;
        return true;
    L5:
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
        if (this.f3425a.m2292d() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0962g(this.f3425a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        C0956a r02 = this.f3425a;
        int r22 = r02.m2294f(r2);
        if (r22 < 0) goto L6;
        r02.m2296h(r22);
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r7) {
        C0956a r02 = this.f3425a;
        int r1 = r02.m2292d();
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r02.m2290b(r2, 1)) == false) goto L7;
        r02.m2296h(r2);
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
        C0956a r02 = this.f3425a;
        int r1 = r02.m2292d();
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r02.m2290b(r2, 1)) == true) goto L7;
        r02.m2296h(r2);
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
        return this.f3425a.m2292d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r3) {
        return this.f3425a.m2298k(1, r3);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0956a r02 = this.f3425a;
        int r1 = r02.m2292d();
        Object[] r2 = new Object[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r02.m2290b(r3, 1);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }
}
