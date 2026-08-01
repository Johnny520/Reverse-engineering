package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.InterfaceC0507;
import androidx.compose.foundation.lazy.C0752;
import androidx.compose.foundation.lazy.layout.AbstractC0722;
import androidx.compose.runtime.AbstractC1347;
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
@InterfaceC6861(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", l = {615}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class LazyGridState$animateScrollToItem$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0676 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$animateScrollToItem$2(C0676 c0676, int i, int i2, InterfaceC4356<? super LazyGridState$animateScrollToItem$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0676;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LazyGridState$animateScrollToItem$2 lazyGridState$animateScrollToItem$2 = new LazyGridState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, interfaceC4356);
        lazyGridState$animateScrollToItem$2.L$0 = obj;
        return lazyGridState$animateScrollToItem$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0507 interfaceC0507, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LazyGridState$animateScrollToItem$2) create(interfaceC0507, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0507 interfaceC0507 = (InterfaceC0507) this.L$0;
            C0676 c0676 = this.this$0;
            C0752 c0752 = new C0752(interfaceC0507, c0676, 1);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            int i4 = C0676.f1875;
            ((C0677) ((AbstractC1347) c0676.f1879).getValue()).getClass();
            C7894 c7894 = ((C0677) ((AbstractC1347) this.this$0.f1879).getValue()).f1888;
            this.label = 1;
            if (AbstractC0722.m1506(c0752, i2, i3, 0, c7894, this) == coroutineSingletons) {
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
