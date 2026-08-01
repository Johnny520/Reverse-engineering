package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5299 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f14881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6553 f14882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5318 f14883;

    public C5299(InterfaceC5318 interfaceC5318, InterfaceC6557 interfaceC6557, InterfaceC6553 interfaceC6553) {
        this.f14883 = interfaceC5318;
        this.f14881 = interfaceC6557;
        this.f14882 = interfaceC6553;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8463(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = AbstractC5218.f14807;
        Object objMo8463 = this.f14883.mo8463(new C5300(this, ref$ObjectRef, interfaceC5317), interfaceC4356);
        return objMo8463 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8463 : C5175.f14739;
    }
}
