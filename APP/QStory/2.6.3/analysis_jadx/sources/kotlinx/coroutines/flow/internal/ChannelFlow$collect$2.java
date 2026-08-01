package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelFlow$collect$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5318 $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5217 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(InterfaceC5318 interfaceC5318, AbstractC5217 abstractC5217, InterfaceC4357<? super ChannelFlow$collect$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$collector = interfaceC5318;
        this.this$0 = abstractC5217;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, interfaceC4357);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ChannelFlow$collect$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC5318 interfaceC5318 = this.$collector;
        InterfaceC5199 interfaceC5199M10295 = this.this$0.m10295(interfaceC5401);
        this.L$0 = null;
        this.label = 1;
        Object objM10338 = AbstractC5322.m10338(interfaceC5318, interfaceC5199M10295, true, this);
        if (objM10338 != coroutineSingletons) {
            objM10338 = c5176;
        }
        return objM10338 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
