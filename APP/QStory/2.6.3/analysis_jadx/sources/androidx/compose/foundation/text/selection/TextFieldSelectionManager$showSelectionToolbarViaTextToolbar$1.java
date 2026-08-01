package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.platform.C1833;
import androidx.compose.ui.platform.InterfaceC1874;
import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", l = {1083}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(C0882 c0882, InterfaceC4357<? super TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0882;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$0(C0882 c0882) {
        InterfaceC5401 interfaceC5401 = c0882.f2503;
        if (interfaceC5401 != null) {
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(c0882, null), 1);
        }
        c0882.m1763();
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$1(C0882 c0882) {
        InterfaceC5401 interfaceC5401 = c0882.f2503;
        if (interfaceC5401 != null) {
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(c0882, null), 1);
        }
        c0882.m1763();
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$2(C0882 c0882) {
        InterfaceC5401 interfaceC5401 = c0882.f2503;
        if (interfaceC5401 != null) {
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(c0882, null), 1);
        }
        c0882.m1763();
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$3(C0882 c0882) {
        c0882.m1761();
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$4(C0882 c0882) {
        InterfaceC6543 interfaceC6543 = c0882.f2485;
        if (interfaceC6543 != null) {
            interfaceC6543.invoke();
        }
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C0882 c0882 = this.this$0;
            this.label = 1;
            if (c0882.m1754(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C0882 c08822 = this.this$0;
        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
        try {
            C0885 c0885 = !C2035.m3752(c08822.m1759().f5946) && c08822.f2504 != null ? new C0885(c08822, 0) : null;
            C0885 c08852 = c08822.m1757() ? new C0885(c08822, i2) : null;
            C0885 c08853 = c08822.m1756() ? new C0885(c08822, 2) : null;
            C0885 c08854 = c08822.m1772() ? new C0885(c08822, 3) : null;
            C0885 c08855 = c08822.m1758() ? new C0885(c08822, 4) : null;
            InterfaceC1874 interfaceC1874 = c08822.f2508;
            if (interfaceC1874 != null) {
                ((C1833) interfaceC1874).m3465(c08822.m1766(), c0885, c08853, c08852, c08854, c08855);
            }
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            return C5176.f14739;
        } catch (Throwable th) {
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            throw th;
        }
    }
}
