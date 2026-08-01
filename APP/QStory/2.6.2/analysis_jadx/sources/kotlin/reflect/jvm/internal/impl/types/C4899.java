package kotlin.reflect.jvm.internal.impl.types;

import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4899 extends AbstractC4895 implements InterfaceC4902 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    public final String toString() {
        return "(" + this.f14212 + ".." + this.f14213 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14212;
        abstractC4877.getClass();
        AbstractC4877 abstractC48772 = this.f14213;
        abstractC48772.getClass();
        return new C4899(abstractC4877, abstractC48772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4902
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC4913 mo9843(AbstractC4881 abstractC4881) {
        AbstractC4913 abstractC4913M9815;
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            abstractC4913M9815 = abstractC4913Mo9778;
        } else {
            if (!(abstractC4913Mo9778 instanceof AbstractC4877)) {
                C4210.m8621();
                return null;
            }
            AbstractC4877 abstractC4877 = (AbstractC4877) abstractC4913Mo9778;
            abstractC4913M9815 = AbstractC4892.m9815(abstractC4877, abstractC4877.mo9741(true));
        }
        return AbstractC4892.m9830(abstractC4913M9815, abstractC4913Mo9778);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4902
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo9844() {
        AbstractC4877 abstractC4877 = this.f14212;
        return (abstractC4877.mo9732().mo9221() instanceof InterfaceC4462) && AbstractC4394.m8917(abstractC4877.mo9732(), this.f14213.mo9732());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9841(C4743 c4743, C4743 c47432) {
        boolean zM9452 = c47432.f13888.m9452();
        AbstractC4877 abstractC4877 = this.f14213;
        AbstractC4877 abstractC48772 = this.f14212;
        if (!zM9452) {
            return c4743.m9479(c4743.m9496(abstractC48772), c4743.m9496(abstractC4877), AbstractC7738.m13053(this));
        }
        return "(" + c4743.m9496(abstractC48772) + ".." + c4743.m9496(abstractC4877) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4895
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9842() {
        return this.f14212;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14212;
        abstractC4877.getClass();
        AbstractC4877 abstractC48772 = this.f14213;
        abstractC48772.getClass();
        return new C4899(abstractC4877, abstractC48772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4913 mo9741(boolean z) {
        return AbstractC4892.m9815(this.f14212.mo9741(z), this.f14213.mo9741(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4913 mo9776(C4873 c4873) {
        c4873.getClass();
        return AbstractC4892.m9815(this.f14212.mo9776(c4873), this.f14213.mo9776(c4873));
    }
}
