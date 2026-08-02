package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jp2 extends AbstractC0004a3 implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final jp2 f5148i = new jp2(pe1.f8270u);

    /* JADX INFO: renamed from: h */
    public final pe1 f5149h;

    public jp2() {
        this.f5149h = new pe1();
    }

    @Override // p000.AbstractC0004a3
    /* JADX INFO: renamed from: a */
    public final int mo21a() {
        return this.f5149h.f8279p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f5149h.m3851a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f5149h.m3853c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5149h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5149h.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5149h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        pe1 pe1Var = this.f5149h;
        pe1Var.getClass();
        return new ne1(pe1Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        pe1 pe1Var = this.f5149h;
        pe1Var.m3853c();
        int iM3857g = pe1Var.m3857g(obj);
        if (iM3857g < 0) {
            return false;
        }
        pe1Var.m3861k(iM3857g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f5149h.m3853c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f5149h.m3853c();
        return super.retainAll(collection);
    }

    public jp2(pe1 pe1Var) {
        pe1Var.getClass();
        this.f5149h = pe1Var;
    }
}
