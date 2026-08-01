package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5317 $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC5317 interfaceC5317, InterfaceC4356<? super FlowKt__DelayKt$sample$2$1$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = interfaceC5317;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(c5175, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == null) {
                return c5175;
            }
            ref$ObjectRef.element = null;
            InterfaceC5317 interfaceC5317 = this.$downstream;
            if (obj2 == AbstractC5218.f14807) {
                obj2 = null;
            }
            this.L$0 = null;
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
        return c5175;
    }
}
