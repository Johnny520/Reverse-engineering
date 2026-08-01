package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2763 extends AbstractC2765 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            ((AtomicReference) this.f8425.invoke(obj, null)).set(obj2);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5440() {
        return true;
    }
}
