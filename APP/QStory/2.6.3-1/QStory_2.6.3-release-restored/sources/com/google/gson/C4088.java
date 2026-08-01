package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4088 extends AbstractC4089 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f11298 = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4088) && ((C4088) obj).f11298.equals(this.f11298);
        }
        return true;
    }

    public final int hashCode() {
        return this.f11298.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11298.iterator();
    }
}
