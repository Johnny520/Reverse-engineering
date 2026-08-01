package com.google.gson;

import com.google.gson.stream.JsonToken;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3250 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f10920;

    public C3250(AbstractC3251 abstractC3251) {
        this.f10920 = abstractC3251;
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f10920 + "]";
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) {
        if (obj == null) {
            c8244.m13778();
        } else {
            this.f10920.mo7322(c8244, obj);
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) {
        if (c8245.m13787() != JsonToken.NULL) {
            return this.f10920.mo7323(c8245);
        }
        c8245.m13793();
        return null;
    }
}
