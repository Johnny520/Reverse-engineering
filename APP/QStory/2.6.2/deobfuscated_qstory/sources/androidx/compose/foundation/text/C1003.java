package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC5400;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1003 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5400 f2941;

    public C1003(InterfaceC5400 interfaceC5400, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952) {
        this.f2941 = interfaceC5400;
        this.f2940 = interfaceC1395;
        this.f2939 = interfaceC13952;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM1262 = AbstractC0503.m1262(interfaceC1635, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.f2941, this.f2940, null, null), new C1004(this.f2939, 1), interfaceC4356);
        return objM1262 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1262 : C5175.f14739;
    }
}
