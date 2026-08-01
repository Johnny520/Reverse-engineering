package kotlin.reflect.jvm.internal.impl.types;

import io.ktor.websocket.C4265;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.renderer.C4742;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4900 extends AbstractC4895 implements InterfaceC4917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC4881 f14220;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4895 f14221;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4900(AbstractC4895 abstractC4895, AbstractC4881 abstractC4881) {
        super(abstractC4895.f14212, abstractC4895.f14213);
        abstractC4895.getClass();
        abstractC4881.getClass();
        this.f14221 = abstractC4895;
        this.f14220 = abstractC4881;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14220 + ")] " + this.f14221;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4895 abstractC4895 = this.f14221;
        abstractC4895.getClass();
        AbstractC4881 abstractC4881 = this.f14220;
        abstractC4881.getClass();
        return new C4900(abstractC4895, abstractC4881);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4917
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC4881 mo9783() {
        return this.f14220;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4917
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC4913 mo9784() {
        return this.f14221;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9841(C4743 c4743, C4743 c47432) {
        C4265 c4265 = c47432.f13888.f13870;
        InterfaceC5087 interfaceC5087 = C4742.f13832[11];
        c4265.getClass();
        interfaceC5087.getClass();
        return ((Boolean) c4265.f12802).booleanValue() ? c4743.m9496(this.f14220) : this.f14221.mo9841(c4743, c47432);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9842() {
        return this.f14221.mo9842();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4895 abstractC4895 = this.f14221;
        abstractC4895.getClass();
        AbstractC4881 abstractC4881 = this.f14220;
        abstractC4881.getClass();
        return new C4900(abstractC4895, abstractC4881);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4913 mo9741(boolean z) {
        return AbstractC4892.m9811(this.f14221.mo9741(z), this.f14220.mo9778().mo9741(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4913 mo9776(C4873 c4873) {
        c4873.getClass();
        return AbstractC4892.m9811(this.f14221.mo9776(c4873), this.f14220);
    }
}
