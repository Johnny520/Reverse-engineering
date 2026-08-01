package p011F0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: F0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0131s implements List, Serializable, RandomAccess, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public static final C0131s f426a = new C0131s();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        AbstractC0223g.m418e((Void) obj, "element");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC0223g.m418e(collection, "elements");
        return collection.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        AbstractC0223g.m418e((Void) obj, "element");
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
        return C0130r.f425a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        AbstractC0223g.m418e((Void) obj, "element");
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0130r.f425a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0223g.m421h(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "[]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return C0130r.f425a;
        }
        throw new IndexOutOfBoundsException(AbstractC0174d.m351g(i2, "Index: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "array");
        return AbstractC0223g.m422i(this, objArr);
    }
}
