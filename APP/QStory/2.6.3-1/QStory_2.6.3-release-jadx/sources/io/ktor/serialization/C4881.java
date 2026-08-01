package io.ktor.serialization;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C6153;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;

/* JADX INFO: renamed from: io.ktor.serialization.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4881 implements InterfaceC6151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12673;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12674;

    public /* synthetic */ C4881(Object obj, int i) {
        this.f12674 = i;
        this.f12673 = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        int i = this.f12674;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f12673;
        switch (i) {
            case 0:
                Object objMo9012 = ((C6153) obj).mo9012(new C4882(interfaceC6150), interfaceC5189);
                return objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9012 : c6008;
            default:
                Object objEmit = interfaceC6150.emit(obj, interfaceC5189);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : c6008;
        }
    }
}
