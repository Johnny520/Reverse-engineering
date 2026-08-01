package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3410 implements Set {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set f11067;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3369 f11068;

    public C3410(InterfaceC3369 interfaceC3369, Set set) {
        this.f11068 = interfaceC3369;
        this.f11067 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f11068.mo7492();
        return this.f11067.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f11068.mo7492();
        return this.f11067.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11068.mo7492();
        this.f11067.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11067.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11067.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f11067.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f11067.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11067.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3411(this.f11068, this.f11067.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f11068.mo7492();
        return this.f11067.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f11068.mo7492();
        return this.f11067.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f11068.mo7492();
        return this.f11067.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11067.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f11067.toArray();
    }

    public final String toString() {
        return this.f11067.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11067.toArray(objArr);
    }
}
