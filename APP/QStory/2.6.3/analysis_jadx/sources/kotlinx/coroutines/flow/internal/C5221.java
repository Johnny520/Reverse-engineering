package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5221 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5200 f14813;

    public C5221(InterfaceC5196 interfaceC5196) {
        this.f14813 = interfaceC5196;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        Object objMo8433 = this.f14813.mo8433(obj, interfaceC4357);
        return objMo8433 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8433 : C5176.f14739;
    }
}
