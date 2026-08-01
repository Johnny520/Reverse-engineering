package androidx.lifecycle;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.flow.InterfaceC5317;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2403 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5195 f7045;

    public C2403(InterfaceC5195 interfaceC5195) {
        this.f7045 = interfaceC5195;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        Object objMo8443 = ((AbstractC5210) this.f7045).f14798.mo8443(obj, interfaceC4356);
        return objMo8443 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8443 : C5175.f14739;
    }
}
