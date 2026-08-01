package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4567 extends AbstractList implements InterfaceC4257, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4216 f11919;

    public C4567(C4216 c4216) {
        this.f11919 = c4216;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11919.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C4219 c4219 = new C4219();
        c4219.f11389 = this.f11919.iterator();
        return c4219;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C4563 c4563 = new C4563();
        c4563.f11917 = this.f11919.listIterator(i);
        return c4563;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11919.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final Object mo8049(int i) {
        return this.f11919.f11383.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo8053() {
        return Collections.unmodifiableList(this.f11919.f11383);
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8054(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4257 mo8050() {
        return this;
    }
}
