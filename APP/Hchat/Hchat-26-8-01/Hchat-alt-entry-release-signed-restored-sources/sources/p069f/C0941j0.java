package p069f;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p114hg.InterfaceC1711a;
import p114hg.InterfaceC1715e;

/* JADX INFO: renamed from: f.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0941j0 implements InterfaceC1715e, Set, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C0935g0 f2961g;

    /* JADX INFO: renamed from: h */
    public final C0935g0 f2962h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0941j0(C0935g0 c0935g0) {
        c0935g0.getClass();
        this.f2961g = c0935g0;
        this.f2962h = c0935g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f2962h.m2302a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C0935g0 c0935g0 = this.f2962h;
        c0935g0.getClass();
        int i9 = c0935g0.f2943g;
        for (Object obj : collection) {
            int iM2305d = c0935g0.m2305d(obj);
            c0935g0.f2938b[iM2305d] = obj;
            long[] jArr = c0935g0.f2939c;
            int i10 = c0935g0.f2940d;
            jArr[iM2305d] = (((long) i10) & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((((long) iM2305d) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            c0935g0.f2940d = iM2305d;
            if (c0935g0.f2941e == Integer.MAX_VALUE) {
                c0935g0.f2941e = iM2305d;
            }
        }
        return i9 != c0935g0.f2943g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2962h.m2303b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2961g.m2304c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f2961g.m2304c(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0941j0.class != obj.getClass()) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f2961g, ((C0941j0) obj).f2961g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f2961g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2961g.f2943g == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0939i0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2962h.m2308g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        C0935g0 c0935g0 = this.f2962h;
        c0935g0.getClass();
        int i9 = c0935g0.f2943g;
        Iterator it = collection.iterator();
        while (true) {
            int i10 = 1;
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i12 = iHashCode ^ (iHashCode << 16);
            int i13 = i12 & 127;
            int i14 = c0935g0.f2942f;
            int i15 = (i12 >>> 7) & i14;
            while (true) {
                long[] jArr = c0935g0.f2937a;
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                int i18 = i10;
                int i19 = i11;
                long j3 = (((-i17) >> 63) & (jArr[i16 + i10] << (64 - i17))) | (jArr[i16] >>> i17);
                long j4 = (((long) i13) * 72340172838076673L) ^ j3;
                long j5 = -9187201950435737472L;
                long j10 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i14;
                    long j11 = j5;
                    if (AbstractC1416l.m3825a(c0935g0.f2938b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j10 &= j10 - 1;
                    j5 = j11;
                }
                i11 = i19 + 8;
                i15 = (i15 + i11) & i14;
                i10 = i18;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c0935g0.m2309h(iNumberOfTrailingZeros);
            }
        }
        return i9 != c0935g0.f2943g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f2962h.m2310i(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2961g.f2943g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1415k.m3824b(this, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2961g.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1415k.m3823a(this);
    }
}
