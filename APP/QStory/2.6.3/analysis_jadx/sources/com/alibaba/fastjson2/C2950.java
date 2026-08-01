package com.alibaba.fastjson2;

import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2950 extends AbstractC2922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2952 f9340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9341;

    public C2950(AbstractC2952 abstractC2952, String str, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9340 = abstractC2952;
        boolean z = abstractC2952 instanceof C2948;
        boolean z2 = true;
        this.f9339 = z || (abstractC2952 instanceof C2947) || (abstractC2952 instanceof C2951);
        if ((abstractC2952 instanceof InterfaceC2940) || ((z && ((C2948) abstractC2952).f9336 < 0) || ((abstractC2952 instanceof C2955) && ((C2955) abstractC2952).m6421()))) {
            z2 = false;
        }
        this.f9341 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9340, ((C2950) obj).f9340);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9340);
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo5946() {
        return this.f9339;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo5947(AbstractC2899 abstractC2899) {
        AbstractC2952 abstractC2952 = this.f9340;
        C2926 c2926 = new C2926(this, null, abstractC2952, null);
        if (this.f9341) {
            abstractC2952.mo5954(abstractC2899, c2926);
        } else {
            c2926.f9270 = abstractC2899.mo6124();
            abstractC2952.mo5953(c2926);
        }
        return c2926.f9269;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo5948(Object obj) {
        AbstractC2952 abstractC2952 = this.f9340;
        C2926 c2926 = new C2926(this, null, abstractC2952, null);
        c2926.f9270 = obj;
        abstractC2952.mo5953(c2926);
        return c2926.f9269;
    }
}
