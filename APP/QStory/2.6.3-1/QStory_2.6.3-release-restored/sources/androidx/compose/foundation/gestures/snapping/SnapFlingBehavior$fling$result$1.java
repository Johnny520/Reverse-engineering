package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.InterfaceC1348;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m556f = "SnapFlingBehavior.kt", m557l = {134, 150}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;", "", "Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;"}, m152k = 3, m153mv = {2, 1, 0})
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC7387 $onRemainingScrollOffsetUpdate;
    final /* synthetic */ InterfaceC1348 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC1301 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(AbstractC1301 abstractC1301, float f, InterfaceC7387 interfaceC7387, InterfaceC1348 interfaceC1348, InterfaceC5189<? super SnapFlingBehavior$fling$result$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = interfaceC7387;
        this.$this_fling = interfaceC1348;
    }

    private static final C6008 invokeSuspend$lambda$1(Ref$FloatRef ref$FloatRef, InterfaceC7387 interfaceC7387, float f) {
        float f2 = ref$FloatRef.element - f;
        ref$FloatRef.element = f2;
        interfaceC7387.invoke(Float.valueOf(f2));
        return C6008.f15084;
    }

    private static final C6008 invokeSuspend$lambda$4(Ref$FloatRef ref$FloatRef, InterfaceC7387 interfaceC7387, float f) {
        float f2 = ref$FloatRef.element - f;
        ref$FloatRef.element = f2;
        interfaceC7387.invoke(Float.valueOf(f2));
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SnapFlingBehavior$fling$result$1(null, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C9452> interfaceC5189) {
        return ((SnapFlingBehavior$fling$result$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC6017.m10769(obj);
            return obj;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
