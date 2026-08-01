package com.google.protobuf;

import androidx.collection.C0262;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3352 extends C0262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3350 f11001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3352(C3350 c3350) {
        super(1, c3350);
        this.f11001 = c3350;
    }

    @Override // androidx.collection.C0262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3349(this.f11001);
    }
}
