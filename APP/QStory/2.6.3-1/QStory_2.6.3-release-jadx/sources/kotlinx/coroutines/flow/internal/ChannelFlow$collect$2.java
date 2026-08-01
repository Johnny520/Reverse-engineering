package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m556f = "ChannelFlow.kt", m557l = {119}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelFlow$collect$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6150 $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC6049 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(InterfaceC6150 interfaceC6150, AbstractC6049 abstractC6049, InterfaceC5189<? super ChannelFlow$collect$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$collector = interfaceC6150;
        this.this$0 = abstractC6049;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, interfaceC5189);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChannelFlow$collect$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC6150 interfaceC6150 = this.$collector;
        InterfaceC6031 interfaceC6031M10854 = this.this$0.m10854(interfaceC6233);
        this.L$0 = null;
        this.label = 1;
        Object objM10897 = AbstractC6154.m10897(interfaceC6150, interfaceC6031M10854, true, this);
        if (objM10897 != coroutineSingletons) {
            objM10897 = c6008;
        }
        return objM10897 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
