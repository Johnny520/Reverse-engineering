package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2945 extends AbstractC2921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2951 f9322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2951 f9323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f9324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9325;

    public C2945(String str, AbstractC2951 abstractC2951, AbstractC2951 abstractC29512, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9323 = abstractC2951;
        this.f9322 = abstractC29512;
        boolean z = abstractC2951 instanceof C2947;
        boolean z2 = true;
        this.f9325 = (z || (abstractC2951 instanceof C2946)) && ((abstractC29512 instanceof C2947) || (abstractC29512 instanceof C2946));
        if ((abstractC2951 instanceof InterfaceC2939) || ((z && ((C2947) abstractC2951).f9334 < 0) || (abstractC29512 instanceof InterfaceC2939) || ((abstractC29512 instanceof C2947) && ((C2947) abstractC29512).f9334 < 0))) {
            z2 = false;
        }
        this.f9324 = z2;
        if ((abstractC2951 instanceof C2954) && ((C2954) abstractC2951).m6363() && (abstractC29512 instanceof AbstractC2879)) {
            ((AbstractC2879) abstractC29512).f9108 = false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && C2945.class == obj.getClass()) {
            C2945 c2945 = (C2945) obj;
            if (this.f9323.equals(c2945.f9323) && this.f9322.equals(c2945.f9322)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9322.hashCode() + (this.f9323.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5901() {
        return this.f9325;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo5902(AbstractC2898 abstractC2898) {
        if (!this.f9324) {
            return mo5903(abstractC2898.mo6078());
        }
        AbstractC2951 abstractC2951 = this.f9323;
        AbstractC2951 abstractC29512 = this.f9322;
        C2925 c2925 = new C2925(this, null, abstractC2951, abstractC29512);
        abstractC2951.mo5909(abstractC2898, c2925);
        C2925 c29252 = new C2925(this, c2925, abstractC29512, null);
        if (c2925.f9273) {
            abstractC29512.mo5908(c29252);
        } else {
            abstractC29512.mo5909(abstractC2898, c29252);
        }
        Object objOf = c29252.f9267;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9260) != 0) {
            if (objOf == null) {
                objOf = new JSONArray();
            } else if (!(objOf instanceof List)) {
                objOf = JSONArray.of(objOf);
            }
        }
        return objOf instanceof C2920 ? ((C2920) objOf).f9258 : objOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5903(Object obj) {
        AbstractC2951 abstractC2951 = this.f9323;
        AbstractC2951 abstractC29512 = this.f9322;
        C2925 c2925 = new C2925(this, null, abstractC2951, abstractC29512);
        c2925.f9268 = obj;
        abstractC2951.mo5908(c2925);
        if (c2925.f9267 == null) {
            return null;
        }
        if ((abstractC2951 instanceof C2954) && ((C2954) abstractC2951).m6363() && (abstractC29512 instanceof AbstractC2879)) {
            ((AbstractC2879) abstractC29512).f9108 = false;
        }
        C2925 c29252 = new C2925(this, c2925, abstractC29512, null);
        abstractC29512.mo5908(c29252);
        Object obj2 = c29252.f9267;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9260) != 0) {
            if (obj2 == null) {
                return new JSONArray();
            }
            if (!(obj2 instanceof List)) {
                return JSONArray.of(obj2);
            }
        }
        return obj2;
    }
}
