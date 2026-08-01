package com.typesafe.config.impl;

import java.util.ListIterator;
import p250.InterfaceC8166;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3828 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f12027;

    public C3828(ListIterator listIterator) {
        this.f12027 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw SimpleConfigList.weAreImmutable("listIterator().add");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12027.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12027.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (InterfaceC8166) this.f12027.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12027.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (InterfaceC8166) this.f12027.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12027.previousIndex();
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
