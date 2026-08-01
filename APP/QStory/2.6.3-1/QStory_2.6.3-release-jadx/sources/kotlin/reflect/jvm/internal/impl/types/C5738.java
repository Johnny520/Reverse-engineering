package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import p113.InterfaceC8051;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5738 extends AbstractC5739 implements InterfaceC5735, InterfaceC8051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f14575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14576;

    public C5738(AbstractC5710 abstractC5710, boolean z) {
        this.f14575 = abstractC5710;
        this.f14576 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    public final String toString() {
        return this.f14575 + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC5746 mo10396(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        return AbstractC5725.m10386(abstractC5714.mo10331(), this.f14576);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo10397() {
        AbstractC5710 abstractC5710 = this.f14575;
        abstractC5710.mo10281();
        return abstractC5710.mo10281().mo9770() instanceof InterfaceC5295;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C5738(this.f14575.mo10329(c5706), this.f14576);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        return z ? this.f14575.mo10290(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        return new C5738(abstractC5710, this.f14576);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC5710 mo10340() {
        return this.f14575;
    }
}
