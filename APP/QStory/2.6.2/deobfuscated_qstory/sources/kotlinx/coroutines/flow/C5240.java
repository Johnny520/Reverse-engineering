package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.C5235;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5240 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f14842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5235 f14843;

    public C5240(C5235 c5235, InterfaceC6553 interfaceC6553) {
        this.f14843 = c5235;
        this.f14842 = interfaceC6553;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8463(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objMo8463 = this.f14843.mo8463(new C5239(new Ref$BooleanRef(), interfaceC5317, this.f14842), interfaceC4356);
        return objMo8463 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8463 : C5175.f14739;
    }
}
