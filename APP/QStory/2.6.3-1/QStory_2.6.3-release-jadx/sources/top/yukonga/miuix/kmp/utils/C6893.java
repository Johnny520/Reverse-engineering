package top.yukonga.miuix.kmp.utils;

import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6893 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6892 f16927;

    public C6893(AbstractC6892 abstractC6892) {
        this.f16927 = abstractC6892;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2470 interfaceC2470, InterfaceC5189 interfaceC5189) throws Throwable {
        AbstractC6892 abstractC6892 = this.f16927;
        Object objM11066 = AbstractC6231.m11066(new AbstractPressableNode$clickPointerInput$2(interfaceC2470, abstractC6892, new AbstractPressableNode$clickPointerInput$onPress$1(abstractC6892, null), null), interfaceC5189);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (objM11066 != coroutineSingletons) {
            objM11066 = c6008;
        }
        return objM11066 == coroutineSingletons ? objM11066 : c6008;
    }
}
