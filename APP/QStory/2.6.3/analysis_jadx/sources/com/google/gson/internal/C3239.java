package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3239 extends AbstractSet {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ LinkedTreeMap f10909;

    public C3239(LinkedTreeMap linkedTreeMap) {
        this.f10909 = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10909.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f10909.findByEntry((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3235(this.f10909, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        LinkedTreeMap linkedTreeMap;
        C3237 c3237FindByEntry;
        if (!(obj instanceof Map.Entry) || (c3237FindByEntry = (linkedTreeMap = this.f10909).findByEntry((Map.Entry) obj)) == null) {
            return false;
        }
        linkedTreeMap.removeInternal(c3237FindByEntry, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10909.size;
    }
}
