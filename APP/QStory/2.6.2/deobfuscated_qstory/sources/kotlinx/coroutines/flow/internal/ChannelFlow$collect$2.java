package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelFlow$collect$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5317 $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5216 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(InterfaceC5317 interfaceC5317, AbstractC5216 abstractC5216, InterfaceC4356<? super ChannelFlow$collect$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$collector = interfaceC5317;
        this.this$0 = abstractC5216;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, interfaceC4356);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ChannelFlow$collect$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC5317 interfaceC5317 = this.$collector;
        InterfaceC5198 interfaceC5198M10291 = this.this$0.m10291(interfaceC5400);
        this.L$0 = null;
        this.label = 1;
        Object objM10334 = AbstractC5321.m10334(interfaceC5317, interfaceC5198M10291, true, this);
        if (objM10334 != coroutineSingletons) {
            objM10334 = c5175;
        }
        return objM10334 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
