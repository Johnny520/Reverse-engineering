package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0837 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0836 f2374;

    public C0837(C0836 c0836) {
        this.f2374 = c0836;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) {
        Object objM1311 = AbstractC0521.m1311(interfaceC1635, new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.f2374, null), interfaceC4357);
        return objM1311 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1311 : C5176.f14739;
    }
}
