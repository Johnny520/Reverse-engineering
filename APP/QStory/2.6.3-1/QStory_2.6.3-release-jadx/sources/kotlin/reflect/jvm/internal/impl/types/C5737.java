package kotlin.reflect.jvm.internal.impl.types;

import p062.InterfaceC7310;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5737 extends AbstractC5748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5748 f14573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5748 f14574;

    public C5737(AbstractC5748 abstractC5748, AbstractC5748 abstractC57482) {
        this.f14574 = abstractC5748;
        this.f14573 = abstractC57482;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC5714 mo10292(AbstractC5714 abstractC5714, Variance variance) {
        abstractC5714.getClass();
        variance.getClass();
        return this.f14573.mo10292(this.f14574.mo10292(abstractC5714, variance), variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC5702 mo10291(AbstractC5714 abstractC5714) {
        AbstractC5702 abstractC5702Mo10291 = this.f14574.mo10291(abstractC5714);
        return abstractC5702Mo10291 == null ? this.f14573.mo10291(abstractC5714) : abstractC5702Mo10291;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7310 mo10294(InterfaceC7310 interfaceC7310) {
        interfaceC7310.getClass();
        return this.f14573.mo10294(this.f14574.mo10294(interfaceC7310));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo10295() {
        return this.f14574.mo10295() || this.f14573.mo10295();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10296() {
        return this.f14574.mo10296() || this.f14573.mo10296();
    }
}
