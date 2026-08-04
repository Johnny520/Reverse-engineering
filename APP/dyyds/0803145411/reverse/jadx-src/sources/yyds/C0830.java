package yyds;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛴᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830 implements Collection {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1505 f3775;

    public C0830(C1505 c1505) {
        this.f3775 = c1505;
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
        this.f3775.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3775.m2169(obj) >= 0;
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
        return this.f3775.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1070(this.f3775, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1505 c1505 = this.f3775;
        int iM2169 = c1505.m2169(obj);
        if (iM2169 < 0) {
            return false;
        }
        c1505.mo1163(iM2169);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1505 c1505 = this.f3775;
        int i = c1505.f4500;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c1505.m2171(i2))) {
                c1505.mo1163(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1505 c1505 = this.f3775;
        int i = c1505.f4500;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c1505.m2171(i2))) {
                c1505.mo1163(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3775.f4500;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1505 c1505 = this.f3775;
        int i = c1505.f4500;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1505.m2171(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1505 c1505 = this.f3775;
        int i = c1505.f4500;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1505.m2171(i2);
        }
        return objArr;
    }
}
