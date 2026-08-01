package kotlin.reflect.jvm.internal.impl.types;

import p046.InterfaceC6481;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4905 extends AbstractC4916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4916 f14228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4916 f14229;

    public C4905(AbstractC4916 abstractC4916, AbstractC4916 abstractC49162) {
        this.f14229 = abstractC4916;
        this.f14228 = abstractC49162;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4882 mo9733(AbstractC4882 abstractC4882, Variance variance) {
        abstractC4882.getClass();
        variance.getClass();
        return this.f14228.mo9733(this.f14229.mo9733(abstractC4882, variance), variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4870 mo9732(AbstractC4882 abstractC4882) {
        AbstractC4870 abstractC4870Mo9732 = this.f14229.mo9732(abstractC4882);
        return abstractC4870Mo9732 == null ? this.f14228.mo9732(abstractC4882) : abstractC4870Mo9732;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6481 mo9735(InterfaceC6481 interfaceC6481) {
        interfaceC6481.getClass();
        return this.f14228.mo9735(this.f14229.mo9735(interfaceC6481));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9736() {
        return this.f14229.mo9736() || this.f14228.mo9736();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo9737() {
        return this.f14229.mo9737() || this.f14228.mo9737();
    }
}
