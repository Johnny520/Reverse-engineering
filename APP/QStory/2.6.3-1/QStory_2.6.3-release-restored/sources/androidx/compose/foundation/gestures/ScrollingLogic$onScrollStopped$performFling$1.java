package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.nestedscroll.C2454;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m556f = "Scrollable.kt", m557l = {864, 867, 870}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ C1343 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(C1343 c1343, InterfaceC5189<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1343;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC5189);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((C8731) obj).f22216;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1769invokesFctU(((C8731) obj).f22216, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1769invokesFctU(long j, InterfaceC5189<? super C8731> interfaceC5189) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(new C8731(j), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3553;
        long j;
        Object objM1827;
        long j2;
        long j3;
        long j4;
        Object objM3555;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long j5 = this.J$0;
            C2454 c2454 = this.this$0.f1832;
            this.J$0 = j5;
            this.label = 1;
            objM3553 = c2454.m3553(j5, this);
            if (objM3553 != coroutineSingletons) {
                j = j5;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            AbstractC6017.m10769(obj);
            objM3553 = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j6 = this.J$1;
                long j7 = this.J$0;
                AbstractC6017.m10769(obj);
                j2 = j7;
                j4 = j6;
                objM3555 = obj;
                return new C8731(C8731.m13908(j2, C8731.m13908(j4, ((C8731) objM3555).f22216)));
            }
            j3 = this.J$1;
            j2 = this.J$0;
            AbstractC6017.m10769(obj);
            objM1827 = obj;
            long j8 = ((C8731) objM1827).f22216;
            C2454 c24542 = this.this$0.f1832;
            long jM13908 = C8731.m13908(j3, j8);
            this.J$0 = j2;
            this.J$1 = j8;
            this.label = 3;
            j4 = j8;
            objM3555 = c24542.m3555(jM13908, j4, this);
        }
        long jM139082 = C8731.m13908(j, ((C8731) objM3553).f22216);
        C1343 c1343 = this.this$0;
        this.J$0 = j;
        this.J$1 = jM139082;
        this.label = 2;
        objM1827 = c1343.m1827(jM139082, this);
        if (objM1827 != coroutineSingletons) {
            j2 = j;
            j3 = jM139082;
            long j82 = ((C8731) objM1827).f22216;
            C2454 c245422 = this.this$0.f1832;
            long jM139083 = C8731.m13908(j3, j82);
            this.J$0 = j2;
            this.J$1 = j82;
            this.label = 3;
            j4 = j82;
            objM3555 = c245422.m3555(jM139083, j4, this);
        }
        return coroutineSingletons;
    }
}
