package io.ktor.serialization;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C5321;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;

/* JADX INFO: renamed from: io.ktor.serialization.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4049 implements InterfaceC5319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12328;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12329;

    public /* synthetic */ C4049(Object obj, int i) {
        this.f12329 = i;
        this.f12328 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo8453(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) {
        int i = this.f12329;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f12328;
        switch (i) {
            case 0:
                Object objMo8453 = ((C5321) obj).mo8453(new C4050(interfaceC5318), interfaceC4357);
                return objMo8453 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8453 : c5176;
            default:
                Object objEmit = interfaceC5318.emit(obj, interfaceC4357);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : c5176;
        }
    }
}
