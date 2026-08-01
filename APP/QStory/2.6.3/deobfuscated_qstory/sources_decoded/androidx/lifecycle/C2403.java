package androidx.lifecycle;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2403 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5196 f7046;

    public C2403(InterfaceC5196 interfaceC5196) {
        this.f7046 = interfaceC5196;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        Object objMo8433 = ((AbstractC5211) this.f7046).f14798.mo8433(obj, interfaceC4357);
        return objMo8433 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8433 : C5176.f14739;
    }
}
