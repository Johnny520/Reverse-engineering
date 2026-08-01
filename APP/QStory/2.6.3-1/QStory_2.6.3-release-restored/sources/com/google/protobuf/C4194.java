package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰楪苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4194 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4195 f11352;

    public C4194(C4195 c4195) {
        this.f11352 = c4195;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11352.m8028(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11352.f11357.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8016() {
        ((AbstractList) this).modCount++;
    }
}
