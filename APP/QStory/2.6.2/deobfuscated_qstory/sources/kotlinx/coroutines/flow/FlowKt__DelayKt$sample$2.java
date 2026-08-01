package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5203;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.selects.C5368;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downstream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ InterfaceC5318 $this_sample;
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
    public FlowKt__DelayKt$sample$2(long j, InterfaceC5318 interfaceC5318, InterfaceC4356<? super FlowKt__DelayKt$sample$2> interfaceC4356) {
        super(3, interfaceC4356);
        this.$periodMillis = j;
        this.$this_sample = interfaceC5318;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC5317 interfaceC5317, InterfaceC4356<? super C5175> interfaceC4356) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, interfaceC4356);
        flowKt__DelayKt$sample$2.L$0 = interfaceC5400;
        flowKt__DelayKt$sample$2.L$1 = interfaceC5317;
        return flowKt__DelayKt$sample$2.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC5198 interfaceC5198M10273;
        InterfaceC5198 interfaceC5198;
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        InterfaceC5317 interfaceC5317 = (InterfaceC5317) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C5203 c5203M10273 = AbstractC5204.m10273(interfaceC5400, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1);
            ref$ObjectRef = new Ref$ObjectRef();
            interfaceC5198M10273 = AbstractC5204.m10273(interfaceC5400, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.$periodMillis, null), 1);
            interfaceC5198 = c5203M10273;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5198M10273 = (InterfaceC5198) this.L$4;
            ref$ObjectRef = (Ref$ObjectRef) this.L$3;
            interfaceC5198 = (InterfaceC5198) this.L$2;
            AbstractC5184.m10206(obj);
        }
        while (ref$ObjectRef.element != AbstractC5218.f14805) {
            C5368 c5368 = new C5368(getContext());
            c5368.m10417(interfaceC5198.mo10247(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, interfaceC5198M10273, null));
            c5368.m10417(interfaceC5198M10273.mo10256(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, interfaceC5317, null));
            this.L$0 = null;
            this.L$1 = interfaceC5317;
            this.L$2 = interfaceC5198;
            this.L$3 = ref$ObjectRef;
            this.L$4 = interfaceC5198M10273;
            this.L$5 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (c5368.m10415(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5175.f14739;
    }
}
