package p073;

import io.ktor.util.C4211;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4907;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4903;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6940 extends AbstractC4907 implements InterfaceC4903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 f18512;

    public C6940(AbstractC4878 abstractC4878) {
        abstractC4878.getClass();
        this.f18512 = abstractC4878;
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
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (!AbstractC4917.m9843(abstractC4914Mo9772) && !AbstractC4917.m9844(abstractC4914Mo9772)) {
            return abstractC4914Mo9772;
        }
        if (abstractC4914Mo9772 instanceof AbstractC4878) {
            AbstractC4878 abstractC4878 = (AbstractC4878) abstractC4914Mo9772;
            AbstractC4878 abstractC4878Mo9731 = abstractC4878.mo9731(false);
            return !AbstractC4917.m9843(abstractC4878) ? abstractC4878Mo9731 : new C6940(abstractC4878Mo9731);
        }
        if (!(abstractC4914Mo9772 instanceof AbstractC4896)) {
            C4211.m8611();
            return null;
        }
        AbstractC4896 abstractC4896 = (AbstractC4896) abstractC4914Mo9772;
        AbstractC4878 abstractC48782 = abstractC4896.f14216;
        AbstractC4878 abstractC4878Mo97312 = abstractC48782.mo9731(false);
        if (AbstractC4917.m9843(abstractC48782)) {
            abstractC4878Mo97312 = new C6940(abstractC4878Mo97312);
        }
        AbstractC4878 abstractC48783 = abstractC4896.f14217;
        AbstractC4878 abstractC4878Mo97313 = abstractC48783.mo9731(false);
        if (AbstractC4917.m9843(abstractC48783)) {
            abstractC4878Mo97313 = new C6940(abstractC4878Mo97313);
        }
        return AbstractC4893.m9805(AbstractC4893.m9809(abstractC4878Mo97312, abstractC4878Mo97313), AbstractC4893.m9808(abstractC4914Mo9772));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4903
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9838() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C6940(this.f18512.mo9770(c4874));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        return z ? this.f18512.mo9731(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        return new C6940(abstractC4878);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4878 mo9781() {
        return this.f18512;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4914 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C6940(this.f18512.mo9770(c4874));
    }
}
