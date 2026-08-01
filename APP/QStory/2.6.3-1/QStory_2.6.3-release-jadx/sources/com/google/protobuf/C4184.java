package com.google.protobuf;

import androidx.collection.C1109;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4184 extends C1109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4182 f11346;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4184(C4182 c4182) {
        super(1, c4182);
        this.f11346 = c4182;
    }

    @Override // androidx.collection.C1109, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4181(this.f11346);
    }
}
