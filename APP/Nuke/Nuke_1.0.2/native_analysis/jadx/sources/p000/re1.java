package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class re1 extends AbstractC0908y2 {

    /* JADX INFO: renamed from: h */
    public final pe1 f9526h;

    public re1(pe1 pe1Var) {
        this.f9526h = pe1Var;
    }

    @Override // p000.AbstractC0908y2
    /* JADX INFO: renamed from: a */
    public final int mo2038a() {
        return this.f9526h.f8279p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f9526h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9526h.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f9526h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        pe1 pe1Var = this.f9526h;
        pe1Var.getClass();
        return new ne1(pe1Var, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        pe1 pe1Var = this.f9526h;
        pe1Var.m3853c();
        int iM3858h = pe1Var.m3858h(obj);
        if (iM3858h < 0) {
            return false;
        }
        pe1Var.m3861k(iM3858h);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f9526h.m3853c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f9526h.m3853c();
        return super.retainAll(collection);
    }
}
