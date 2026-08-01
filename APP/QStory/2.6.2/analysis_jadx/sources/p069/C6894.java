package p069;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.C4861;
import p049.AbstractC6529;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6894 implements InterfaceC6895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4861 f18354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4869 f18355;

    public C6894(AbstractC4869 abstractC4869) {
        abstractC4869.getClass();
        this.f18355 = abstractC4869;
        abstractC4869.mo9752();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f18355 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        AbstractC6529 abstractC6529Mo9503 = this.f18355.mo9751().mo9732().mo9503();
        abstractC6529Mo9503.getClass();
        return abstractC6529Mo9503;
    }

    @Override // p069.InterfaceC6895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC4869 mo9730() {
        return this.f18355;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4476 mo9221() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9504() {
        AbstractC4869 abstractC4869 = this.f18355;
        AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9752() == Variance.OUT_VARIANCE ? abstractC4869.mo9751() : mo9503().m11990();
        abstractC4881Mo9751.getClass();
        return AbstractC8189.m13660(abstractC4881Mo9751);
    }
}
