package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3734 extends AbstractList implements InterfaceC3424, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3383 f11569;

    public C3734(C3383 c3383) {
        this.f11569 = c3383;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11569.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C3386 c3386 = new C3386();
        c3386.f11039 = this.f11569.iterator();
        return c3386;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C3730 c3730 = new C3730();
        c3730.f11567 = this.f11569.listIterator(i);
        return c3730;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11569.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final Object mo7503(int i) {
        return this.f11569.f11033.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo7507() {
        return Collections.unmodifiableList(this.f11569.f11033);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7508(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3424 mo7504() {
        return this;
    }
}
