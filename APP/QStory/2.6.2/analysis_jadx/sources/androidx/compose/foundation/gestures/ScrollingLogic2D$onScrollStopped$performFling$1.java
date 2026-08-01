package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7901;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1", f = "Scrollable2D.kt", l = {383, 386, 389}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic2D$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ AbstractC0514 this$0;

    public ScrollingLogic2D$onScrollStopped$performFling$1(AbstractC0514 abstractC0514, InterfaceC4356<? super ScrollingLogic2D$onScrollStopped$performFling$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(null, interfaceC4356);
        scrollingLogic2D$onScrollStopped$performFling$1.J$0 = ((C7901) obj).f21874;
        return scrollingLogic2D$onScrollStopped$performFling$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1200invokesFctU(((C7901) obj).f21874, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1200invokesFctU(long j, InterfaceC4356<? super C7901> interfaceC4356) {
        return ((ScrollingLogic2D$onScrollStopped$performFling$1) create(new C7901(j), interfaceC4356)).invokeSuspend(C5175.f14739);
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
            long j = this.J$0;
            AbstractC5184.m10206(obj);
            long jM13321 = C7901.m13321(j, ((C7901) obj).f21874);
            this.J$0 = j;
            this.J$1 = jM13321;
            this.label = 2;
            throw null;
        }
        if (i == 2) {
            AbstractC5184.m10206(obj);
            long j2 = ((C7901) obj).f21874;
            throw null;
        }
        if (i != 3) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = this.J$1;
        long j4 = this.J$0;
        AbstractC5184.m10206(obj);
        return new C7901(C7901.m13321(j4, C7901.m13321(j3, ((C7901) obj).f21874)));
    }
}
