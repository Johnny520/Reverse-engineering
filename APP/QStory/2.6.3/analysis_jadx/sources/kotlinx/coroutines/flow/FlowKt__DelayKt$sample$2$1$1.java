package kotlinx.coroutines.flow;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C5202;
import kotlinx.coroutines.channels.C5210;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.flow.internal.AbstractC5219;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "", "result", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)V"}, k = 3, mv = {2, 2, 0})
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ InterfaceC5199 $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC5199 interfaceC5199, InterfaceC4357<? super FlowKt__DelayKt$sample$2$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, interfaceC4357);
        flowKt__DelayKt$sample$2$1$1.L$0 = ((C5202) obj).f14791;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10287invokeWpGqRn0(((C5202) obj).f14791, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10287invokeWpGqRn0(Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(new C5202(obj), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z = r0 instanceof C5210;
        if (!z) {
            ref$ObjectRef.element = r0;
        }
        InterfaceC5199 interfaceC5199 = this.$ticker;
        if (z) {
            Throwable thM10273 = C5202.m10273(r0);
            if (thM10273 != null) {
                throw thM10273;
            }
            interfaceC5199.mo10256(new ChildCancelledException());
            ref$ObjectRef.element = AbstractC5219.f14805;
        }
        return C5176.f14739;
    }
}
