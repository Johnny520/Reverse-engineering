package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3408 implements Collection {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Collection f11064;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3369 f11065;

    public C3408(InterfaceC3369 interfaceC3369, Collection collection) {
        this.f11065 = interfaceC3369;
        this.f11064 = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f11065.mo7492();
        this.f11064.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11064.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11064.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f11064.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f11064.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f11064.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3411(this.f11065, this.f11064.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f11065.mo7492();
        return this.f11064.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f11065.mo7492();
        return this.f11064.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f11065.mo7492();
        return this.f11064.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11064.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f11064.toArray();
    }

    public final String toString() {
        return this.f11064.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11064.toArray(objArr);
    }
}
