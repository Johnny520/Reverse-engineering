package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2948 extends C2949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2947 f9335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f9336;

    public C2948(String str, C2947 c2947, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c2947, str, jSONPath$FeatureArr);
        this.f9335 = c2947;
        this.f9336 = c2947.f9334;
    }

    @Override // com.alibaba.fastjson2.C2949, com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo5902(AbstractC2898 abstractC2898) {
        boolean zMo6087 = abstractC2898.mo6087();
        boolean z = abstractC2898.f9197;
        if (zMo6087) {
            return null;
        }
        int iMo6187 = abstractC2898.mo6187();
        int i = this.f9336;
        if (z && i >= iMo6187) {
            return null;
        }
        if (!z && abstractC2898.mo6096()) {
            return null;
        }
        for (int i2 = 0; i2 < i && i2 < iMo6187; i2++) {
            abstractC2898.mo6188();
            if (!z && abstractC2898.mo6096()) {
                return null;
            }
        }
        return abstractC2898.mo6078();
    }

    @Override // com.alibaba.fastjson2.C2949, com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5903(Object obj) {
        if (obj != null) {
            if (!(obj instanceof List)) {
                C2947 c2947 = this.f9335;
                C2925 c2925 = new C2925(this, null, c2947, null);
                c2925.f9268 = obj;
                c2947.mo5908(c2925);
                return c2925.f9267;
            }
            List list = (List) obj;
            int size = list.size();
            int i = this.f9336;
            if (i < size) {
                return list.get(i);
            }
        }
        return null;
    }
}
