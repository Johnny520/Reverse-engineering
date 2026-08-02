package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z21 extends j31 implements List<j31>, q41 {
    public static final y21 Companion = new y21();

    /* JADX INFO: renamed from: h */
    public final List f13709h;

    public z21(List list) {
        list.getClass();
        this.f13709h = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, j31 j31Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends j31> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j31)) {
            return false;
        }
        return this.f13709h.contains((j31) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f13709h.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return t11.m5086l(this.f13709h, obj);
    }

    @Override // java.util.List
    public final j31 get(int i) {
        return (j31) this.f13709h.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f13709h.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j31)) {
            return -1;
        }
        return this.f13709h.indexOf((j31) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13709h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13709h.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j31)) {
            return -1;
        }
        return this.f13709h.lastIndexOf((j31) obj);
    }

    @Override // java.util.List
    public final ListIterator<j31> listIterator() {
        return this.f13709h.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j31 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<j31> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j31 set(int i, j31 j31Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13709h.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super j31> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<j31> subList(int i, int i2) {
        return this.f13709h.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    public final String toString() {
        return AbstractC0142du.m1165u0(this.f13709h, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<j31> listIterator(int i) {
        return this.f13709h.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }
}
