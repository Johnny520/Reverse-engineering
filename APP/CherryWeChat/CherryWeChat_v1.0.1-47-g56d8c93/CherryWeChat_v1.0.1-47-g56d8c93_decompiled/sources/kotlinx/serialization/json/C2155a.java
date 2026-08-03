package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p000.AbstractC0585Nj;
import p000.AbstractC0671Pj;
import p000.AbstractC2453ra;
import p000.InterfaceC0545Mm;

/* JADX INFO: renamed from: kotlinx.serialization.json.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2155a extends AbstractC2156b implements List<AbstractC2156b>, InterfaceC0545Mm {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();

    /* JADX INFO: renamed from: a */
    public final List f7534a;

    public C2155a(List list) {
        this.f7534a = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC2156b abstractC2156b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC2156b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC2156b)) {
            return false;
        }
        return this.f7534a.contains((AbstractC2156b) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7534a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC0585Nj.m1134a(this.f7534a, obj);
    }

    @Override // java.util.List
    public final AbstractC2156b get(int i) {
        return (AbstractC2156b) this.f7534a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f7534a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2156b)) {
            return -1;
        }
        return this.f7534a.indexOf((AbstractC2156b) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7534a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7534a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2156b)) {
            return -1;
        }
        return this.f7534a.lastIndexOf((AbstractC2156b) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC2156b> listIterator() {
        return this.f7534a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC2156b remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC2156b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC2156b set(int i, AbstractC2156b abstractC2156b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7534a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC2156b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC2156b> subList(int i, int i2) {
        return this.f7534a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(this.f7534a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<AbstractC2156b> listIterator(int i) {
        return this.f7534a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0671Pj.m1342C(this, objArr);
    }
}
