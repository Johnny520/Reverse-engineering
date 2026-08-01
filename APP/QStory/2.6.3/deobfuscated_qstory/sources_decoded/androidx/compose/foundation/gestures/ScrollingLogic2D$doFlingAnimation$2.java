package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.AbstractC2905;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p205.C7902;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", f = "Scrollable2D.kt", l = {461}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic2D$doFlingAnimation$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0514 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$doFlingAnimation$2(AbstractC0514 abstractC0514, long j, Ref$LongRef ref$LongRef, InterfaceC4357<? super ScrollingLogic2D$doFlingAnimation$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$available = j;
        this.$result = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(null, this.$available, this.$result, interfaceC4357);
        scrollingLogic2D$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollingLogic2D$doFlingAnimation$2) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jM6311;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j = this.J$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
        AbstractC5185.m10210(obj);
        float fFloatValue = ((Number) obj).floatValue();
        if (Float.isNaN((float) Math.atan2(C7902.m13350(j), C7902.m13351(j)))) {
            jM6311 = AbstractC2905.m6311(0.0f, fFloatValue);
        } else {
            jM6311 = AbstractC2905.m6311(Math.signum(C7902.m13351(j)) * Math.abs(((float) Math.cos((float) Math.atan2(C7902.m13350(j), C7902.m13351(j)))) * fFloatValue), Math.signum(C7902.m13350(j)) * Math.abs(((float) Math.sin((float) Math.atan2(C7902.m13350(j), C7902.m13351(j)))) * fFloatValue));
        }
        ref$LongRef.element = jM6311;
        return C5176.f14739;
    }
}
