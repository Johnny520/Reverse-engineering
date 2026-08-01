package com.alibaba.fastjson2;

import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3779 extends AbstractC3755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3785 f9669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3785 f9670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f9671;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9672;

    public C3779(String str, AbstractC3785 abstractC3785, AbstractC3785 abstractC37852, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9670 = abstractC3785;
        this.f9669 = abstractC37852;
        boolean z = abstractC3785 instanceof C3781;
        boolean z2 = true;
        this.f9672 = (z || (abstractC3785 instanceof C3780)) && ((abstractC37852 instanceof C3781) || (abstractC37852 instanceof C3780));
        if ((abstractC3785 instanceof InterfaceC3773) || ((z && ((C3781) abstractC3785).f9681 < 0) || (abstractC37852 instanceof InterfaceC3773) || ((abstractC37852 instanceof C3781) && ((C3781) abstractC37852).f9681 < 0))) {
            z2 = false;
        }
        this.f9671 = z2;
        if ((abstractC3785 instanceof C3788) && ((C3788) abstractC3785).m6981() && (abstractC37852 instanceof AbstractC3713)) {
            ((AbstractC3713) abstractC37852).f9455 = false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && C3779.class == obj.getClass()) {
            C3779 c3779 = (C3779) obj;
            if (this.f9670.equals(c3779.f9670) && this.f9669.equals(c3779.f9669)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9669.hashCode() + (this.f9670.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6506() {
        return this.f9672;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo6507(AbstractC3732 abstractC3732) {
        if (!this.f9671) {
            return mo6508(abstractC3732.mo6684());
        }
        AbstractC3785 abstractC3785 = this.f9670;
        AbstractC3785 abstractC37852 = this.f9669;
        C3759 c3759 = new C3759(this, null, abstractC3785, abstractC37852);
        abstractC3785.mo6514(abstractC3732, c3759);
        C3759 c37592 = new C3759(this, c3759, abstractC37852, null);
        if (c3759.f9620) {
            abstractC37852.mo6513(c37592);
        } else {
            abstractC37852.mo6514(abstractC3732, c37592);
        }
        Object objM0of = c37592.f9614;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9607) != 0) {
            if (objM0of == null) {
                objM0of = new JSONArray();
            } else if (!(objM0of instanceof List)) {
                objM0of = JSONArray.m0of(objM0of);
            }
        }
        return objM0of instanceof C3754 ? ((C3754) objM0of).f9605 : objM0of;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo6508(Object obj) {
        AbstractC3785 abstractC3785 = this.f9670;
        AbstractC3785 abstractC37852 = this.f9669;
        C3759 c3759 = new C3759(this, null, abstractC3785, abstractC37852);
        c3759.f9615 = obj;
        abstractC3785.mo6513(c3759);
        if (c3759.f9614 == null) {
            return null;
        }
        if ((abstractC3785 instanceof C3788) && ((C3788) abstractC3785).m6981() && (abstractC37852 instanceof AbstractC3713)) {
            ((AbstractC3713) abstractC37852).f9455 = false;
        }
        C3759 c37592 = new C3759(this, c3759, abstractC37852, null);
        abstractC37852.mo6513(c37592);
        Object obj2 = c37592.f9614;
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9607) != 0) {
            if (obj2 == null) {
                return new JSONArray();
            }
            if (!(obj2 instanceof List)) {
                return JSONArray.m0of(obj2);
            }
        }
        return obj2;
    }
}
