package Yue;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5933<V> extends AbstractC2995<V> implements Collection<V>, InterfaceC5592 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C5926<?, V> f14876;

    public C5933(@InterfaceC6399 C5926<?, V> c5926) {
        C5499.m17103(c5926, "backing");
        this.f14876 = c5926;
    }

    @Override // Yue.AbstractC2995, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@InterfaceC6399 Collection<? extends V> collection) {
        C5499.m17103(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f14876.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f14876.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f14876.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<V> iterator() {
        return this.f14876.m18536();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f14876.m18534(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14876.m18509();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14876.m18509();
        return super.retainAll(collection);
    }

    @Override // Yue.AbstractC2995
    /* JADX INFO: renamed from: ۥ */
    public int mo61() {
        return this.f14876.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C5926<?, V> m2601() {
        return this.f14876;
    }
}
