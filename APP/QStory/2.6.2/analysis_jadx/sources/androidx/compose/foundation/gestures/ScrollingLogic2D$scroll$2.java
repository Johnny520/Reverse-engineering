package androidx.compose.foundation.gestures;

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
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$scroll$2", f = "Scrollable2D.kt", l = {484}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic2D$scroll$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0514 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$scroll$2(AbstractC0514 abstractC0514, InterfaceC6553 interfaceC6553, InterfaceC4356<? super ScrollingLogic2D$scroll$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollingLogic2D$scroll$2 scrollingLogic2D$scroll$2 = new ScrollingLogic2D$scroll$2(null, this.$block, interfaceC4356);
        scrollingLogic2D$scroll$2.L$0 = obj;
        return scrollingLogic2D$scroll$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollingLogic2D$scroll$2) create(interfaceC0549, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
