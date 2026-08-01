package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.InterfaceC0507;
import androidx.compose.foundation.lazy.C0752;
import androidx.compose.foundation.lazy.layout.AbstractC0722;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7894;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", l = {396}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class LazyStaggeredGridState$animateScrollToItem$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ int $index;
    final /* synthetic */ C0738 $layoutInfo;
    final /* synthetic */ int $numOfItemsToTeleport;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0736 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$animateScrollToItem$2(C0736 c0736, int i, int i2, int i3, C0738 c0738, InterfaceC4356<? super LazyStaggeredGridState$animateScrollToItem$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0736;
        this.$index = i;
        this.$scrollOffset = i2;
        this.$numOfItemsToTeleport = i3;
        this.$layoutInfo = c0738;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, interfaceC4356);
        lazyStaggeredGridState$animateScrollToItem$2.L$0 = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) create(interfaceC0507, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0752 c0752 = new C0752((InterfaceC0507) this.L$0, this.this$0, 2);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            int i4 = this.$numOfItemsToTeleport;
            C7894 c7894 = this.$layoutInfo.f2094;
            this.label = 1;
            if (AbstractC0722.m1506(c0752, i2, i3, i4, c7894, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
