package p046d6;

import bsh.C0353j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: d6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0705b implements SortedSet {

    /* JADX INFO: renamed from: g */
    public final Object[] f2125g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0705b(Object[] objArr) {
        this.f2125g = objArr;
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
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return C0708e.f2126h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f2125g, obj, C0708e.f2126h) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
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
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z9 = obj instanceof SortedSet;
        Object[] objArr = this.f2125g;
        if (!z9) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (objArr.length != set.size()) {
                return false;
            }
            return containsAll(set);
        }
        SortedSet sortedSet = (SortedSet) obj;
        if (objArr.length != sortedSet.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = sortedSet.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final Object first() {
        Object[] objArr = this.f2125g;
        if (objArr.length != 0) {
            return objArr[0];
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iHashCode = 0;
        for (Object obj : this.f2125g) {
            iHashCode += obj.hashCode();
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2125g.length > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Arrays.asList(this.f2125g).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final Object last() {
        Object[] objArr = this.f2125g;
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2125g.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = this.f2125g;
        if (length > objArr2.length) {
            return Arrays.copyOf(objArr2, objArr2.length);
        }
        System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (Object[]) this.f2125g.clone();
    }
}
