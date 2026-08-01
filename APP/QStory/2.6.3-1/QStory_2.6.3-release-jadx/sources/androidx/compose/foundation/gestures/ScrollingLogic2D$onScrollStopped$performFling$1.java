package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1", m556f = "Scrollable2D.kt", m557l = {383, 386, 389}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollingLogic2D$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ AbstractC1355 this$0;

    public ScrollingLogic2D$onScrollStopped$performFling$1(AbstractC1355 abstractC1355, InterfaceC5189<? super ScrollingLogic2D$onScrollStopped$performFling$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(null, interfaceC5189);
        scrollingLogic2D$onScrollStopped$performFling$1.J$0 = ((C8731) obj).f22216;
        return scrollingLogic2D$onScrollStopped$performFling$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1770invokesFctU(((C8731) obj).f22216, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1770invokesFctU(long j, InterfaceC5189<? super C8731> interfaceC5189) {
        return ((ScrollingLogic2D$onScrollStopped$performFling$1) create(new C8731(j), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            long j = this.J$0;
            AbstractC6017.m10769(obj);
            long jM13908 = C8731.m13908(j, ((C8731) obj).f22216);
            this.J$0 = j;
            this.J$1 = jM13908;
            this.label = 2;
            throw null;
        }
        if (i == 2) {
            AbstractC6017.m10769(obj);
            long j2 = ((C8731) obj).f22216;
            throw null;
        }
        if (i != 3) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = this.J$1;
        long j4 = this.J$0;
        AbstractC6017.m10769(obj);
        return new C8731(C8731.m13908(j4, C8731.m13908(j3, ((C8731) obj).f22216)));
    }
}
