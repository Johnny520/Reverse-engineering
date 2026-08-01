package com.typesafe.config.impl;

import java.util.Iterator;
import p250.InterfaceC8167;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3830 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Iterator f12033;

    public C3830(Iterator it) {
        this.f12033 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12033.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (InterfaceC8167) this.f12033.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw SimpleConfigList.weAreImmutable("iterator().remove");
    }
}
