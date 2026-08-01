package io.ktor.serialization;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C5320;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: io.ktor.serialization.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4048 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12324;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12325;

    public /* synthetic */ C4048(Object obj, int i) {
        this.f12325 = i;
        this.f12324 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo8463(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) {
        int i = this.f12325;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f12324;
        switch (i) {
            case 0:
                Object objMo8463 = ((C5320) obj).mo8463(new C4049(interfaceC5317), interfaceC4356);
                return objMo8463 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8463 : c5175;
            default:
                Object objEmit = interfaceC5317.emit(obj, interfaceC4356);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : c5175;
        }
    }
}
