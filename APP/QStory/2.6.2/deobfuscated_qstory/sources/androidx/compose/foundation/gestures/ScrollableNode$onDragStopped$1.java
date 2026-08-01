package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {394}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0470 $event;
    int label;
    final /* synthetic */ C0517 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onDragStopped$1(C0470 c0470, C0517 c0517, InterfaceC4356<? super ScrollableNode$onDragStopped$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$event = c0470;
        this.this$0 = c0517;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ScrollableNode$onDragStopped$1(this.$event, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollableNode$onDragStopped$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0470 c0470 = this.$event;
            float f = c0470.f1430 ? -1.0f : 1.0f;
            C0502 c0502 = this.this$0.f1522;
            long j = c0470.f1431;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
            long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
            this.label = 1;
            if (c0502.m1256((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), false, this) == coroutineSingletons) {
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
