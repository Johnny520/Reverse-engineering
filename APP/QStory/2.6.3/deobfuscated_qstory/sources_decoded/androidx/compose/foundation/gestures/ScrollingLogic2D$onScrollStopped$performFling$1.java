package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p205.C7902;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1", f = "Scrollable2D.kt", l = {383, 386, 389}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic2D$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ AbstractC0514 this$0;

    public ScrollingLogic2D$onScrollStopped$performFling$1(AbstractC0514 abstractC0514, InterfaceC4357<? super ScrollingLogic2D$onScrollStopped$performFling$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(null, interfaceC4357);
        scrollingLogic2D$onScrollStopped$performFling$1.J$0 = ((C7902) obj).f21871;
        return scrollingLogic2D$onScrollStopped$performFling$1;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1210invokesFctU(((C7902) obj).f21871, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1210invokesFctU(long j, InterfaceC4357<? super C7902> interfaceC4357) {
        return ((ScrollingLogic2D$onScrollStopped$performFling$1) create(new C7902(j), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            long j = this.J$0;
            AbstractC5185.m10210(obj);
            long jM13349 = C7902.m13349(j, ((C7902) obj).f21871);
            this.J$0 = j;
            this.J$1 = jM13349;
            this.label = 2;
            throw null;
        }
        if (i == 2) {
            AbstractC5185.m10210(obj);
            long j2 = ((C7902) obj).f21871;
            throw null;
        }
        if (i != 3) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = this.J$1;
        long j4 = this.J$0;
        AbstractC5185.m10210(obj);
        return new C7902(C7902.m13349(j4, C7902.m13349(j3, ((C7902) obj).f21871)));
    }
}
