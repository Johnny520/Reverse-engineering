package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5931<K, V> extends AbstractC2994<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C5926<K, V> f14874;

    public C5931(@InterfaceC6399 C5926<K, V> c5926) {
        C5499.m17103(c5926, "backing");
        this.f14874 = c5926;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC6399 Collection<? extends Map.Entry<K, V>> collection) {
        C5499.m17103(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f14874.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        return this.f14874.m18511(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14874.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC6399
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f14874.m18514();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14874.m18509();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        this.f14874.m18509();
        return super.retainAll(collection);
    }

    @Override // Yue.AbstractC2998
    /* JADX INFO: renamed from: ۥ */
    public int mo66() {
        return this.f14874.size();
    }

    @Override // Yue.AbstractC2994
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo5808(@InterfaceC6399 Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "element");
        return this.f14874.m18512(entry);
    }

    @Override // Yue.AbstractC2994
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo5809(@InterfaceC6399 Map.Entry entry) {
        C5499.m17103(entry, "element");
        return this.f14874.m18530(entry);
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // Yue.AbstractC2998, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean add(@InterfaceC6399 Map.Entry<K, V> entry) {
        C5499.m17103(entry, "element");
        throw new UnsupportedOperationException();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C5926<K, V> m18548() {
        return this.f14874;
    }
}
