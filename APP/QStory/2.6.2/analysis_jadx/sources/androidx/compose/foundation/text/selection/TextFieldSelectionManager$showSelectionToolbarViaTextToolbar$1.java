package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.platform.C1833;
import androidx.compose.ui.platform.InterfaceC1874;
import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", l = {1083}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(C0882 c0882, InterfaceC4356<? super TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0882;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$0(C0882 c0882) {
        InterfaceC5400 interfaceC5400 = c0882.f2502;
        if (interfaceC5400 != null) {
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(c0882, null), 1);
        }
        c0882.m1753();
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$1(C0882 c0882) {
        InterfaceC5400 interfaceC5400 = c0882.f2502;
        if (interfaceC5400 != null) {
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(c0882, null), 1);
        }
        c0882.m1753();
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$2(C0882 c0882) {
        InterfaceC5400 interfaceC5400 = c0882.f2502;
        if (interfaceC5400 != null) {
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(c0882, null), 1);
        }
        c0882.m1753();
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$3(C0882 c0882) {
        c0882.m1751();
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$4(C0882 c0882) {
        InterfaceC6542 interfaceC6542 = c0882.f2484;
        if (interfaceC6542 != null) {
            interfaceC6542.invoke();
        }
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0882 c0882 = this.this$0;
            this.label = 1;
            if (c0882.m1744(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C0882 c08822 = this.this$0;
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            C0885 c0885 = !C2035.m3742(c08822.m1749().f5945) && c08822.f2503 != null ? new C0885(c08822, 0) : null;
            C0885 c08852 = c08822.m1747() ? new C0885(c08822, i2) : null;
            C0885 c08853 = c08822.m1746() ? new C0885(c08822, 2) : null;
            C0885 c08854 = c08822.m1762() ? new C0885(c08822, 3) : null;
            C0885 c08855 = c08822.m1748() ? new C0885(c08822, 4) : null;
            InterfaceC1874 interfaceC1874 = c08822.f2507;
            if (interfaceC1874 != null) {
                ((C1833) interfaceC1874).m3455(c08822.m1756(), c0885, c08853, c08852, c08854, c08855);
            }
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            return C5175.f14739;
        } catch (Throwable th) {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            throw th;
        }
    }
}
