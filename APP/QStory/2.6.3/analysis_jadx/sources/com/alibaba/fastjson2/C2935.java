package com.alibaba.fastjson2;

import androidx.collection.C0276;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2935 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2935 f9308 = new C2935();

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        if (c29262 == null) {
            c29262 = c2926;
        }
        c2926.f9269 = c29262.f9270;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        if (c2926.f9273 != null) {
            C0276.m850("not support operation");
        } else {
            c2926.f9269 = abstractC2899.mo6124();
            c2926.f9275 = true;
        }
    }
}
