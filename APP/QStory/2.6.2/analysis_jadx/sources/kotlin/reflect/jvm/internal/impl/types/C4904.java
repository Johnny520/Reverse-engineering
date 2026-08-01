package kotlin.reflect.jvm.internal.impl.types;

import p046.InterfaceC6480;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4904 extends AbstractC4915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4915 f14224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4915 f14225;

    public C4904(AbstractC4915 abstractC4915, AbstractC4915 abstractC49152) {
        this.f14225 = abstractC4915;
        this.f14224 = abstractC49152;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4881 mo9743(AbstractC4881 abstractC4881, Variance variance) {
        abstractC4881.getClass();
        variance.getClass();
        return this.f14224.mo9743(this.f14225.mo9743(abstractC4881, variance), variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4869 mo9742(AbstractC4881 abstractC4881) {
        AbstractC4869 abstractC4869Mo9742 = this.f14225.mo9742(abstractC4881);
        return abstractC4869Mo9742 == null ? this.f14224.mo9742(abstractC4881) : abstractC4869Mo9742;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6480 mo9745(InterfaceC6480 interfaceC6480) {
        interfaceC6480.getClass();
        return this.f14224.mo9745(this.f14225.mo9745(interfaceC6480));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9746() {
        return this.f14225.mo9746() || this.f14224.mo9746();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo9747() {
        return this.f14225.mo9747() || this.f14224.mo9747();
    }
}
