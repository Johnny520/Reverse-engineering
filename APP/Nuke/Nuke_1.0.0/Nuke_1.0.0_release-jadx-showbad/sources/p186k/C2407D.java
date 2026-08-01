package p186k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p122Y2.InterfaceC1769d;
import p124Z.C1779c;

/* JADX INFO: renamed from: k.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2407D implements InterfaceC1769d, Set, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C2405B f7785d;

    /* JADX INFO: renamed from: e */
    public final C2405B f7786e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2407D(C2405B c2405b) {
        AbstractC1665j.m2985e(c2405b, "parent");
        this.f7785d = c2405b;
        this.f7786e = c2405b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f7786e.m4257a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        C2405B c2405b = this.f7786e;
        c2405b.getClass();
        int i5 = c2405b.f7775g;
        for (Object obj : collection) {
            int iM4260d = c2405b.m4260d(obj);
            c2405b.f7770b[iM4260d] = obj;
            long[] jArr = c2405b.f7771c;
            int i6 = c2405b.f7772d;
            jArr[iM4260d] = (((long) i6) & 2147483647L) | 4611686016279904256L;
            if (i6 != Integer.MAX_VALUE) {
                jArr[i6] = ((((long) iM4260d) & 2147483647L) << 31) | (jArr[i6] & (-4611686016279904257L));
            }
            c2405b.f7772d = iM4260d;
            if (c2405b.f7773e == Integer.MAX_VALUE) {
                c2405b.f7773e = iM4260d;
            }
        }
        return i5 != c2405b.f7775g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7786e.m4258b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7785d.m4259c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f7785d.m4259c(it.next())) {
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
        if (obj == null || C2407D.class != obj.getClass()) {
            return false;
        }
        return AbstractC1665j.m2981a(this.f7785d, ((C2407D) obj).f7785d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f7785d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7785d.f7775g == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1779c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7786e.m4263g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        AbstractC1665j.m2985e(collection, "elements");
        C2405B c2405b = this.f7786e;
        c2405b.getClass();
        int i5 = c2405b.f7775g;
        Iterator it = collection.iterator();
        while (true) {
            int i6 = 1;
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i8 = iHashCode ^ (iHashCode << 16);
            int i9 = i8 & 127;
            int i10 = c2405b.f7774f;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = c2405b.f7769a;
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                int i14 = i6;
                int i15 = i7;
                long j5 = (((-i13) >> 63) & (jArr[i12 + i6] << (64 - i13))) | (jArr[i12] >>> i13);
                long j6 = (((long) i9) * 72340172838076673L) ^ j5;
                long j7 = -9187201950435737472L;
                long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j8 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i11) & i10;
                    long j9 = j7;
                    if (AbstractC1665j.m2981a(c2405b.f7770b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j8 &= j8 - 1;
                    j7 = j9;
                }
                i7 = i15 + 8;
                i11 = (i11 + i7) & i10;
                i6 = i14;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c2405b.m4264h(iNumberOfTrailingZeros);
            }
        }
        return i5 != c2405b.f7775g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        return this.f7786e.m4265i(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7785d.f7775g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7785d.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        return AbstractC1664i.m2980b(this, objArr);
    }
}
