package p198n8;

import java.util.Collection;
import java.util.Iterator;
import p036c9.InterfaceC1401b;
import p185m8.AbstractC5084i;

/* JADX INFO: renamed from: n8.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5514g extends AbstractC5084i implements Collection, InterfaceC1401b {

    /* JADX INFO: renamed from: q */
    public final C5511d f17237q;

    public C5514g(C5511d c5511d) {
        c5511d.getClass();
        this.f17237q = c5511d;
    }

    @Override // p185m8.AbstractC5084i
    /* JADX INFO: renamed from: a */
    public int mo504a() {
        return this.f17237q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f17237q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f17237q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f17237q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f17237q.m22458V();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f17237q.m22456T(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        this.f17237q.m22462r();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        collection.getClass();
        this.f17237q.m22462r();
        return super.retainAll(collection);
    }
}
