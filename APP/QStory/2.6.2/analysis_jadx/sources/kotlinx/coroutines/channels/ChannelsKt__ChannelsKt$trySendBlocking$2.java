package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0053;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Object $element;
    final /* synthetic */ InterfaceC5199 $this_trySendBlocking;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(InterfaceC5199 interfaceC5199, Object obj, InterfaceC4356<? super ChannelsKt__ChannelsKt$trySendBlocking$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_trySendBlocking = interfaceC5199;
        this.$element = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, interfaceC4356);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5201> interfaceC4356) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM162;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object c5208 = C5175.f14739;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC5199 interfaceC5199 = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC5199.mo8443(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            objM162 = Result.m8755constructorimpl(c5208);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (!Result.m8762isSuccessimpl(objM162)) {
            c5208 = new C5208(Result.m8758exceptionOrNullimpl(objM162));
        }
        return new C5201(c5208);
    }
}
