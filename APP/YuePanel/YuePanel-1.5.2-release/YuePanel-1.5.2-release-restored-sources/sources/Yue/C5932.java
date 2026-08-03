package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5932<E> extends AbstractC2998<E> implements Set<E>, InterfaceC5602 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C5926<E, ?> f14875;

    public C5932(@InterfaceC6399 C5926<E, ?> c5926) {
        C5499.m17103(c5926, "backing");
        this.f14875 = c5926;
    }

    @Override // Yue.AbstractC2998, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f14875.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f14875.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14875.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC6399
    public Iterator<E> iterator() {
        return this.f14875.m18525();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f14875.m18532(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14875.m18509();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14875.m18509();
        return super.retainAll(collection);
    }

    @Override // Yue.AbstractC2998
    /* JADX INFO: renamed from: ۥ */
    public int mo66() {
        return this.f14875.size();
    }
}
