package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import p097.InterfaceC7222;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4906 extends AbstractC4907 implements InterfaceC4903, InterfaceC7222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 f14230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14231;

    public C4906(AbstractC4878 abstractC4878, boolean z) {
        this.f14230 = abstractC4878;
        this.f14231 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    public final String toString() {
        return this.f14230 + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4903
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4914 mo9837(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        return AbstractC4893.m9827(abstractC4882.mo9772(), this.f14231);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4903
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9838() {
        AbstractC4878 abstractC4878 = this.f14230;
        abstractC4878.mo9722();
        return abstractC4878.mo9722().mo9211() instanceof InterfaceC4463;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C4906(this.f14230.mo9770(c4874), this.f14231);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        return z ? this.f14230.mo9731(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        return new C4906(abstractC4878, this.f14231);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4878 mo9781() {
        return this.f14230;
    }
}
