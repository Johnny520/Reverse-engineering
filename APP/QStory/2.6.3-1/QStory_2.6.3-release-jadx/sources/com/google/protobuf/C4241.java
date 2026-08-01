package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4241 implements Collection {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Collection f11414;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4202 f11415;

    public C4241(InterfaceC4202 interfaceC4202, Collection collection) {
        this.f11415 = interfaceC4202;
        this.f11414 = collection;
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
        this.f11415.mo8038();
        this.f11414.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11414.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11414.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f11414.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f11414.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f11414.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4244(this.f11415, this.f11414.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f11415.mo8038();
        return this.f11414.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f11415.mo8038();
        return this.f11414.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f11415.mo8038();
        return this.f11414.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11414.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f11414.toArray();
    }

    public final String toString() {
        return this.f11414.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11414.toArray(objArr);
    }
}
