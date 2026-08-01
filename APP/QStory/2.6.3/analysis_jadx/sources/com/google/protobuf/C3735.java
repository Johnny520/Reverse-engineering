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
public final class C3735 extends AbstractList implements InterfaceC3425, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3384 f11574;

    public C3735(C3384 c3384) {
        this.f11574 = c3384;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11574.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C3387 c3387 = new C3387();
        c3387.f11044 = this.f11574.iterator();
        return c3387;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C3731 c3731 = new C3731();
        c3731.f11572 = this.f11574.listIterator(i);
        return c3731;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11574.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final Object mo7490(int i) {
        return this.f11574.f11038.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo7494() {
        return Collections.unmodifiableList(this.f11574.f11038);
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7495(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3425
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3425 mo7491() {
        return this;
    }
}
