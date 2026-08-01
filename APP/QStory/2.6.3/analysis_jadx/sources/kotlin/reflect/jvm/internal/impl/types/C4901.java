package kotlin.reflect.jvm.internal.impl.types;

import io.ktor.websocket.C4266;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4901 extends AbstractC4896 implements InterfaceC4918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC4882 f14224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4896 f14225;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4901(AbstractC4896 abstractC4896, AbstractC4882 abstractC4882) {
        super(abstractC4896.f14216, abstractC4896.f14217);
        abstractC4896.getClass();
        abstractC4882.getClass();
        this.f14225 = abstractC4896;
        this.f14224 = abstractC4882;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14224 + ")] " + this.f14225;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4896 abstractC4896 = this.f14225;
        abstractC4896.getClass();
        AbstractC4882 abstractC4882 = this.f14224;
        abstractC4882.getClass();
        return new C4901(abstractC4896, abstractC4882);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4918
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC4882 mo9777() {
        return this.f14224;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4918
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC4914 mo9778() {
        return this.f14225;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9835(C4744 c4744, C4744 c47442) {
        C4266 c4266 = c47442.f13892.f13874;
        InterfaceC5088 interfaceC5088 = C4743.f13836[11];
        c4266.getClass();
        interfaceC5088.getClass();
        return ((Boolean) c4266.f12806).booleanValue() ? c4744.m9486(this.f14224) : this.f14225.mo9835(c4744, c47442);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9836() {
        return this.f14225.mo9836();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4896 abstractC4896 = this.f14225;
        abstractC4896.getClass();
        AbstractC4882 abstractC4882 = this.f14224;
        abstractC4882.getClass();
        return new C4901(abstractC4896, abstractC4882);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4914 mo9731(boolean z) {
        return AbstractC4893.m9805(this.f14225.mo9731(z), this.f14224.mo9772().mo9731(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4914 mo9770(C4874 c4874) {
        c4874.getClass();
        return AbstractC4893.m9805(this.f14225.mo9770(c4874), this.f14224);
    }
}
