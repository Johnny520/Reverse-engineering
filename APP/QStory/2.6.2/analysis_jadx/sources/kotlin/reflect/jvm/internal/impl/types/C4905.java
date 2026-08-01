package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import p097.InterfaceC7221;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4905 extends AbstractC4906 implements InterfaceC4902, InterfaceC7221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f14226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14227;

    public C4905(AbstractC4877 abstractC4877, boolean z) {
        this.f14226 = abstractC4877;
        this.f14227 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    public final String toString() {
        return this.f14226 + " & Any";
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
        return AbstractC4892.m9833(abstractC4881.mo9778(), this.f14227);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4902
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9844() {
        AbstractC4877 abstractC4877 = this.f14226;
        abstractC4877.mo9732();
        return abstractC4877.mo9732().mo9221() instanceof InterfaceC4462;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C4905(this.f14226.mo9776(c4873), this.f14227);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        return z ? this.f14226.mo9741(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        return new C4905(abstractC4877, this.f14227);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4877 mo9787() {
        return this.f14226;
    }
}
