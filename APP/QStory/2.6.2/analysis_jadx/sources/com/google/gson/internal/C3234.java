package com.google.gson.internal;

import androidx.collection.C0276;
import bsh.C2632;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3234 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f10889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ LinkedTreeMap f10890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3236 f10891 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3236 f10893;

    public C3234(LinkedTreeMap linkedTreeMap, int i) {
        this.f10889 = i;
        this.f10890 = linkedTreeMap;
        this.f10893 = linkedTreeMap.header.f10896;
        this.f10892 = linkedTreeMap.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10893 != this.f10890.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f10889) {
            case 1:
                return m7339().f10899;
            default:
                return m7340();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3236 c3236 = this.f10891;
        if (c3236 == null) {
            C2632.m5296();
            return;
        }
        LinkedTreeMap linkedTreeMap = this.f10890;
        linkedTreeMap.removeInternal(c3236, true);
        this.f10891 = null;
        this.f10892 = linkedTreeMap.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3236 m7339() {
        C3236 c3236 = this.f10893;
        LinkedTreeMap linkedTreeMap = this.f10890;
        if (c3236 == linkedTreeMap.header) {
            C2632.m5291();
            return null;
        }
        if (linkedTreeMap.modCount != this.f10892) {
            C0276.m839();
            return null;
        }
        this.f10893 = c3236.f10896;
        this.f10891 = c3236;
        return c3236;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m7340() {
        return m7339();
    }
}
