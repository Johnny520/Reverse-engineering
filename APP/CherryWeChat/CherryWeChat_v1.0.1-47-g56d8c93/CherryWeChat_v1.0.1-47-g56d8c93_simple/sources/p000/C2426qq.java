package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: qq */
/* JADX INFO: loaded from: classes.dex */
public final class C2426qq extends AbstractCollection implements Collection, InterfaceC0588Nm {

    /* JADX INFO: renamed from: a */
    public final C2332oq f8488a;

    public C2426qq(C2332oq r1) {
        this.f8488a = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8488a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r2) {
        return this.f8488a.containsValue(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f8488a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2332oq r0 = this.f8488a;
        r0.getClass();
        return new C2203lq(r0, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object r4) {
        C2332oq r0 = this.f8488a;
        r0.m4729b();
        int r1 = r0.f8186f;
    L3:
        int r2 = -1;
        r1 = r1 - 1;
        if (r1 < 0) goto L10;
        if (r0.f8183c[r1] < 0) goto L3;
        if (AbstractC0585Nj.m1134a(r0.f8182b[r1], r4) == false) goto L3;
        r2 = r1;
    L10:
        if (r2 >= 0) goto L13;
        return false;
    L13:
        r0.m4735h(r2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection r2) {
        this.f8488a.m4729b();
        return super.removeAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection r2) {
        this.f8488a.m4729b();
        return super.retainAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f8488a.f8189i;
    }
}
