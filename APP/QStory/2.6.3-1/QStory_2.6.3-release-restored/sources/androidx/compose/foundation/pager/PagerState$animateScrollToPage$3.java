package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.gestures.InterfaceC1348;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", m556f = "PagerState.kt", m557l = {672}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1609 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(AbstractC1609 abstractC1609, int i, float f, InterfaceC1195 interfaceC1195, InterfaceC5189<? super PagerState$animateScrollToPage$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = interfaceC1195;
    }

    private static final C6008 invokeSuspend$lambda$0(AbstractC1609 abstractC1609, InterfaceC1348 interfaceC1348, int i) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(null, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, interfaceC5189);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1348 interfaceC1348, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PagerState$animateScrollToPage$3) create(interfaceC1348, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1610 c1610 = new C1610((InterfaceC1348) this.L$0);
        int i2 = this.$targetPage;
        this.label = 1;
        int i3 = AbstractC1608.f2584;
        invokeSuspend$lambda$0(null, c1610, new Integer(i2).intValue());
        throw null;
    }
}
