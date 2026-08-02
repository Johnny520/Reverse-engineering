package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements Collection, q41 {

    /* JADX INFO: renamed from: j */
    public static final kc1 f5453j = new kc1(be0.f819h);

    /* JADX INFO: renamed from: h */
    public final List f5454h;

    /* JADX INFO: renamed from: i */
    public final int f5455i;

    public kc1(List list) {
        this.f5454h = list;
        this.f5455i = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof jc1)) {
            return false;
        }
        return this.f5454h.contains((jc1) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f5454h.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc1) {
            return this.f5454h.equals(((kc1) obj).f5454h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f5454h.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5454h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f5454h.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5455i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f5454h + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0738tl.m5301b0(this, objArr);
    }
}
