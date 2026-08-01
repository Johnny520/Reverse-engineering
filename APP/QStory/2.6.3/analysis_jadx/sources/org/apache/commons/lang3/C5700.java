package org.apache.commons.lang3;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5700 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Class cls = (Class) obj;
        Class cls2 = (Class) obj2;
        if (cls.equals(cls2)) {
            return;
        }
        AbstractC5701.f15638.put(cls2, cls);
    }
}
