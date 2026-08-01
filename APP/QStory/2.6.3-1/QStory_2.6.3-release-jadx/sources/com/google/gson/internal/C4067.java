package com.google.gson.internal;

import androidx.collection.C1123;
import bsh.C3466;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4067 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f11239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ LinkedTreeMap f11240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4069 f11241 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C4069 f11243;

    public C4067(LinkedTreeMap linkedTreeMap, int i) {
        this.f11239 = i;
        this.f11240 = linkedTreeMap;
        this.f11243 = linkedTreeMap.header.f11246;
        this.f11242 = linkedTreeMap.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11243 != this.f11240.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f11239) {
            case 1:
                return m7885().f11249;
            default:
                return m7886();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4069 c4069 = this.f11241;
        if (c4069 == null) {
            C3466.m5901();
            return;
        }
        LinkedTreeMap linkedTreeMap = this.f11240;
        linkedTreeMap.removeInternal(c4069, true);
        this.f11241 = null;
        this.f11242 = linkedTreeMap.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4069 m7885() {
        C4069 c4069 = this.f11243;
        LinkedTreeMap linkedTreeMap = this.f11240;
        if (c4069 == linkedTreeMap.header) {
            C3466.m5896();
            return null;
        }
        if (linkedTreeMap.modCount != this.f11242) {
            C1123.m1400();
            return null;
        }
        this.f11243 = c4069.f11246;
        this.f11241 = c4069;
        return c4069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m7886() {
        return m7885();
    }
}
