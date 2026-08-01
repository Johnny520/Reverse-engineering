package kotlin.reflect.jvm.internal.impl.types;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4900 extends AbstractC4896 implements InterfaceC4903 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    public final String toString() {
        return "(" + this.f14216 + ".." + this.f14217 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14216;
        abstractC4878.getClass();
        AbstractC4878 abstractC48782 = this.f14217;
        abstractC48782.getClass();
        return new C4900(abstractC4878, abstractC48782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4903
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC4914 mo9837(AbstractC4882 abstractC4882) {
        AbstractC4914 abstractC4914M9809;
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            abstractC4914M9809 = abstractC4914Mo9772;
        } else {
            if (!(abstractC4914Mo9772 instanceof AbstractC4878)) {
                C4211.m8611();
                return null;
            }
            AbstractC4878 abstractC4878 = (AbstractC4878) abstractC4914Mo9772;
            abstractC4914M9809 = AbstractC4893.m9809(abstractC4878, abstractC4878.mo9731(true));
        }
        return AbstractC4893.m9824(abstractC4914M9809, abstractC4914Mo9772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4903
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo9838() {
        AbstractC4878 abstractC4878 = this.f14216;
        return (abstractC4878.mo9722().mo9211() instanceof InterfaceC4463) && AbstractC4395.m8907(abstractC4878.mo9722(), this.f14217.mo9722());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9835(C4744 c4744, C4744 c47442) {
        boolean zM9442 = c47442.f13892.m9442();
        AbstractC4878 abstractC4878 = this.f14217;
        AbstractC4878 abstractC48782 = this.f14216;
        if (!zM9442) {
            return c4744.m9469(c4744.m9486(abstractC48782), c4744.m9486(abstractC4878), AbstractC2905.m6317(this));
        }
        return "(" + c4744.m9486(abstractC48782) + ".." + c4744.m9486(abstractC4878) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9836() {
        return this.f14216;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14216;
        abstractC4878.getClass();
        AbstractC4878 abstractC48782 = this.f14217;
        abstractC48782.getClass();
        return new C4900(abstractC4878, abstractC48782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4914 mo9731(boolean z) {
        return AbstractC4893.m9809(this.f14216.mo9731(z), this.f14217.mo9731(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4914 mo9770(C4874 c4874) {
        c4874.getClass();
        return AbstractC4893.m9809(this.f14216.mo9770(c4874), this.f14217.mo9770(c4874));
    }
}
