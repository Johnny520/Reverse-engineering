package p198n8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: n8.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5513f extends AbstractC5090l implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final C5511d f17236q;

    public C5513f(C5511d c5511d) {
        c5511d.getClass();
        this.f17236q = c5511d;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f17236q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17236q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f17236q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17236q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17236q.m22447J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f17236q.m22455S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        this.f17236q.m22462r();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        this.f17236q.m22462r();
        return super.retainAll(collection);
    }
}
