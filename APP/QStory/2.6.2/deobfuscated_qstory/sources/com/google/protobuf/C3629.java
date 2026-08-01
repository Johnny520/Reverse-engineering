package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世苏兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3629 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Iterator f11269;

    public C3629(C3679 c3679) {
        this.f11269 = c3679.m7924();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11269.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f11269.next();
        return new C3630(entry.getValue());
    }
}
