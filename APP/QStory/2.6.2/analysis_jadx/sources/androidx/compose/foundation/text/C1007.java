package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC0895;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1007 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2948;

    public C1007(C0882 c0882) {
        this.f2948 = c0882;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) {
        C0882 c0882 = this.f2948;
        Object objM1806 = AbstractC0895.m1806(interfaceC1635, c0882.f2481, c0882.f2482, interfaceC4356);
        return objM1806 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1806 : C5175.f14739;
    }
}
