package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m556f = "Scrollable.kt", m557l = {921}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C1343 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(C1343 c1343, Ref$LongRef ref$LongRef, long j, InterfaceC5189<? super ScrollingLogic$doFlingAnimation$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1343;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, interfaceC5189);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollingLogic$doFlingAnimation$2) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1343 c1343;
        Ref$LongRef ref$LongRef;
        long j;
        C1343 c13432;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1398 interfaceC1398 = (InterfaceC1398) this.L$0;
            c1343 = this.this$0;
            C1353 c1353 = new C1353(c1343, interfaceC1398);
            Ref$LongRef ref$LongRef2 = this.$result;
            long j2 = this.$available;
            InterfaceC1401 interfaceC1401 = c1343.f1835;
            long j3 = ref$LongRef2.element;
            float fM1824 = c1343.m1824(c1343.f1834 == Orientation.Horizontal ? C8731.m13910(j2) : C8731.m13909(j2));
            this.L$0 = c1343;
            this.L$1 = c1343;
            this.L$2 = ref$LongRef2;
            this.J$0 = j3;
            this.label = 1;
            C1367 c1367 = (C1367) interfaceC1401;
            Object objM11029 = AbstractC6231.m11029(c1367.f1892, new DefaultFlingBehavior$performFling$2(fM1824, c1367, c1353, null), this);
            if (objM11029 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$LongRef = ref$LongRef2;
            j = j3;
            obj = objM11029;
            c13432 = c1343;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            c1343 = (C1343) this.L$1;
            c13432 = (C1343) this.L$0;
            AbstractC6017.m10769(obj);
        }
        float fM18242 = c13432.m1824(((Number) obj).floatValue());
        ref$LongRef.element = c1343.f1834 == Orientation.Horizontal ? C8731.m13911(j, fM18242, 0.0f, 2) : C8731.m13911(j, 0.0f, fM18242, 1);
        return C6008.f15084;
    }
}
