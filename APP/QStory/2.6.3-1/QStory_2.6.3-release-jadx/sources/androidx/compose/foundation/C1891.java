package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1891 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1890 f3456;

    public C1891(C1890 c1890) {
        this.f3456 = c1890;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) {
        Object objM1871 = AbstractC1362.m1871(interfaceC2470, new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.f3456, null), interfaceC5189);
        return objM1871 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1871 : C6008.f15084;
    }
}
