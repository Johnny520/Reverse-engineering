package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3256 extends AbstractC3257 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f10953 = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3256) && ((C3256) obj).f10953.equals(this.f10953);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10953.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10953.iterator();
    }
}
