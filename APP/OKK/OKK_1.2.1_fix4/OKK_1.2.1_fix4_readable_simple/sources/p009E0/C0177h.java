package p009E0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0177h implements Collection, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final Object[] f391a;

    /* JADX INFO: renamed from: b */
    public final boolean f392b;

    public C0177h(Object[] r2, boolean r3) {
        AbstractC0307g.m703e(r2, "values");
        this.f391a = r2;
        this.f392b = r3;
    }

    @Override // java.util.Collection
    public final boolean add(Object r2) {
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
        Object[] r1 = this.f391a;
        AbstractC0307g.m703e(r1, "<this>");
        if (r6 != null) goto L10;
        int r62 = r1.length;
        int r2 = 0;
    L5:
        if (r2 >= r62) goto L16;
        if (r1[r2] == null) goto L17;
        r2 = r2 + 1;
    L17:
        if (r2 < 0) goto L24;
        return true;
    L24:
        return false;
    L16:
        r2 = -1;
        goto L17
    L10:
        int r22 = r1.length;
        int r3 = 0;
    L11:
        if (r3 >= r22) goto L16;
        if (r6.equals(r1[r3]) == true) goto L14;
        r3 = r3 + 1;
        goto L11
    L14:
        r2 = r3;
        goto L17
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r3) {
        AbstractC0307g.m703e(r3, "elements");
        if (r3.isEmpty() == true) goto L15;
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L16;
        if (contains(r32.next()) == true) goto L7;
        return false;
    L16:
        return true;
    L15:
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f391a.length != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0317q.m714c(this.f391a);
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
        return this.f391a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] r02 = this.f391a;
        AbstractC0307g.m703e(r02, "<this>");
        if (this.f392b == true) goto L5;
    L7:
        Object[] r03 = Arrays.copyOf(r02, r02.length, Object[].class);
        AbstractC0307g.m702d(r03, "copyOf(...)");
        return r03;
    L5:
        if (r02.getClass().equals(Object[].class) == false) goto L7;
        return r02;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r2) {
        AbstractC0307g.m703e(r2, "array");
        return AbstractC0307g.m707i(this, r2);
    }
}
