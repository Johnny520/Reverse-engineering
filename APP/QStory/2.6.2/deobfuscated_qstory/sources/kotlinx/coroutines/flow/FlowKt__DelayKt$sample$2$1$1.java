package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C5201;
import kotlinx.coroutines.channels.C5209;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "", "result", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)V"}, k = 3, mv = {2, 2, 0})
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ InterfaceC5198 $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC5198 interfaceC5198, InterfaceC4356<? super FlowKt__DelayKt$sample$2$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = interfaceC5198;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, interfaceC4356);
        flowKt__DelayKt$sample$2$1$1.L$0 = ((C5201) obj).f14791;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10283invokeWpGqRn0(((C5201) obj).f14791, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10283invokeWpGqRn0(Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(new C5201(obj), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z = r0 instanceof C5209;
        if (!z) {
            ref$ObjectRef.element = r0;
        }
        InterfaceC5198 interfaceC5198 = this.$ticker;
        if (z) {
            Throwable thM10269 = C5201.m10269(r0);
            if (thM10269 != null) {
                throw thM10269;
            }
            interfaceC5198.mo10252(new ChildCancelledException());
            ref$ObjectRef.element = AbstractC5218.f14805;
        }
        return C5175.f14739;
    }
}
