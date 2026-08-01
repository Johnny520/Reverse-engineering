package com.google.gson;

import com.google.gson.stream.JsonToken;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3249 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f10915;

    public C3249(AbstractC3250 abstractC3250) {
        this.f10915 = abstractC3250;
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f10915 + "]";
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) {
        if (obj == null) {
            c8243.m13762();
        } else {
            this.f10915.mo7335(c8243, obj);
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) {
        if (c8244.m13770() != JsonToken.NULL) {
            return this.f10915.mo7336(c8244);
        }
        c8244.m13775();
        return null;
    }
}
