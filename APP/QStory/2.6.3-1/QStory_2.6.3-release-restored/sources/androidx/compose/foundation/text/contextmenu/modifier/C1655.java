package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.gestures.AbstractC1625;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1655 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1661 f2675;

    public C1655(C1661 c1661) {
        this.f2675 = c1661;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) {
        Object objM2149 = AbstractC1625.m2149(interfaceC2470, new TextContextMenuGestureNode$1$1(this.f2675), interfaceC5189);
        return objM2149 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2149 : C6008.f15084;
    }
}
