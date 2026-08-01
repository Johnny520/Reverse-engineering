package kotlinx.coroutines.flow;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5204;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.flow.internal.AbstractC5219;
import kotlinx.coroutines.selects.C5369;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downstream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ InterfaceC5319 $this_sample;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, InterfaceC5319 interfaceC5319, InterfaceC4357<? super FlowKt__DelayKt$sample$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$periodMillis = j;
        this.$this_sample = interfaceC5319;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC5318 interfaceC5318, InterfaceC4357<? super C5176> interfaceC4357) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, interfaceC4357);
        flowKt__DelayKt$sample$2.L$0 = interfaceC5401;
        flowKt__DelayKt$sample$2.L$1 = interfaceC5318;
        return flowKt__DelayKt$sample$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC5199 interfaceC5199M10277;
        InterfaceC5199 interfaceC5199;
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        InterfaceC5318 interfaceC5318 = (InterfaceC5318) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C5204 c5204M10277 = AbstractC5205.m10277(interfaceC5401, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1);
            ref$ObjectRef = new Ref$ObjectRef();
            interfaceC5199M10277 = AbstractC5205.m10277(interfaceC5401, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.$periodMillis, null), 1);
            interfaceC5199 = c5204M10277;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5199M10277 = (InterfaceC5199) this.L$4;
            ref$ObjectRef = (Ref$ObjectRef) this.L$3;
            interfaceC5199 = (InterfaceC5199) this.L$2;
            AbstractC5185.m10210(obj);
        }
        while (ref$ObjectRef.element != AbstractC5219.f14805) {
            C5369 c5369 = new C5369(getContext());
            c5369.m10421(interfaceC5199.mo10250(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, interfaceC5199M10277, null));
            c5369.m10421(interfaceC5199M10277.mo10260(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, interfaceC5318, null));
            this.L$0 = null;
            this.L$1 = interfaceC5318;
            this.L$2 = interfaceC5199;
            this.L$3 = ref$ObjectRef;
            this.L$4 = interfaceC5199M10277;
            this.L$5 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (c5369.m10419(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5176.f14739;
    }
}
