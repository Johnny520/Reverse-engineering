package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.gestures.InterfaceC0507;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0768 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(AbstractC0768 abstractC0768, int i, float f, InterfaceC0349 interfaceC0349, InterfaceC4356<? super PagerState$animateScrollToPage$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = interfaceC0349;
    }

    private static final C5175 invokeSuspend$lambda$0(AbstractC0768 abstractC0768, InterfaceC0507 interfaceC0507, int i) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(null, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, interfaceC4356);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PagerState$animateScrollToPage$3) create(interfaceC0507, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C0769 c0769 = new C0769((InterfaceC0507) this.L$0);
        int i2 = this.$targetPage;
        this.label = 1;
        int i3 = AbstractC0767.f2238;
        invokeSuspend$lambda$0(null, c0769, new Integer(i2).intValue());
        throw null;
    }
}
