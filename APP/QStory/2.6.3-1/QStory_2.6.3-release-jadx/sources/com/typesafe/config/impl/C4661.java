package com.typesafe.config.impl;

import java.util.ListIterator;
import p266.InterfaceC8996;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4661 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f12377;

    public C4661(ListIterator listIterator) {
        this.f12377 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw SimpleConfigList.weAreImmutable("listIterator().add");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12377.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12377.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (InterfaceC8996) this.f12377.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12377.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (InterfaceC8996) this.f12377.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12377.previousIndex();
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
