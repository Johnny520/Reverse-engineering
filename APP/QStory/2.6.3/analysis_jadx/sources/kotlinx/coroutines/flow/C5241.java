package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.C5236;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5241 implements InterfaceC5319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f14842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5236 f14843;

    public C5241(C5236 c5236, InterfaceC6554 interfaceC6554) {
        this.f14843 = c5236;
        this.f14842 = interfaceC6554;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8453(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objMo8453 = this.f14843.mo8453(new C5240(new Ref$BooleanRef(), interfaceC5318, this.f14842), interfaceC4357);
        return objMo8453 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8453 : C5176.f14739;
    }
}
