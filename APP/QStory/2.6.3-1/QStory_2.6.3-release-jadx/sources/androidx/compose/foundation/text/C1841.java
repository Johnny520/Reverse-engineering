package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC6233;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1841 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f3285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f3286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f3287;

    public C1841(InterfaceC6233 interfaceC6233, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302) {
        this.f3287 = interfaceC6233;
        this.f3286 = interfaceC2230;
        this.f3285 = interfaceC22302;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM1832 = AbstractC1344.m1832(interfaceC2470, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.f3287, this.f3286, null, null), new C1842(this.f3285, 1), interfaceC5189);
        return objM1832 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1832 : C6008.f15084;
    }
}
