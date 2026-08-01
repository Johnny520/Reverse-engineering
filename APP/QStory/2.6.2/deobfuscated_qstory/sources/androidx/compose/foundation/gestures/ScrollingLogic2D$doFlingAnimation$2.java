package androidx.compose.foundation.gestures;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7901;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", f = "Scrollable2D.kt", l = {461}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic2D$doFlingAnimation$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0514 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$doFlingAnimation$2(AbstractC0514 abstractC0514, long j, Ref$LongRef ref$LongRef, InterfaceC4356<? super ScrollingLogic2D$doFlingAnimation$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$available = j;
        this.$result = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(null, this.$available, this.$result, interfaceC4356);
        scrollingLogic2D$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollingLogic2D$doFlingAnimation$2) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jM1149;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j = this.J$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
        AbstractC5184.m10206(obj);
        float fFloatValue = ((Number) obj).floatValue();
        if (Float.isNaN((float) Math.atan2(C7901.m13322(j), C7901.m13323(j)))) {
            jM1149 = AbstractC0455.m1149(0.0f, fFloatValue);
        } else {
            jM1149 = AbstractC0455.m1149(Math.signum(C7901.m13323(j)) * Math.abs(((float) Math.cos((float) Math.atan2(C7901.m13322(j), C7901.m13323(j)))) * fFloatValue), Math.signum(C7901.m13322(j)) * Math.abs(((float) Math.sin((float) Math.atan2(C7901.m13322(j), C7901.m13323(j)))) * fFloatValue));
        }
        ref$LongRef.element = jM1149;
        return C5175.f14739;
    }
}
