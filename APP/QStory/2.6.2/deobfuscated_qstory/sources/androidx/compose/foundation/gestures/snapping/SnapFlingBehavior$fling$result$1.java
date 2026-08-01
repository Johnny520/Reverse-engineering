package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.InterfaceC0507;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;", "", "Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;"}, k = 3, mv = {2, 1, 0})
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC6557 $onRemainingScrollOffsetUpdate;
    final /* synthetic */ InterfaceC0507 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC0460 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(AbstractC0460 abstractC0460, float f, InterfaceC6557 interfaceC6557, InterfaceC0507 interfaceC0507, InterfaceC4356<? super SnapFlingBehavior$fling$result$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = interfaceC6557;
        this.$this_fling = interfaceC0507;
    }

    private static final C5175 invokeSuspend$lambda$1(Ref$FloatRef ref$FloatRef, InterfaceC6557 interfaceC6557, float f) {
        float f2 = ref$FloatRef.element - f;
        ref$FloatRef.element = f2;
        interfaceC6557.invoke(Float.valueOf(f2));
        return C5175.f14739;
    }

    private static final C5175 invokeSuspend$lambda$4(Ref$FloatRef ref$FloatRef, InterfaceC6557 interfaceC6557, float f) {
        float f2 = ref$FloatRef.element - f;
        ref$FloatRef.element = f2;
        interfaceC6557.invoke(Float.valueOf(f2));
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SnapFlingBehavior$fling$result$1(null, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C8631> interfaceC4356) {
        return ((SnapFlingBehavior$fling$result$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC5184.m10206(obj);
            return obj;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
