package com.google.protobuf;

import androidx.collection.C0262;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3351 extends C0262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3349 f10996;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3351(C3349 c3349) {
        super(1, c3349);
        this.f10996 = c3349;
    }

    @Override // androidx.collection.C0262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3348(this.f10996);
    }
}
