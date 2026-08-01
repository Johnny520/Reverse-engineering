package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰楪子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3360 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3362 f11001;

    public C3360(C3362 c3362) {
        this.f11001 = c3362;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11001.m7479(i, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11001.f11007.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7469() {
        ((AbstractList) this).modCount++;
    }
}
