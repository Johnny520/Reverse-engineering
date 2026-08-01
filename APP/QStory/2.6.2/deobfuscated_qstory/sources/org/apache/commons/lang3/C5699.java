package org.apache.commons.lang3;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5699 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Class cls = (Class) obj;
        Class cls2 = (Class) obj2;
        if (cls.equals(cls2)) {
            return;
        }
        AbstractC5700.f15638.put(cls2, cls);
    }
}
