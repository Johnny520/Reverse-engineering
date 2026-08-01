package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6034 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6034 f16511 = new C6034();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM1261 = AbstractC0503.m1261(interfaceC1635, new C6023(2), interfaceC4356);
        return objM1261 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1261 : C5175.f14739;
    }
}
