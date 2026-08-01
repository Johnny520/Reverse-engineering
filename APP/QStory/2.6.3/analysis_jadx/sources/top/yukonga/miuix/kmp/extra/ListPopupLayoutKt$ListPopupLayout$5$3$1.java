package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.navigationevent.compose.AbstractC2437;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$3$1", f = "ListPopupLayout.kt", l = {155, 156}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$5$3$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0331 $alphaProgress;
    final /* synthetic */ C0331 $fractionProgress;
    final /* synthetic */ AbstractC2437 $navigationEventState;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPopupLayoutKt$ListPopupLayout$5$3$1(AbstractC2437 abstractC2437, C0331 c0331, C0331 c03312, InterfaceC4357<? super ListPopupLayoutKt$ListPopupLayout$5$3$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$navigationEventState = abstractC2437;
        this.$fractionProgress = c0331;
        this.$alphaProgress = c03312;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ListPopupLayoutKt$ListPopupLayout$5$3$1(this.$navigationEventState, this.$fractionProgress, this.$alphaProgress, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ListPopupLayoutKt$ListPopupLayout$5$3$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.$navigationEventState.getClass();
            throw null;
        }
        if (i == 1) {
            float f = this.F$0;
            AbstractC5185.m10210(obj);
            C0331 c0331 = this.$alphaProgress;
            Float f2 = new Float(1.0f - f);
            this.L$0 = null;
            this.F$0 = f;
            this.label = 2;
            if (c0331.m1031(f2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
