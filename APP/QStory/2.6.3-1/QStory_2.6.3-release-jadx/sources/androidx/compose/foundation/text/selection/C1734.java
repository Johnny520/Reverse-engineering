package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1815;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2889;

    public /* synthetic */ C1734(Object obj, int i) {
        this.f2889 = i;
        this.f2888 = obj;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) throws Throwable {
        int i = this.f2889;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f2888;
        switch (i) {
            case 0:
                Object objM3565 = ((C2462) interfaceC2470).m3565(new SelectionGesturesKt$updateSelectionTouchMode$1$1((C1815) obj, null), interfaceC5189);
                return objM3565 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3565 : c6008;
            default:
                Object objM2469 = AbstractC1821.m2469(interfaceC2470, (InterfaceC1851) obj, interfaceC5189);
                return objM2469 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2469 : c6008;
        }
    }
}
