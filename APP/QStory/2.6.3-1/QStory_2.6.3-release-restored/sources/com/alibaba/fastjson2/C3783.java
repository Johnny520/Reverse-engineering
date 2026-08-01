package com.alibaba.fastjson2;

import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3783 extends AbstractC3755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3785 f9685;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9686;

    public C3783(AbstractC3785 abstractC3785, String str, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9685 = abstractC3785;
        boolean z = abstractC3785 instanceof C3781;
        boolean z2 = true;
        this.f9684 = z || (abstractC3785 instanceof C3780) || (abstractC3785 instanceof C3784);
        if ((abstractC3785 instanceof InterfaceC3773) || ((z && ((C3781) abstractC3785).f9681 < 0) || ((abstractC3785 instanceof C3788) && ((C3788) abstractC3785).m6981()))) {
            z2 = false;
        }
        this.f9686 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9685, ((C3783) obj).f9685);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9685);
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo6506() {
        return this.f9684;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo6507(AbstractC3732 abstractC3732) {
        AbstractC3785 abstractC3785 = this.f9685;
        C3759 c3759 = new C3759(this, null, abstractC3785, null);
        if (this.f9686) {
            abstractC3785.mo6514(abstractC3732, c3759);
        } else {
            c3759.f9615 = abstractC3732.mo6684();
            abstractC3785.mo6513(c3759);
        }
        return c3759.f9614;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo6508(Object obj) {
        AbstractC3785 abstractC3785 = this.f9685;
        C3759 c3759 = new C3759(this, null, abstractC3785, null);
        c3759.f9615 = obj;
        abstractC3785.mo6513(c3759);
        return c3759.f9614;
    }
}
