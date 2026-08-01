package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC1733;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1845 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1720 f3294;

    public C1845(C1720 c1720) {
        this.f3294 = c1720;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) {
        C1720 c1720 = this.f3294;
        Object objM2376 = AbstractC1733.m2376(interfaceC2470, c1720.f2827, c1720.f2828, interfaceC5189);
        return objM2376 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2376 : C6008.f15084;
    }
}
