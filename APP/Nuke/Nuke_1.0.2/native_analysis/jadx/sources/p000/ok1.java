package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 implements t41, Set, q41 {

    /* JADX INFO: renamed from: h */
    public final mk1 f7702h;

    /* JADX INFO: renamed from: i */
    public final mk1 f7703i;

    public ok1(mk1 mk1Var) {
        mk1Var.getClass();
        this.f7702h = mk1Var;
        this.f7703i = mk1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f7703i.m3124a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        mk1 mk1Var = this.f7703i;
        mk1Var.getClass();
        int i = mk1Var.f6708g;
        for (Object obj : collection) {
            int iM3127d = mk1Var.m3127d(obj);
            mk1Var.f6703b[iM3127d] = obj;
            long[] jArr = mk1Var.f6704c;
            int i2 = mk1Var.f6705d;
            jArr[iM3127d] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iM3127d) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            mk1Var.f6705d = iM3127d;
            if (mk1Var.f6706e == Integer.MAX_VALUE) {
                mk1Var.f6706e = iM3127d;
            }
        }
        return i != mk1Var.f6708g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7703i.m3125b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7702h.m3126c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f7702h.m3126c(it.next())) {
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
        if (obj == null || ok1.class != obj.getClass()) {
            return false;
        }
        return t11.m5086l(this.f7702h, ((ok1) obj).f7702h);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f7702h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7702h.f6708g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ro0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7703i.m3130g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int iNumberOfTrailingZeros;
        collection.getClass();
        mk1 mk1Var = this.f7703i;
        mk1Var.getClass();
        int i2 = mk1Var.f6708g;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = iHashCode ^ (iHashCode << 16);
            int i6 = i5 & 127;
            int i7 = mk1Var.f6707f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = mk1Var.f6702a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                long j = ((jArr[i9 + i3] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
                long j2 = (((long) i6) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
                    int i11 = i3;
                    if (t11.m5086l(mk1Var.f6703b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i3 = i11;
                }
                i4 += 8;
                i8 = (i8 + i4) & i7;
                i3 = i;
            }
            if (iNumberOfTrailingZeros >= 0) {
                mk1Var.m3131h(iNumberOfTrailingZeros);
            }
        }
        return i2 != mk1Var.f6708g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f7703i.m3132i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7702h.f6708g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    public final String toString() {
        return this.f7702h.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }
}
