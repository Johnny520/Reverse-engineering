package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0960 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1013 f2738;

    public C0960(InterfaceC1013 interfaceC1013, C0882 c0882) {
        this.f2738 = interfaceC1013;
        this.f2737 = c0882;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(interfaceC1635, this.f2738, this.f2737, null), interfaceC4357);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }
}
