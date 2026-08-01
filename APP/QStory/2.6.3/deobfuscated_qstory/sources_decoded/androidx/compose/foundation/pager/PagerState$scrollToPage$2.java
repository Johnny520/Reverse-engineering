package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.InterfaceC0507;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p176.AbstractC7741;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class PagerState$scrollToPage$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ AbstractC0768 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(AbstractC0768 abstractC0768, float f, int i, InterfaceC4357<? super PagerState$scrollToPage$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PagerState$scrollToPage$2(null, this.$pageOffsetFraction, this.$page, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PagerState$scrollToPage$2) create(interfaceC0507, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        float f = this.$pageOffsetFraction;
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            throw null;
        }
        AbstractC7741.m13097("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        throw null;
    }
}
