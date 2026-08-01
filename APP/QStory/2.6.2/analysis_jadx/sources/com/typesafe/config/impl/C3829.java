package com.typesafe.config.impl;

import java.util.Iterator;
import p250.InterfaceC8166;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3829 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Iterator f12028;

    public C3829(Iterator it) {
        this.f12028 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12028.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (InterfaceC8166) this.f12028.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw SimpleConfigList.weAreImmutable("iterator().remove");
    }
}
