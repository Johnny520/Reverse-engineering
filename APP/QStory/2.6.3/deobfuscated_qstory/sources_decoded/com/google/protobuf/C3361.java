package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰楪子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3361 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3363 f11006;

    public C3361(C3363 c3363) {
        this.f11006 = c3363;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11006.m7466(i, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11006.f11012.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7456() {
        ((AbstractList) this).modCount++;
    }
}
