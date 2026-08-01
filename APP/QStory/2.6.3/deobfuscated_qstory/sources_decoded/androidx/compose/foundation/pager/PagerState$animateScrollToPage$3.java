package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.gestures.InterfaceC0507;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0768 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(AbstractC0768 abstractC0768, int i, float f, InterfaceC0349 interfaceC0349, InterfaceC4357<? super PagerState$animateScrollToPage$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = interfaceC0349;
    }

    private static final C5176 invokeSuspend$lambda$0(AbstractC0768 abstractC0768, InterfaceC0507 interfaceC0507, int i) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(null, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, interfaceC4357);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PagerState$animateScrollToPage$3) create(interfaceC0507, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C0769 c0769 = new C0769((InterfaceC0507) this.L$0);
        int i2 = this.$targetPage;
        this.label = 1;
        int i3 = AbstractC0767.f2239;
        invokeSuspend$lambda$0(null, c0769, new Integer(i2).intValue());
        throw null;
    }
}
