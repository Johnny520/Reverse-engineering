package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1053 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1052 f3110;

    public C1053(C1052 c1052) {
        this.f3110 = c1052;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) {
        Object objM1301 = AbstractC0521.m1301(interfaceC1635, new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.f3110, null), interfaceC4356);
        return objM1301 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1301 : C5175.f14739;
    }
}
