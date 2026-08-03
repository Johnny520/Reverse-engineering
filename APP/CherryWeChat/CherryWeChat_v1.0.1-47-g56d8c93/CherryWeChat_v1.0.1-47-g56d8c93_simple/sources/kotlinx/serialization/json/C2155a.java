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
    public static final JsonArray$Companion Companion = null;

    /* JADX INFO: renamed from: a */
    public final List f7534a;

    static {
        Companion = new JsonArray$Companion();
    }

    public C2155a(List r1) {
        this.f7534a = r1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, AbstractC2156b r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection<? extends AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r2) {
        if ((r2 instanceof AbstractC2156b) == true) goto L6;
        return false;
    L6:
        List r0 = this.f7534a;
        return r0.contains((AbstractC2156b) r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r2) {
        return this.f7534a.containsAll(r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object r2) {
        return AbstractC0585Nj.m1134a(this.f7534a, r2);
    }

    @Override // java.util.List
    public final AbstractC2156b get(int r2) {
        return (AbstractC2156b) this.f7534a.get(r2);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f7534a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object r2) {
        if ((r2 instanceof AbstractC2156b) == true) goto L6;
        return -1;
    L6:
        List r0 = this.f7534a;
        return r0.indexOf((AbstractC2156b) r2);
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
    public final int lastIndexOf(Object r2) {
        if ((r2 instanceof AbstractC2156b) == true) goto L6;
        return -1;
    L6:
        List r0 = this.f7534a;
        return r0.lastIndexOf((AbstractC2156b) r2);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC2156b> listIterator() {
        return this.f7534a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC2156b remove(int r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC2156b set(int r1, AbstractC2156b r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7534a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC2156b> subList(int r2, int r3) {
        return this.f7534a.subList(r2, r3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(this.f7534a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<AbstractC2156b> listIterator(int r2) {
        return this.f7534a.listIterator(r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return AbstractC0671Pj.m1342C(this, r1);
    }
}
