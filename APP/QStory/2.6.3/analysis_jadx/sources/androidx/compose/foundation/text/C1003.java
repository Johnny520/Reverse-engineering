package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC5401;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1003 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f2942;

    public C1003(InterfaceC5401 interfaceC5401, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952) {
        this.f2942 = interfaceC5401;
        this.f2941 = interfaceC1395;
        this.f2940 = interfaceC13952;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM1272 = AbstractC0503.m1272(interfaceC1635, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.f2942, this.f2941, null, null), new C1004(this.f2940, 1), interfaceC4357);
        return objM1272 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1272 : C5176.f14739;
    }
}
