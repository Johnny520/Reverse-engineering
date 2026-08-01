package p075l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0752j implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0743a f2549a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0752j(C0743a c0743a) {
        this.f2549a = c0743a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        this.f2549a.m1393a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2549a.m1398f(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2549a.m1396d() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0749g(this.f2549a, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0743a c0743a = this.f2549a;
        int iM1398f = c0743a.m1398f(obj);
        if (iM1398f < 0) {
            return false;
        }
        c0743a.m1399g(iM1398f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0743a c0743a = this.f2549a;
        int iM1396d = c0743a.m1396d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iM1396d) {
            if (collection.contains(c0743a.m1394b(i2, 1))) {
                c0743a.m1399g(i2);
                i2--;
                iM1396d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0743a c0743a = this.f2549a;
        int iM1396d = c0743a.m1396d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iM1396d) {
            if (!collection.contains(c0743a.m1394b(i2, 1))) {
                c0743a.m1399g(i2);
                i2--;
                iM1396d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        return this.f2549a.m1396d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        C0743a c0743a = this.f2549a;
        int iM1396d = c0743a.m1396d();
        Object[] objArr = new Object[iM1396d];
        for (int i2 = 0; i2 < iM1396d; i2++) {
            objArr[i2] = c0743a.m1394b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f2549a.m1400i(1, objArr);
    }
}
