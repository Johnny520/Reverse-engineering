package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.navigationevent.compose.AbstractC2437;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$3$1", f = "ListPopupLayout.kt", l = {155, 156}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$5$3$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $alphaProgress;
    final /* synthetic */ C0331 $fractionProgress;
    final /* synthetic */ AbstractC2437 $navigationEventState;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPopupLayoutKt$ListPopupLayout$5$3$1(AbstractC2437 abstractC2437, C0331 c0331, C0331 c03312, InterfaceC4356<? super ListPopupLayoutKt$ListPopupLayout$5$3$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$navigationEventState = abstractC2437;
        this.$fractionProgress = c0331;
        this.$alphaProgress = c03312;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ListPopupLayoutKt$ListPopupLayout$5$3$1(this.$navigationEventState, this.$fractionProgress, this.$alphaProgress, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ListPopupLayoutKt$ListPopupLayout$5$3$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.$navigationEventState.getClass();
            throw null;
        }
        if (i == 1) {
            float f = this.F$0;
            AbstractC5184.m10206(obj);
            C0331 c0331 = this.$alphaProgress;
            Float f2 = new Float(1.0f - f);
            this.L$0 = null;
            this.F$0 = f;
            this.label = 2;
            if (c0331.m1030(f2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
