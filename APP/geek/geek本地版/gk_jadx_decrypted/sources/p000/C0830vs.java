package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: vs */
/* JADX INFO: loaded from: classes.dex */
public final class C0830vs implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0474m6 f4885a;

    public C0830vs(C0474m6 c0474m6) {
        this.f4885a = c0474m6;
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
        this.f4885a.m1786a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4885a.m1791f(obj) >= 0;
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
        return this.f4885a.m1789d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0719ss(this.f4885a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0474m6 c0474m6 = this.f4885a;
        int iM1791f = c0474m6.m1791f(obj);
        if (iM1791f < 0) {
            return false;
        }
        c0474m6.m1792g(iM1791f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0474m6 c0474m6 = this.f4885a;
        int iM1789d = c0474m6.m1789d();
        int i = 0;
        boolean z = false;
        while (i < iM1789d) {
            if (collection.contains(c0474m6.m1787b(i, 1))) {
                c0474m6.m1792g(i);
                i--;
                iM1789d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0474m6 c0474m6 = this.f4885a;
        int iM1789d = c0474m6.m1789d();
        int i = 0;
        boolean z = false;
        while (i < iM1789d) {
            if (!collection.contains(c0474m6.m1787b(i, 1))) {
                c0474m6.m1792g(i);
                i--;
                iM1789d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4885a.m1789d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f4885a.m1793i(objArr, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0474m6 c0474m6 = this.f4885a;
        int iM1789d = c0474m6.m1789d();
        Object[] objArr = new Object[iM1789d];
        for (int i = 0; i < iM1789d; i++) {
            objArr[i] = c0474m6.m1787b(i, 1);
        }
        return objArr;
    }
}
