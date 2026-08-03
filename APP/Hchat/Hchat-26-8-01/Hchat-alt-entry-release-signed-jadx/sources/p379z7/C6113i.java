package p379z7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p136j8.C2104o;

/* JADX INFO: renamed from: z7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6113i implements List {

    /* JADX INFO: renamed from: g */
    public static final C6113i f24665g = new C6113i();

    /* JADX INFO: renamed from: h */
    public static final Object[] f24666h = new Object[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        C2104o.m5294t("Empty list");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C6112h.f24664g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return C6112h.f24664g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i9) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        throw new IllegalArgumentException("Empty list");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f24666h;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return C6112h.f24664g;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return objArr;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new IllegalArgumentException("Empty list");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        C2104o.m5294t("Empty list");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
    }
}
