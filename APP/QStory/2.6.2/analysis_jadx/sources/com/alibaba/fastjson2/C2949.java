package com.alibaba.fastjson2;

import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2949 extends AbstractC2921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2951 f9338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9339;

    public C2949(AbstractC2951 abstractC2951, String str, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9338 = abstractC2951;
        boolean z = abstractC2951 instanceof C2947;
        boolean z2 = true;
        this.f9337 = z || (abstractC2951 instanceof C2946) || (abstractC2951 instanceof C2950);
        if ((abstractC2951 instanceof InterfaceC2939) || ((z && ((C2947) abstractC2951).f9334 < 0) || ((abstractC2951 instanceof C2954) && ((C2954) abstractC2951).m6363()))) {
            z2 = false;
        }
        this.f9339 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9338, ((C2949) obj).f9338);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9338);
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo5901() {
        return this.f9337;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo5902(AbstractC2898 abstractC2898) {
        AbstractC2951 abstractC2951 = this.f9338;
        C2925 c2925 = new C2925(this, null, abstractC2951, null);
        if (this.f9339) {
            abstractC2951.mo5909(abstractC2898, c2925);
        } else {
            c2925.f9268 = abstractC2898.mo6078();
            abstractC2951.mo5908(c2925);
        }
        return c2925.f9267;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo5903(Object obj) {
        AbstractC2951 abstractC2951 = this.f9338;
        C2925 c2925 = new C2925(this, null, abstractC2951, null);
        c2925.f9268 = obj;
        abstractC2951.mo5908(c2925);
        return c2925.f9267;
    }
}
