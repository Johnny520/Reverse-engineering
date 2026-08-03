package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: J4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392J4 implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1328a;

    public C0392J4(C0521M4 c0521m4) {
        this.f1328a = c0521m4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1328a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1328a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f1328a.m1005k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0521M4 c0521m4 = this.f1328a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c0521m4.f8818c == set.size()) {
                return c0521m4.m1005k(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0521M4 c0521m4 = this.f1328a;
        int iHashCode = 0;
        for (int i = c0521m4.f8818c - 1; i >= 0; i--) {
            Object objM5002f = c0521m4.m5002f(i);
            iHashCode += objM5002f == null ? 0 : objM5002f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1328a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0349I4(this.f1328a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0521M4 c0521m4 = this.f1328a;
        int iM5000d = c0521m4.m5000d(obj);
        if (iM5000d < 0) {
            return false;
        }
        c0521m4.mo4h(iM5000d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f1328a.m1006l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0521M4 c0521m4 = this.f1328a;
        int i = c0521m4.f8818c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0521m4.m5002f(i2))) {
                c0521m4.mo4h(i2);
            }
        }
        return i != c0521m4.f8818c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1328a.f8818c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0521M4 c0521m4 = this.f1328a;
        int i = c0521m4.f8818c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0521m4.m5002f(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0521M4 c0521m4 = this.f1328a;
        int i = c0521m4.f8818c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0521m4.m5002f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
