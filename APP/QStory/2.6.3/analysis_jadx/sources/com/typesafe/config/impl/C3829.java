package com.typesafe.config.impl;

import java.util.ListIterator;
import p250.InterfaceC8167;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3829 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f12032;

    public C3829(ListIterator listIterator) {
        this.f12032 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw SimpleConfigList.weAreImmutable("listIterator().add");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12032.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12032.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (InterfaceC8167) this.f12032.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12032.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (InterfaceC8167) this.f12032.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12032.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw SimpleConfigList.weAreImmutable("listIterator().remove");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw SimpleConfigList.weAreImmutable("listIterator().set");
    }
}
