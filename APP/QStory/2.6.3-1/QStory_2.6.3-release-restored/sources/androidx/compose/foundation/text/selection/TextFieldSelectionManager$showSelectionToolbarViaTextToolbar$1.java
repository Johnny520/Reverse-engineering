package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.platform.C2668;
import androidx.compose.p001ui.platform.InterfaceC2709;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", m556f = "TextFieldSelectionManager.kt", m557l = {1083}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(C1720 c1720, InterfaceC5189<? super TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1720;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$0(C1720 c1720) {
        InterfaceC6233 interfaceC6233 = c1720.f2848;
        if (interfaceC6233 != null) {
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new C0124x8079257(c1720, null), 1);
        }
        c1720.m2323();
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$1(C1720 c1720) {
        InterfaceC6233 interfaceC6233 = c1720.f2848;
        if (interfaceC6233 != null) {
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new C0125x2b998e94(c1720, null), 1);
        }
        c1720.m2323();
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$2(C1720 c1720) {
        InterfaceC6233 interfaceC6233 = c1720.f2848;
        if (interfaceC6233 != null) {
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new C0126x6bcc9c65(c1720, null), 1);
        }
        c1720.m2323();
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$3(C1720 c1720) {
        c1720.m2321();
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$4(C1720 c1720) {
        InterfaceC7372 interfaceC7372 = c1720.f2830;
        if (interfaceC7372 != null) {
            interfaceC7372.invoke();
        }
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1720 c1720 = this.this$0;
            this.label = 1;
            if (c1720.m2314(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C1720 c17202 = this.this$0;
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            C1723 c1723 = !C2869.m4312(c17202.m2319().f6291) && c17202.f2849 != null ? new C1723(c17202, 0) : null;
            C1723 c17232 = c17202.m2317() ? new C1723(c17202, i2) : null;
            C1723 c17233 = c17202.m2316() ? new C1723(c17202, 2) : null;
            C1723 c17234 = c17202.m2332() ? new C1723(c17202, 3) : null;
            C1723 c17235 = c17202.m2318() ? new C1723(c17202, 4) : null;
            InterfaceC2709 interfaceC2709 = c17202.f2853;
            if (interfaceC2709 != null) {
                ((C2668) interfaceC2709).m4025(c17202.m2326(), c1723, c17233, c17232, c17234, c17235);
            }
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            return C6008.f15084;
        } catch (Throwable th) {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            throw th;
        }
    }
}
