package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2946 extends AbstractC2922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2952 f9324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2952 f9325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f9326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9327;

    public C2946(String str, AbstractC2952 abstractC2952, AbstractC2952 abstractC29522, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9325 = abstractC2952;
        this.f9324 = abstractC29522;
        boolean z = abstractC2952 instanceof C2948;
        boolean z2 = true;
        this.f9327 = (z || (abstractC2952 instanceof C2947)) && ((abstractC29522 instanceof C2948) || (abstractC29522 instanceof C2947));
        if ((abstractC2952 instanceof InterfaceC2940) || ((z && ((C2948) abstractC2952).f9336 < 0) || (abstractC29522 instanceof InterfaceC2940) || ((abstractC29522 instanceof C2948) && ((C2948) abstractC29522).f9336 < 0))) {
            z2 = false;
        }
        this.f9326 = z2;
        if ((abstractC2952 instanceof C2955) && ((C2955) abstractC2952).m6421() && (abstractC29522 instanceof AbstractC2880)) {
            ((AbstractC2880) abstractC29522).f9110 = false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && C2946.class == obj.getClass()) {
            C2946 c2946 = (C2946) obj;
            if (this.f9325.equals(c2946.f9325) && this.f9324.equals(c2946.f9324)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9324.hashCode() + (this.f9325.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5946() {
        return this.f9327;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo5947(AbstractC2899 abstractC2899) {
        if (!this.f9326) {
            return mo5948(abstractC2899.mo6124());
        }
        AbstractC2952 abstractC2952 = this.f9325;
        AbstractC2952 abstractC29522 = this.f9324;
        C2926 c2926 = new C2926(this, null, abstractC2952, abstractC29522);
        abstractC2952.mo5954(abstractC2899, c2926);
        C2926 c29262 = new C2926(this, c2926, abstractC29522, null);
        if (c2926.f9275) {
            abstractC29522.mo5953(c29262);
        } else {
            abstractC29522.mo5954(abstractC2899, c29262);
        }
        Object objOf = c29262.f9269;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9262) != 0) {
            if (objOf == null) {
                objOf = new JSONArray();
            } else if (!(objOf instanceof List)) {
                objOf = JSONArray.of(objOf);
            }
        }
        return objOf instanceof C2921 ? ((C2921) objOf).f9260 : objOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5948(Object obj) {
        AbstractC2952 abstractC2952 = this.f9325;
        AbstractC2952 abstractC29522 = this.f9324;
        C2926 c2926 = new C2926(this, null, abstractC2952, abstractC29522);
        c2926.f9270 = obj;
        abstractC2952.mo5953(c2926);
        if (c2926.f9269 == null) {
            return null;
        }
        if ((abstractC2952 instanceof C2955) && ((C2955) abstractC2952).m6421() && (abstractC29522 instanceof AbstractC2880)) {
            ((AbstractC2880) abstractC29522).f9110 = false;
        }
        C2926 c29262 = new C2926(this, c2926, abstractC29522, null);
        abstractC29522.mo5953(c29262);
        Object obj2 = c29262.f9269;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9262) != 0) {
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
