package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.InterfaceC1348;
import androidx.compose.foundation.lazy.C1593;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8724;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", m556f = "LazyStaggeredGridState.kt", m557l = {396}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LazyStaggeredGridState$animateScrollToItem$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ int $index;
    final /* synthetic */ C1579 $layoutInfo;
    final /* synthetic */ int $numOfItemsToTeleport;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1577 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$animateScrollToItem$2(C1577 c1577, int i, int i2, int i3, C1579 c1579, InterfaceC5189<? super LazyStaggeredGridState$animateScrollToItem$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1577;
        this.$index = i;
        this.$scrollOffset = i2;
        this.$numOfItemsToTeleport = i3;
        this.$layoutInfo = c1579;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, interfaceC5189);
        lazyStaggeredGridState$animateScrollToItem$2.L$0 = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1348 interfaceC1348, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) create(interfaceC1348, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1593 c1593 = new C1593((InterfaceC1348) this.L$0, this.this$0, 2);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            int i4 = this.$numOfItemsToTeleport;
            C8724 c8724 = this.$layoutInfo.f2440;
            this.label = 1;
            if (AbstractC1563.m2076(c1593, i2, i3, i4, c8724, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
