package p009E0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0192w implements Set, Serializable, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public static final C0192w f403a = null;

    static {
        f403a = new C0192w();
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
    public final boolean contains(Object r3) {
        if ((r3 instanceof Void) == true) goto L5;
        return false;
    L5:
        AbstractC0307g.m703e((Void) r3, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r2) {
        AbstractC0307g.m703e(r2, "elements");
        return r2.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r2) {
        if ((r2 instanceof Set) == true) goto L5;
    L7:
        return false;
    L5:
        if (((Set) r2).isEmpty() == false) goto L7;
        return true;
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
        return C0189t.f400a;
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
        return AbstractC0307g.m706h(this);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r2) {
        AbstractC0307g.m703e(r2, "array");
        return AbstractC0307g.m707i(this, r2);
    }
}
