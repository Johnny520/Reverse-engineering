package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0923;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p123.C8141;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", m556f = "TrackpadScrollingLogic.kt", m557l = {178}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TrackpadScrollingLogic$dispatchTrackpadScroll$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<C1346> $targetScrollDelta;
    final /* synthetic */ C1343 $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1345 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$dispatchTrackpadScroll$3(C1345 c1345, C1343 c1343, Ref$ObjectRef<C1346> ref$ObjectRef, InterfaceC5189<? super TrackpadScrollingLogic$dispatchTrackpadScroll$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1345;
        this.$this_dispatchTrackpadScroll = c1343;
        this.$targetScrollDelta = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, interfaceC5189);
        trackpadScrollingLogic$dispatchTrackpadScroll$3.L$0 = obj;
        return trackpadScrollingLogic$dispatchTrackpadScroll$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TrackpadScrollingLogic$dispatchTrackpadScroll$3) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0071 -> B:14:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1398 interfaceC1398;
        Ref$ObjectRef<C1346> ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1398 interfaceC13982 = (InterfaceC1398) this.L$0;
            C1345 c1345 = this.this$0;
            C1343 c1343 = this.$this_dispatchTrackpadScroll;
            float fM1830 = c1343.m1830(c1343.m1823(this.$targetScrollDelta.element.f1850));
            C1343 c13432 = c1345.f1950;
            c13432.m1829(c13432.m1823(((C1356) interfaceC13982).m1849(1, c13432.m1828(c13432.m1824(fM1830)))));
            interfaceC1398 = interfaceC13982;
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.f1848) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            interfaceC1398 = (InterfaceC1398) this.L$0;
            AbstractC6017.m10769(obj);
            T t = obj;
            ref$ObjectRef.element = t;
            C1345 c13452 = this.this$0;
            C1346 c1346 = this.$targetScrollDelta.element;
            C0923 c0923 = c13452.f1946;
            long j = c1346.f1849;
            long j2 = c1346.f1850;
            ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            C1346 c1346M1842 = C1345.m1842(this.this$0.f1846);
            if (c1346M1842 != null) {
                C1345 c13453 = this.this$0;
                Ref$ObjectRef<C1346> ref$ObjectRef2 = this.$targetScrollDelta;
                C0923 c09232 = c13453.f1946;
                long j3 = c1346M1842.f1849;
                long j4 = c1346M1842.f1850;
                ((C8141) c09232.f572).m13067(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((C8141) c09232.f573).m13067(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ref$ObjectRef2.element = ref$ObjectRef2.element.m1845(c1346M1842);
            }
            C1345 c13454 = this.this$0;
            C1343 c13433 = this.$this_dispatchTrackpadScroll;
            float fM18302 = c13433.m1830(c13433.m1823(this.$targetScrollDelta.element.f1850));
            C1343 c13434 = c13454.f1950;
            c13434.m1829(c13434.m1823(((C1356) interfaceC1398).m1849(1, c13434.m1828(c13434.m1824(fM18302)))));
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.f1848) {
                C6022 c6022 = this.this$0.f1846;
                this.L$0 = interfaceC1398;
                this.L$1 = ref$ObjectRef;
                this.label = 1;
                Object objM11066 = AbstractC6231.m11066(new NonTouchScrollingLogicKt$busyReceive$2(c6022, null), this);
                t = objM11066;
                if (objM11066 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef.element = t;
                C1345 c134522 = this.this$0;
                C1346 c13462 = this.$targetScrollDelta.element;
                C0923 c09233 = c134522.f1946;
                long j5 = c13462.f1849;
                long j22 = c13462.f1850;
                ((C8141) c09233.f572).m13067(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                ((C8141) c09233.f573).m13067(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
                C1346 c1346M18422 = C1345.m1842(this.this$0.f1846);
                if (c1346M18422 != null) {
                }
                C1345 c134542 = this.this$0;
                C1343 c134332 = this.$this_dispatchTrackpadScroll;
                float fM183022 = c134332.m1830(c134332.m1823(this.$targetScrollDelta.element.f1850));
                C1343 c134342 = c134542.f1950;
                c134342.m1829(c134342.m1823(((C1356) interfaceC1398).m1849(1, c134342.m1828(c134342.m1824(fM183022)))));
                ref$ObjectRef = this.$targetScrollDelta;
                if (!ref$ObjectRef.element.f1848) {
                    return C6008.f15084;
                }
            }
        }
    }
}
