package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0900;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m556f = "Channels.kt", m557l = {39}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Object $element;
    final /* synthetic */ InterfaceC6032 $this_trySendBlocking;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(InterfaceC6032 interfaceC6032, Object obj, InterfaceC5189<? super ChannelsKt__ChannelsKt$trySendBlocking$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_trySendBlocking = interfaceC6032;
        this.$element = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, interfaceC5189);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6034> interfaceC5189) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM723;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object c6041 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6032 interfaceC6032 = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC6032.mo8992(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            objM723 = Result.m9304constructorimpl(c6041);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (!Result.m9311isSuccessimpl(objM723)) {
            c6041 = new C6041(Result.m9307exceptionOrNullimpl(objM723));
        }
        return new C6034(c6041);
    }
}
