package com.alibaba.fastjson2;

import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3721 extends AbstractC3713 {
    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6517(Object obj) {
        Function function = this.f9450;
        if (function != null) {
            obj = function.apply(obj);
        }
        return obj == null;
    }
}
