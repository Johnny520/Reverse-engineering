package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: bt */
/* JADX INFO: loaded from: classes.dex */
public final class C0080bt implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0474m6 f757a;

    public C0080bt(C0474m6 c0474m6) {
        this.f757a = c0474m6;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f757a.m1808a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f757a.m1813f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f757a.m1811d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0941ys(this.f757a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0474m6 c0474m6 = this.f757a;
        int iM1813f = c0474m6.m1813f(obj);
        if (iM1813f < 0) {
            return false;
        }
        c0474m6.m1814g(iM1813f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0474m6 c0474m6 = this.f757a;
        int iM1811d = c0474m6.m1811d();
        int i = 0;
        boolean z = false;
        while (i < iM1811d) {
            if (collection.contains(c0474m6.m1809b(i, 1))) {
                c0474m6.m1814g(i);
                i--;
                iM1811d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0474m6 c0474m6 = this.f757a;
        int iM1811d = c0474m6.m1811d();
        int i = 0;
        boolean z = false;
        while (i < iM1811d) {
            if (!collection.contains(c0474m6.m1809b(i, 1))) {
                c0474m6.m1814g(i);
                i--;
                iM1811d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f757a.m1811d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f757a.m1815i(objArr, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0474m6 c0474m6 = this.f757a;
        int iM1811d = c0474m6.m1811d();
        Object[] objArr = new Object[iM1811d];
        for (int i = 0; i < iM1811d; i++) {
            objArr[i] = c0474m6.m1809b(i, 1);
        }
        return objArr;
    }
}
