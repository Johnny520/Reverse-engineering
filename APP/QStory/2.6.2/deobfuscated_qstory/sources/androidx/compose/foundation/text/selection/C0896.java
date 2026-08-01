package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0977;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0896 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2543;

    public /* synthetic */ C0896(Object obj, int i) {
        this.f2543 = i;
        this.f2542 = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) throws Throwable {
        int i = this.f2543;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f2542;
        switch (i) {
            case 0:
                Object objM2995 = ((C1627) interfaceC1635).m2995(new SelectionGesturesKt$updateSelectionTouchMode$1$1((C0977) obj, null), interfaceC4356);
                return objM2995 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2995 : c5175;
            default:
                Object objM1899 = AbstractC0983.m1899(interfaceC1635, (InterfaceC1013) obj, interfaceC4356);
                return objM1899 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1899 : c5175;
        }
    }
}
