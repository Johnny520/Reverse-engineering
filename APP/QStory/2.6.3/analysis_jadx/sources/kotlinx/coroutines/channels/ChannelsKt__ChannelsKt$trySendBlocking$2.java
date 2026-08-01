package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0053;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Object $element;
    final /* synthetic */ InterfaceC5200 $this_trySendBlocking;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(InterfaceC5200 interfaceC5200, Object obj, InterfaceC4357<? super ChannelsKt__ChannelsKt$trySendBlocking$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_trySendBlocking = interfaceC5200;
        this.$element = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, interfaceC4357);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5202> interfaceC4357) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM163;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object c5209 = C5176.f14739;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC5200 interfaceC5200 = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC5200.mo8433(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            objM163 = Result.m8745constructorimpl(c5209);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (!Result.m8752isSuccessimpl(objM163)) {
            c5209 = new C5209(Result.m8748exceptionOrNullimpl(objM163));
        }
        return new C5202(c5209);
    }
}
