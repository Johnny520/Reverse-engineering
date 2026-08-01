package p073;

import io.ktor.util.C4210;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4906;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4902;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6939 extends AbstractC4906 implements InterfaceC4902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f18517;

    public C6939(AbstractC4877 abstractC4877) {
        abstractC4877.getClass();
        this.f18517 = abstractC4877;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4902
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4913 mo9843(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (!AbstractC4916.m9849(abstractC4913Mo9778) && !AbstractC4916.m9850(abstractC4913Mo9778)) {
            return abstractC4913Mo9778;
        }
        if (abstractC4913Mo9778 instanceof AbstractC4877) {
            AbstractC4877 abstractC4877 = (AbstractC4877) abstractC4913Mo9778;
            AbstractC4877 abstractC4877Mo9741 = abstractC4877.mo9741(false);
            return !AbstractC4916.m9849(abstractC4877) ? abstractC4877Mo9741 : new C6939(abstractC4877Mo9741);
        }
        if (!(abstractC4913Mo9778 instanceof AbstractC4895)) {
            C4210.m8621();
            return null;
        }
        AbstractC4895 abstractC4895 = (AbstractC4895) abstractC4913Mo9778;
        AbstractC4877 abstractC48772 = abstractC4895.f14212;
        AbstractC4877 abstractC4877Mo97412 = abstractC48772.mo9741(false);
        if (AbstractC4916.m9849(abstractC48772)) {
            abstractC4877Mo97412 = new C6939(abstractC4877Mo97412);
        }
        AbstractC4877 abstractC48773 = abstractC4895.f14213;
        AbstractC4877 abstractC4877Mo97413 = abstractC48773.mo9741(false);
        if (AbstractC4916.m9849(abstractC48773)) {
            abstractC4877Mo97413 = new C6939(abstractC4877Mo97413);
        }
        return AbstractC4892.m9811(AbstractC4892.m9815(abstractC4877Mo97412, abstractC4877Mo97413), AbstractC4892.m9814(abstractC4913Mo9778));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4902
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9844() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C6939(this.f18517.mo9776(c4873));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        return z ? this.f18517.mo9741(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        return new C6939(abstractC4877);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4877 mo9787() {
        return this.f18517;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4913 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C6939(this.f18517.mo9776(c4873));
    }
}
