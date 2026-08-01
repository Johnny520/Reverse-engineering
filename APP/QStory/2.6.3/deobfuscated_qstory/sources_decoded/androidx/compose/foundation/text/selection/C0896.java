package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0977;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0896 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2544;

    public /* synthetic */ C0896(Object obj, int i) {
        this.f2544 = i;
        this.f2543 = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) throws Throwable {
        int i = this.f2544;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f2543;
        switch (i) {
            case 0:
                Object objM3005 = ((C1627) interfaceC1635).m3005(new SelectionGesturesKt$updateSelectionTouchMode$1$1((C0977) obj, null), interfaceC4357);
                return objM3005 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3005 : c5176;
            default:
                Object objM1909 = AbstractC0983.m1909(interfaceC1635, (InterfaceC1013) obj, interfaceC4357);
                return objM1909 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1909 : c5176;
        }
    }
}
