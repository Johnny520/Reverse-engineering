package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6064 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6063 f16582;

    public C6064(AbstractC6063 abstractC6063) {
        this.f16582 = abstractC6063;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1635 interfaceC1635, InterfaceC4357 interfaceC4357) throws Throwable {
        AbstractC6063 abstractC6063 = this.f16582;
        Object objM10507 = AbstractC5399.m10507(new AbstractPressableNode$clickPointerInput$2(interfaceC1635, abstractC6063, new AbstractPressableNode$clickPointerInput$onPress$1(abstractC6063, null), null), interfaceC4357);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5176 c5176 = C5176.f14739;
        if (objM10507 != coroutineSingletons) {
            objM10507 = c5176;
        }
        return objM10507 == coroutineSingletons ? objM10507 : c5176;
    }
}
