package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {Opcodes.USHR_INT_LIT8}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC5317 $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(InterfaceC5317 interfaceC5317, Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC4356<? super FlowKt__DelayKt$debounceInternal$1$3$1> interfaceC4356) {
        super(1, interfaceC4356);
        this.$downstream = interfaceC5317;
        this.$lastValue = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5317 interfaceC5317 = this.$downstream;
            C4484 c4484 = AbstractC5218.f14807;
            Object obj2 = this.$lastValue.element;
            if (obj2 == c4484) {
                obj2 = null;
            }
            this.label = 1;
            if (interfaceC5317.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        this.$lastValue.element = null;
        return C5175.f14739;
    }
}
