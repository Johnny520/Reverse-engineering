package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2764 extends AbstractC2766 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            ((AtomicReference) this.f8427.invoke(obj, null)).set(obj2);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5485() {
        return true;
    }
}
