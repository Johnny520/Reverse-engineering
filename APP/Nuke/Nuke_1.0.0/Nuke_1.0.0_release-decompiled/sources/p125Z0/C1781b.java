package p125Z0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p061L2.C0981u;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: Z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1781b implements Collection, InterfaceC1766a {

    /* JADX INFO: renamed from: f */
    public static final C1781b f6089f = new C1781b(C0981u.f3047d);

    /* JADX INFO: renamed from: d */
    public final List f6090d;

    /* JADX INFO: renamed from: e */
    public final int f6091e;

    public C1781b(List list) {
        this.f6090d = list;
        this.f6091e = list.size();
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
        if (!(obj instanceof C1780a)) {
            return false;
        }
        return this.f6090d.contains((C1780a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f6090d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1781b) {
            return AbstractC1665j.m2981a(this.f6090d, ((C1781b) obj).f6090d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f6090d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f6090d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f6090d.iterator();
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
        return this.f6091e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f6090d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1664i.m2980b(this, objArr);
    }
}
