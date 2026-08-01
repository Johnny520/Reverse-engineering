package com.google.gson.internal;

import androidx.collection.C0276;
import bsh.C2633;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3235 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f10894;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ LinkedTreeMap f10895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3237 f10896 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3237 f10898;

    public C3235(LinkedTreeMap linkedTreeMap, int i) {
        this.f10894 = i;
        this.f10895 = linkedTreeMap;
        this.f10898 = linkedTreeMap.header.f10901;
        this.f10897 = linkedTreeMap.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10898 != this.f10895.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f10894) {
            case 1:
                return m7326().f10904;
            default:
                return m7327();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3237 c3237 = this.f10896;
        if (c3237 == null) {
            C2633.m5341();
            return;
        }
        LinkedTreeMap linkedTreeMap = this.f10895;
        linkedTreeMap.removeInternal(c3237, true);
        this.f10896 = null;
        this.f10897 = linkedTreeMap.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3237 m7326() {
        C3237 c3237 = this.f10898;
        LinkedTreeMap linkedTreeMap = this.f10895;
        if (c3237 == linkedTreeMap.header) {
            C2633.m5336();
            return null;
        }
        if (linkedTreeMap.modCount != this.f10897) {
            C0276.m840();
            return null;
        }
        this.f10898 = c3237.f10901;
        this.f10896 = c3237;
        return c3237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m7327() {
        return m7326();
    }
}
