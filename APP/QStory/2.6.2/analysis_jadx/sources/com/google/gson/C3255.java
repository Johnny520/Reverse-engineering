package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3255 extends AbstractC3256 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f10948 = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3255) && ((C3255) obj).f10948.equals(this.f10948);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10948.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10948.iterator();
    }
}
