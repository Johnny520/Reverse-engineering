package p069f;

import gg.AbstractC1415k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p114hg.InterfaceC1711a;
import p114hg.InterfaceC1715e;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: f.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949n0 implements InterfaceC1715e, Set, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C0945l0 f2994g;

    /* JADX INFO: renamed from: h */
    public final C0945l0 f2995h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0949n0(C0945l0 c0945l0) {
        this.f2994g = c0945l0;
        this.f2995h = c0945l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f2995h.m2328a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C0945l0 c0945l0 = this.f2995h;
        int i9 = c0945l0.f2978d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0945l0.m2338k(it.next());
        }
        return i9 != c0945l0.f2978d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2995h.m2329b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2994g.m2330c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f2994g.m2330c(it.next())) {
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
        if (obj == null || C0949n0.class != obj.getClass()) {
            return false;
        }
        return this.f2994g.equals(((C0949n0) obj).f2994g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f2994g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2994g.m2334g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0939i0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2995h.m2339l(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        C0945l0 c0945l0 = this.f2995h;
        int i9 = c0945l0.f2978d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0945l0.m2336i(it.next());
        }
        return i9 != c0945l0.f2978d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        C0945l0 c0945l0 = this.f2995h;
        Object[] objArr = c0945l0.f2976b;
        int i9 = c0945l0.f2978d;
        long[] jArr = c0945l0.f2975a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!AbstractC4166m.m8417o1(collection, objArr[i13])) {
                                c0945l0.m2340m(i13);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return i9 != c0945l0.f2978d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2994g.f2978d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1415k.m3824b(this, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2994g.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1415k.m3823a(this);
    }
}
