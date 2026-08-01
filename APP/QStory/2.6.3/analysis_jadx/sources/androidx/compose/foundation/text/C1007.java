package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC0895;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1007 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2949;

    public C1007(C0882 c0882) {
        this.f2949 = c0882;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) {
        C0882 c0882 = this.f2949;
        Object objM1816 = AbstractC0895.m1816(interfaceC1635, c0882.f2482, c0882.f2483, interfaceC4357);
        return objM1816 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1816 : C5176.f14739;
    }
}
