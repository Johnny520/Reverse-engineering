package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: Mf */
/* JADX INFO: loaded from: classes.dex */
public final class C0538Mf implements Set, Serializable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public static final C0538Mf f1751a = null;

    static {
        f1751a = new C0538Mf();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object r1) {
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return r1.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof Set) == true) goto L5;
        return false;
    L5:
        if (((Set) r2).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0409Jf.f1372a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return ClassUtils.ARRAY_SUFFIX;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
