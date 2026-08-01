package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2949 extends C2950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2948 f9337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f9338;

    public C2949(String str, C2948 c2948, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c2948, str, jSONPath$FeatureArr);
        this.f9337 = c2948;
        this.f9338 = c2948.f9336;
    }

    @Override // com.alibaba.fastjson2.C2950, com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo5947(AbstractC2899 abstractC2899) {
        boolean zMo6133 = abstractC2899.mo6133();
        boolean z = abstractC2899.f9199;
        if (zMo6133) {
            return null;
        }
        int iMo6232 = abstractC2899.mo6232();
        int i = this.f9338;
        if (z && i >= iMo6232) {
            return null;
        }
        if (!z && abstractC2899.mo6142()) {
            return null;
        }
        for (int i2 = 0; i2 < i && i2 < iMo6232; i2++) {
            abstractC2899.mo6233();
            if (!z && abstractC2899.mo6142()) {
                return null;
            }
        }
        return abstractC2899.mo6124();
    }

    @Override // com.alibaba.fastjson2.C2950, com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5948(Object obj) {
        if (obj != null) {
            if (!(obj instanceof List)) {
                C2948 c2948 = this.f9337;
                C2926 c2926 = new C2926(this, null, c2948, null);
                c2926.f9270 = obj;
                c2948.mo5953(c2926);
                return c2926.f9269;
            }
            List list = (List) obj;
            int size = list.size();
            int i = this.f9338;
            if (i < size) {
                return list.get(i);
            }
        }
        return null;
    }
}
