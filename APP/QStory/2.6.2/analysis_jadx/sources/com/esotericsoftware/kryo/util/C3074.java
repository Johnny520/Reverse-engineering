package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.util.Pool;
import java.lang.ref.SoftReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3074 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Pool.SoftReferenceQueue.lambda$clean$0((SoftReference) obj);
    }
}
