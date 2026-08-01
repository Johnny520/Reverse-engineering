package p186k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p122Y2.InterfaceC1769d;
import p124Z.C1779c;

/* JADX INFO: renamed from: k.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2411H implements InterfaceC1769d, Set, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C2409F f7810d;

    /* JADX INFO: renamed from: e */
    public final C2409F f7811e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2411H(C2409F c2409f) {
        this.f7810d = c2409f;
        this.f7811e = c2409f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f7811e.m4279a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        C2409F c2409f = this.f7811e;
        int i5 = c2409f.f7796d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2409f.m4288j(it.next());
        }
        return i5 != c2409f.f7796d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7811e.m4280b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7810d.m4281c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f7810d.m4281c(it.next())) {
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
        if (obj == null || C2411H.class != obj.getClass()) {
            return false;
        }
        return AbstractC1665j.m2981a(this.f7810d, ((C2411H) obj).f7810d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f7810d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7810d.m4285g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1779c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7811e.m4290l(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        C2409F c2409f = this.f7811e;
        c2409f.getClass();
        int i5 = c2409f.f7796d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2409f.m4287i(it.next());
        }
        return i5 != c2409f.f7796d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z5;
        AbstractC1665j.m2985e(collection, "elements");
        C2409F c2409f = this.f7811e;
        c2409f.getClass();
        Object[] objArr = c2409f.f7794b;
        int i5 = c2409f.f7796d;
        long[] jArr = c2409f.f7793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i6 << 3) + i8;
                            if (!AbstractC0973m.m2010Q(collection, objArr[i9])) {
                                c2409f.m4291m(i9);
                            }
                        }
                        j5 >>= 8;
                    }
                    z5 = false;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    z5 = false;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        } else {
            z5 = false;
        }
        if (i5 != c2409f.f7796d) {
            return true;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7810d.f7796d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7810d.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        return AbstractC1664i.m2980b(this, objArr);
    }
}
