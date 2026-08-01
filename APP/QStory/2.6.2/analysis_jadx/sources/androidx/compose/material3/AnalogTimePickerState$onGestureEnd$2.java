package androidx.compose.material3;

import androidx.compose.animation.core.C0346;
import androidx.compose.animation.core.InterfaceC0349;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {804}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;", "", "Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;", "<anonymous>", "()Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;"}, k = 3, mv = {2, 0, 0})
final class AnalogTimePickerState$onGestureEnd$2 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ AbstractC1179 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$onGestureEnd$2(AbstractC1179 abstractC1179, float f, InterfaceC0349 interfaceC0349, InterfaceC4356<? super AnalogTimePickerState$onGestureEnd$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.$end = f;
        this.$animationSpec = interfaceC0349;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new AnalogTimePickerState$onGestureEnd$2(null, this.$end, this.$animationSpec, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C0346> interfaceC4356) {
        return ((AnalogTimePickerState$onGestureEnd$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
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
            return obj;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
