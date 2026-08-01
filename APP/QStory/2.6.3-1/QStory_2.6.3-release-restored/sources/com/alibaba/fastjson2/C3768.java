package com.alibaba.fastjson2;

import androidx.collection.C1123;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3768 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3768 f9653 = new C3768();

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        if (c37592 == null) {
            c37592 = c3759;
        }
        c3759.f9614 = c37592.f9615;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        if (c3759.f9618 != null) {
            C1123.m1410("not support operation");
        } else {
            c3759.f9614 = abstractC3732.mo6684();
            c3759.f9620 = true;
        }
    }
}
