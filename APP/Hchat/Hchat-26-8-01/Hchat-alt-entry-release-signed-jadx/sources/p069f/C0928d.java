package p069f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0928d implements Collection {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0930e f2907g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0928d(C0930e c0930e) {
        this.f2907g = c0930e;
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
        this.f2907g.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2907g.m2274a(obj) >= 0;
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
        return this.f2907g.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0922a(this.f2907g, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0930e c0930e = this.f2907g;
        int iM2274a = c0930e.m2274a(obj);
        if (iM2274a < 0) {
            return false;
        }
        c0930e.m2282j(iM2274a);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0930e c0930e = this.f2907g;
        int i9 = c0930e.f2912i;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < i9) {
            if (collection.contains(c0930e.m2284l(i10))) {
                c0930e.m2282j(i10);
                i10--;
                i9--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0930e c0930e = this.f2907g;
        int i9 = c0930e.f2912i;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < i9) {
            if (!collection.contains(c0930e.m2284l(i10))) {
                c0930e.m2282j(i10);
                i10--;
                i9--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        return this.f2907g.f2912i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0930e c0930e = this.f2907g;
        int i9 = c0930e.f2912i;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c0930e.m2284l(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0930e c0930e = this.f2907g;
        int i9 = c0930e.f2912i;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c0930e.m2284l(i10);
        }
        return objArr;
    }
}
