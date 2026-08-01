package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3782 extends C3783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3781 f9682;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f9683;

    public C3782(String str, C3781 c3781, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c3781, str, jSONPath$FeatureArr);
        this.f9682 = c3781;
        this.f9683 = c3781.f9681;
    }

    @Override // com.alibaba.fastjson2.C3783, com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo6507(AbstractC3732 abstractC3732) {
        boolean zMo6693 = abstractC3732.mo6693();
        boolean z = abstractC3732.f9544;
        if (zMo6693) {
            return null;
        }
        int iMo6792 = abstractC3732.mo6792();
        int i = this.f9683;
        if (z && i >= iMo6792) {
            return null;
        }
        if (!z && abstractC3732.mo6702()) {
            return null;
        }
        for (int i2 = 0; i2 < i && i2 < iMo6792; i2++) {
            abstractC3732.mo6793();
            if (!z && abstractC3732.mo6702()) {
                return null;
            }
        }
        return abstractC3732.mo6684();
    }

    @Override // com.alibaba.fastjson2.C3783, com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo6508(Object obj) {
        if (obj != null) {
            if (!(obj instanceof List)) {
                C3781 c3781 = this.f9682;
                C3759 c3759 = new C3759(this, null, c3781, null);
                c3759.f9615 = obj;
                c3781.mo6513(c3759);
                return c3759.f9614;
            }
            List list = (List) obj;
            int size = list.size();
            int i = this.f9683;
            if (i < size) {
                return list.get(i);
            }
        }
        return null;
    }
}
