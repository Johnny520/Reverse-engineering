package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.util.Pool;
import java.lang.ref.SoftReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3075 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Pool.SoftReferenceQueue.lambda$clean$0((SoftReference) obj);
    }
}
