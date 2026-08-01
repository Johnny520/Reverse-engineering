package androidx.compose.material3;

import androidx.compose.animation.core.C0346;
import androidx.compose.animation.core.InterfaceC0349;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", l = {754}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;", "", "Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;", "<anonymous>", "()Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;"}, k = 3, mv = {2, 0, 0})
final class AnalogTimePickerState$animateToCurrent$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ AbstractC1179 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$animateToCurrent$2(AbstractC1179 abstractC1179, float f, InterfaceC0349 interfaceC0349, InterfaceC4357<? super AnalogTimePickerState$animateToCurrent$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$end = f;
        this.$animationSpec = interfaceC0349;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new AnalogTimePickerState$animateToCurrent$2(null, this.$end, this.$animationSpec, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C0346> interfaceC4357) {
        return ((AnalogTimePickerState$animateToCurrent$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
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
            AbstractC5185.m10210(obj);
            return obj;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
