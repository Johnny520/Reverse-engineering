package com.alibaba.fastjson2;

import androidx.collection.C0276;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2934 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2934 f9306 = new C2934();

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        if (c29252 == null) {
            c29252 = c2925;
        }
        c2925.f9267 = c29252.f9268;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        if (c2925.f9271 != null) {
            C0276.m849("not support operation");
        } else {
            c2925.f9267 = abstractC2898.mo6078();
            c2925.f9273 = true;
        }
    }
}
