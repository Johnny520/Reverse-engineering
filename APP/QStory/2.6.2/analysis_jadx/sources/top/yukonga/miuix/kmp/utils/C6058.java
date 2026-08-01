package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6058 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6057 f16573;

    public C6058(AbstractC6057 abstractC6057) {
        this.f16573 = abstractC6057;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4356 interfaceC4356) throws Throwable {
        AbstractC6057 abstractC6057 = this.f16573;
        Object objM10503 = AbstractC5398.m10503(new AbstractPressableNode$clickPointerInput$2(interfaceC1635, abstractC6057, new AbstractPressableNode$clickPointerInput$onPress$1(abstractC6057, null), null), interfaceC4356);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5175 c5175 = C5175.f14739;
        if (objM10503 != coroutineSingletons) {
            objM10503 = c5175;
        }
        return objM10503 == coroutineSingletons ? objM10503 : c5175;
    }
}
