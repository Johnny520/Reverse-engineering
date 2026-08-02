package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: eg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0165eg implements Set {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0276hg f2433h;

    public C0165eg(C0276hg c0276hg) {
        this.f2433h = c0276hg;
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
        this.f2433h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2433h.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f2433h.m2161k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0276hg c0276hg = this.f2433h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c0276hg.f11446j == set.size()) {
                return c0276hg.m2161k(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0276hg c0276hg = this.f2433h;
        int iHashCode = 0;
        for (int i = c0276hg.f11446j - 1; i >= 0; i--) {
            Object objM5569f = c0276hg.m5569f(i);
            iHashCode += objM5569f == null ? 0 : objM5569f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2433h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0129dg(this.f2433h, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0276hg c0276hg = this.f2433h;
        int iM5567d = c0276hg.m5567d(obj);
        if (iM5567d < 0) {
            return false;
        }
        c0276hg.mo4514h(iM5567d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f2433h.m2162l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0276hg c0276hg = this.f2433h;
        int i = c0276hg.f11446j;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0276hg.m5569f(i2))) {
                c0276hg.mo4514h(i2);
            }
        }
        return i != c0276hg.f11446j;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2433h.f11446j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0276hg c0276hg = this.f2433h;
        int i = c0276hg.f11446j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0276hg.m5569f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0276hg c0276hg = this.f2433h;
        int i = c0276hg.f11446j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0276hg.m5569f(i2);
        }
        return objArr;
    }
}
