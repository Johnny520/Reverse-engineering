package p069f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: f.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0924b implements Set {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0930e f2893g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0924b(C0930e c0930e) {
        this.f2893g = c0930e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2893g.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2893g.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f2893g.m2275c(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0930e c0930e = this.f2893g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c0930e.f2912i == set.size()) {
                return c0930e.m2275c(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0930e c0930e = this.f2893g;
        int iHashCode = 0;
        for (int i9 = c0930e.f2912i - 1; i9 >= 0; i9--) {
            Object objM2280h = c0930e.m2280h(i9);
            iHashCode += objM2280h == null ? 0 : objM2280h.hashCode();
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2893g.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0922a(this.f2893g, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0930e c0930e = this.f2893g;
        int iM2278f = c0930e.m2278f(obj);
        if (iM2278f < 0) {
            return false;
        }
        c0930e.m2282j(iM2278f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0930e c0930e = this.f2893g;
        int i9 = c0930e.f2912i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0930e.remove(it.next());
        }
        return i9 != c0930e.f2912i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0930e c0930e = this.f2893g;
        int i9 = c0930e.f2912i;
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (!collection.contains(c0930e.m2280h(i10))) {
                c0930e.m2282j(i10);
            }
        }
        return i9 != c0930e.f2912i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2893g.f2912i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0930e c0930e = this.f2893g;
        int i9 = c0930e.f2912i;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c0930e.m2280h(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0930e c0930e = this.f2893g;
        int i9 = c0930e.f2912i;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c0930e.m2280h(i10);
        }
        return objArr;
    }
}
