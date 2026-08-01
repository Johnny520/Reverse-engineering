package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.InterfaceC1348;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.runtime.AbstractC2182;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", m556f = "LazyListState.kt", m557l = {587}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1582 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$2(C1582 c1582, int i, int i2, InterfaceC5189<? super LazyListState$animateScrollToItem$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1582;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, interfaceC5189);
        lazyListState$animateScrollToItem$2.L$0 = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1348 interfaceC1348, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LazyListState$animateScrollToItem$2) create(interfaceC1348, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1348 interfaceC1348 = (InterfaceC1348) this.L$0;
            C1582 c1582 = this.this$0;
            C1593 c1593 = new C1593(interfaceC1348, c1582, 0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            InterfaceC8725 interfaceC8725 = ((C1598) ((AbstractC2182) c1582.f2449).getValue()).f2560;
            this.label = 1;
            if (AbstractC1563.m2076(c1593, i2, i3, 100, interfaceC8725, this) == coroutineSingletons) {
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
