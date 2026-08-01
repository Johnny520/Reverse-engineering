package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3597 extends AbstractC3599 {
    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            ((AtomicReference) this.f8772.invoke(obj, null)).set(obj2);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo6045() {
        return true;
    }
}
