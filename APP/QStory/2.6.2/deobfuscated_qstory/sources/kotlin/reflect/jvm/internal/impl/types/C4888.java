package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p052.InterfaceC6557;
import p098.C7231;
import p098.C7240;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4888 extends AbstractC4877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7253 f14200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14201;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6557 f14202;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4872 f14203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14204;

    public C4888(InterfaceC4872 interfaceC4872, List list, boolean z, InterfaceC7253 interfaceC7253, InterfaceC6557 interfaceC6557) {
        interfaceC4872.getClass();
        list.getClass();
        interfaceC7253.getClass();
        this.f14203 = interfaceC4872;
        this.f14204 = list;
        this.f14201 = z;
        this.f14200 = interfaceC7253;
        this.f14202 = interfaceC6557;
        if (!(interfaceC7253 instanceof C7231) || (interfaceC7253 instanceof C7240)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC7253 + '\n' + interfaceC4872);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = (AbstractC4877) this.f14202.invoke(abstractC4860);
        return abstractC4877 == null ? this : abstractC4877;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4872 mo9732() {
        return this.f14203;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4873 mo9733() {
        C4873.f14171.getClass();
        return C4873.f14172;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo9734() {
        return this.f14200;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        return this.f14201;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9736() {
        return this.f14204;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return c4873.isEmpty() ? this : new C4887(this, c4873);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        return z == this.f14201 ? this : z ? new C4878(this, 1) : new C4878(this, 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = (AbstractC4877) this.f14202.invoke(abstractC4860);
        return abstractC4877 == null ? this : abstractC4877;
    }
}
