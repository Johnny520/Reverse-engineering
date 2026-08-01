package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.AbstractC3738;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", m556f = "Scrollable2D.kt", m557l = {461}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollingLogic2D$doFlingAnimation$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1355 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$doFlingAnimation$2(AbstractC1355 abstractC1355, long j, Ref$LongRef ref$LongRef, InterfaceC5189<? super ScrollingLogic2D$doFlingAnimation$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$available = j;
        this.$result = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(null, this.$available, this.$result, interfaceC5189);
        scrollingLogic2D$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollingLogic2D$doFlingAnimation$2) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jM6871;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j = this.J$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
        AbstractC6017.m10769(obj);
        float fFloatValue = ((Number) obj).floatValue();
        if (Float.isNaN((float) Math.atan2(C8731.m13909(j), C8731.m13910(j)))) {
            jM6871 = AbstractC3738.m6871(0.0f, fFloatValue);
        } else {
            jM6871 = AbstractC3738.m6871(Math.signum(C8731.m13910(j)) * Math.abs(((float) Math.cos((float) Math.atan2(C8731.m13909(j), C8731.m13910(j)))) * fFloatValue), Math.signum(C8731.m13909(j)) * Math.abs(((float) Math.sin((float) Math.atan2(C8731.m13909(j), C8731.m13910(j)))) * fFloatValue));
        }
        ref$LongRef.element = jM6871;
        return C6008.f15084;
    }
}
