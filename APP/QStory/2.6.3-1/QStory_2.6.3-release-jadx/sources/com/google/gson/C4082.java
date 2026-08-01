package com.google.gson;

import com.google.gson.stream.JsonToken;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4082 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f11265;

    public C4082(AbstractC4083 abstractC4083) {
        this.f11265 = abstractC4083;
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f11265 + "]";
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) {
        if (obj == null) {
            c9073.m14337();
        } else {
            this.f11265.mo7881(c9073, obj);
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) {
        if (c9074.m14346() != JsonToken.NULL) {
            return this.f11265.mo7882(c9074);
        }
        c9074.m14352();
        return null;
    }
}
