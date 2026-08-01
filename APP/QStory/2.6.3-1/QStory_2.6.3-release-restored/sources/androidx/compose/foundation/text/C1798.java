package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1798 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1720 f3082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1851 f3083;

    public C1798(InterfaceC1851 interfaceC1851, C1720 c1720) {
        this.f3083 = interfaceC1851;
        this.f3082 = c1720;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(interfaceC2470, this.f3083, this.f3082, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }
}
