package p011F0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: F0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0119g implements Collection, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final Object[] f419a;

    /* JADX INFO: renamed from: b */
    public final boolean f420b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0119g(Object[] objArr, boolean z2) {
        AbstractC0223g.m418e(objArr, "values");
        this.f419a = objArr;
        this.f420b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC0120h.m254b0(this.f419a, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC0223g.m418e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!AbstractC0120h.m254b0(this.f419a, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f419a.length == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0231o.m428d(this.f419a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        return this.f419a.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f419a;
        AbstractC0223g.m418e(objArr, "<this>");
        if (this.f420b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC0223g.m417d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "array");
        return AbstractC0223g.m422i(this, objArr);
    }
}
