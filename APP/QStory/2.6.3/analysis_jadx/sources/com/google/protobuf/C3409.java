package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3409 implements Collection {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Collection f11069;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3370 f11070;

    public C3409(InterfaceC3370 interfaceC3370, Collection collection) {
        this.f11070 = interfaceC3370;
        this.f11069 = collection;
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
        this.f11070.mo7479();
        this.f11069.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11069.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11069.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f11069.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f11069.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f11069.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3412(this.f11070, this.f11069.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f11070.mo7479();
        return this.f11069.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f11070.mo7479();
        return this.f11069.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f11070.mo7479();
        return this.f11069.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11069.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f11069.toArray();
    }

    public final String toString() {
        return this.f11069.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11069.toArray(objArr);
    }
}
