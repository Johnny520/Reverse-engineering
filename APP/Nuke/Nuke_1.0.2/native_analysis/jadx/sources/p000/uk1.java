package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements t41, Set, q41 {

    /* JADX INFO: renamed from: h */
    public final sk1 f11340h;

    /* JADX INFO: renamed from: i */
    public final sk1 f11341i;

    public uk1(sk1 sk1Var) {
        this.f11340h = sk1Var;
        this.f11341i = sk1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f11341i.m4882a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        sk1 sk1Var = this.f11341i;
        int i = sk1Var.f10177d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sk1Var.m4892k(it.next());
        }
        return i != sk1Var.f10177d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11341i.m4883b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11340h.m4884c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f11340h.m4884c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uk1.class != obj.getClass()) {
            return false;
        }
        return this.f11340h.equals(((uk1) obj).f11340h);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f11340h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11340h.m4888g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ro0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f11341i.m4893l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        sk1 sk1Var = this.f11341i;
        int i = sk1Var.f10177d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sk1Var.m4890i(it.next());
        }
        return i != sk1Var.f10177d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        sk1 sk1Var = this.f11341i;
        Object[] objArr = sk1Var.f10175b;
        int i = sk1Var.f10177d;
        long[] jArr = sk1Var.f10174a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC0142du.m1157m0(collection, objArr[i5])) {
                                sk1Var.m4894m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != sk1Var.f10177d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11340h.f10177d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    public final String toString() {
        return this.f11340h.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }
}
