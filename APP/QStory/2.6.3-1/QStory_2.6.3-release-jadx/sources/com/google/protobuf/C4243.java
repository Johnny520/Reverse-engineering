package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4243 implements Set {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set f11417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4202 f11418;

    public C4243(InterfaceC4202 interfaceC4202, Set set) {
        this.f11418 = interfaceC4202;
        this.f11417 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f11418.mo8038();
        return this.f11417.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f11418.mo8038();
        return this.f11417.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11418.mo8038();
        this.f11417.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11417.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11417.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f11417.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f11417.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11417.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4244(this.f11418, this.f11417.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f11418.mo8038();
        return this.f11417.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f11418.mo8038();
        return this.f11417.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f11418.mo8038();
        return this.f11417.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11417.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f11417.toArray();
    }

    public final String toString() {
        return this.f11417.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11417.toArray(objArr);
    }
}
